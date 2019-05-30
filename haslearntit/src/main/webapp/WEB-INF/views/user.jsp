<%@ page contentType="text/html; charset=UTF-8" %><!DOCTYPE HTML>
<html>
<head>
<meta charset=utf-8>
<title>HasLearnt.it</title>

<script src="js/modernizr-1.7.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/reset.css" media="screen" title="html5doctor.com Reset Stylesheet" />
<link rel="stylesheet" type="text/css" href="css/css3.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/general.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/grid.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/forms.css" media="screen" />
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/ui-lightness/jquery-ui.css" type="text/css" media="all" />

<link rel="stylesheet" type="text/css" href="css/haslearntit.css" media="screen" />

<script src="https://www.google.com/jsapi?key=ABQIAAAAUxUCpv_-wchVMBPB7LVQnRToRG0_EwnD46K32g5KL4I8_QPFRhSN0FGRemLxhNwTuWDoZMMht4aUrA"
    type="text/javascript"></script>

<script type="text/javascript">
	google.load("jquery", "1.7.1");

	function OnLoad() {
		$(document).ready(function() {
			$("div.clickable").click(function() {
				window.location = $(this).attr("url");
			});

			$(".clickable-text").click(function(e) {
				var name = '#' + $(this).attr("dropdown-name");
				if ($(name).is(":visible")) {
					hideDiv($(name));
				} else {
					var position = $(this).offset();
					$(name).offset({
						top : position.top + 30,
						left : position.left
					});
					$(name).show();
				}
			});

			$(".dropdown-selection").click(function(e) {
				var selection = $(this).text();
				var dropdown = $(this).parent().parent().parent();
				$('#dropdown-' + dropdown.attr("id")).text(selection);
				hideDiv(dropdown);
			});
			
			$("#follow-button").click(function() {
				if ($(this).hasClass('follow-image')) {
    				$(this).removeClass('follow-image');
    				$(this).addClass('unfollow-image');
    				$('#follow-label').text('Unfollow!');
				} else {
    				$(this).removeClass('unfollow-image');
    				$(this).addClass('follow-image');
    				$('#follow-label').text('Follow!');					
				}
			});
		});
	}
	google.setOnLoadCallback(OnLoad);
	
	function hideDiv(div) {
		div.offset({
			top : 0,
			left : 0
		});
		div.hide();
	}
</script>
</head>

<body>
    <div class="row">
        <div id="main">
            <header id="page-header" style="background: url('img/button-bg.jpg') repeat-x;">
                <div class="left">
                    <img src="img/logo.jpg" />
                </div>
                <div id="search">
                    <span class="label">Search</span>
                    <div id="searchForm">
                        <form>
                            <input type="text" />
                        </form>
                    </div>
                </div>
                <div id="profile" class="clickable" url="/">
                <span class="label">Timeline</span>
                </div>
                <div id="logout" class="clickable" url="logout">
                    <span class="label">Logout</span>
                </div>
            </header>

            <div class="clear"></div>

            <section id="top">
                <div class="left" id="photo">
                    <img src="http://gravatar.com/avatar/0606d1268f2a8198d7fd601c7350acb9" />
                </div>
                <div class="left left-margin">
                    <h1 style="font-size: 26pt; margin-bottom: 10px; margin-top: 10px;">
                        Hello <span class="emphasized" style="font-size: 24pt">Pawel Lipinski</span>!
                    </h1>
                    <h2 style="font-size: 18pt;">has 512 points</h2>
                </div>
                <div class="right" id="main-follow-button">                    
                    <div id="follow-button" class="left rounded follow-image">                        
                        <p id="follow-label">
                            Follow!
                        </p>
                    </div>
                </div>
            </section>

            <div class="clear"></div>

            <section id="content">                
                <div id="wall" style="display: table; width: 100%">
                    <div class="entry-box">
                        <div class="entry-photo">
                            <img src="http://gravatar.com/avatar/0606d1268f2a8198d7fd601c7350acb9" />
                        </div>
                        <div style="display: table; float: left;">
                            <div class="entry-text">
                                <a href="#">Paweł Lipiński</a> has been learning <span class="emphasized">HTML &amp; CSS</span> today.<br />
                                It was easy and it took him 3 hours (of total 18 hours)<br /> He earned 15 points!
                            </div>
                            <div class="comment-box">
                                <a href="#" style="color: #aaa;" onclick="$('#comment-1').show();">Leave a comment</a>
                            </div>
                            <div id="comment-1" class="comment-box comments" style="display: table; display: none;">
                                <div class="comment-first-photo">
                                    <img src="http://gravatar.com/avatar/0606d1268f2a8198d7fd601c7350acb9" />
                                </div>
                                <div class="comment-first-text">
                                    <input type="text" placeholder="Leave a comment..." style="width: 300px; height: 25px;" />
                                </div>
                            </div>
                        </div>
                        <div class="entry-date">Wczoraj o 19:52</div>
                    </div>
                    <div class="entry-box">
                        <div class="entry-photo">
                            <img
                                src="http://gravatar.com/avatar/0606d1268f2a8198d7fd601c7350acb9" />
                        </div>
                        <div style="display: table; float: left;">
                            <div class="entry-text">
                                <a href="#">Paweł Lipiński</a> has been learning <span class="emphasized">Java</span> today.<br /> It
                                was hard and it took him 3 hours (of total 6 hours)<br /> He earned 6 points!
                            </div>
                            <div class="comment-box comments">
                                <div class="entry-photo">
                                    <img src="http://gravatar.com/avatar/0606d1268f2a8198d7fd601c7350acb9" />
                                </div>
                                <div class="entry-text comment-container">
                                    <a class="comment-author" href="#">Paweł Lipiński</a><br />
                                    <p class="comment-text">Ale się napracowałem!</p>
                                    <span class="entry-date">Dzisiaj, 7:15</span>
                                </div>
                                <div class="entry-hr"></div>
                                <div class="entry-photo">
                                    <img src="http://gravatar.com/avatar/49f4023a979fe8e47c7b639697f86f00" />
                                </div>
                                <div class="entry-text comment-container">
                                    <a class="comment-author" href="#">Jakub Nabrdalik</a><br />
                                    <p class="comment-text">Stary, spróbuj lepiej BASIC'a</p>
                                    <span class="entry-date">Dzisiaj, 7:15</span>
                                </div>
                                <div class="entry-hr"></div>
                                <div class="comment-input">
                                    <input type="text" placeholder="Leave a comment..." />
                                </div>
                            </div>
                        </div>
                        <div class="entry-date">Wczoraj o 19:52</div>
                    </div>
                    <div class="clear"></div>
                    <div id="footer">HasLearnt.it &copy; 2011</div>
                    <div class="clear"></div>
                </div>
            </section>
        </div>

        <section id="left-sidebar" class="sidebar rounded">
            <section>
                <p class="title">Following:</p>
                <table>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/b36fee01ac1166d8dd46f3c2e7649be6" /></td>
                        <td class="name"><a href="#">Krzysiek Jelski</a> <br />(1200)</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/49f4023a979fe8e47c7b639697f86f00" /></td>
                        <td class="name"><a href="#">Jakub Nabrdalik</a><br />(1023)</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/69eec1703cac03acdd3f80637c6a2b7e" /></td>
                        <td class="name"><a href="#">Tomasz Bartczak</a><br />(918)</td>
                    </tr>
                </table>
                <p class="center-horizontal">
                    <a href="#">See more...</a>
                </p>
            </section>
            <hr />
            <section>
                <p class="title">Followers:</p>
                <table>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/b36fee01ac1166d8dd46f3c2e7649be6" /></td>
                        <td class="name"><a href="#">Krzysiek Jelski</a> <br />(1200)</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/49f4023a979fe8e47c7b639697f86f00" /></td>
                        <td class="name"><a href="#">Jakub Nabrdalik</a><br />(1023)</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/69eec1703cac03acdd3f80637c6a2b7e" /></td>
                        <td class="name"><a href="#">Tomasz Bartczak</a><br />(918)</td>
                    </tr>
                </table>
                <p class="center-horizontal">
                    <a href="#">See more...</a>
                </p>
            </section>            
        </section>
        <section id="right-sidebar" class="sidebar rounded">
            <section>
                <p class="title">Skills:</p>
                <ol>
                    <li><a href="#">JAVA cośtam</a><br />128 points</li>
                    <li><a href="#">MySQL cośtam</a><br />110 points</li>
                    <li><a href="#">HTML5 &amp; CSS3</a><br />98 points</li>
                </ol>
            </section>
            <hr />
            <section style="padding-left: 10px; padding-bottom: 10px;">
                <p class="title">Statistics:</p>
                <span style="color: #777;">Training time:</span><br/>
                <span style="color: #999;"><span class="underline">This week:</span> 5 minutes</span><br/>
                <span style="color: #999;"><span class="underline">This month:</span> 15 minutes</span><br/>                
                <span style="color: #999;"><span class="underline">This year:</span> 15 hours</span><br/><br/>                
                <span style="color: #777;">Total time:</span><br/>
                <span style="color: #999;">20 days, 15 hours,<br/>15 minutes</span><br/>                               
            </section>
        </section>
    </div>
    <div class="dropdown" style="width: 190px; height: 55px;" id="choose-type">
        <ul style="list-style: none; line-height: 150%;">
            <li><a href="#" class="dropdown-selection">I've been learning</a></li>
            <li><a href="#" class="dropdown-selection">I've learnt</a></li>
        </ul>
    </div>
    <div class="dropdown" style="width: 120px; height: 80px;" id="choose-level">
        <ul style="list-style: none; line-height: 150%;">
            <li><a href="#" class="dropdown-selection">easy</a></li>
            <li><a href="#" class="dropdown-selection">medium</a></li>
            <li><a href="#" class="dropdown-selection">hard</a></li>
        </ul>
    </div>
    <div class="dropdown" style="width: 120px; height: 80px;" id="choose-time">
        <ul style="list-style: none; line-height: 150%;">
            <li><a href="#" class="dropdown-selection">minutes</a></li>
            <li><a href="#" class="dropdown-selection">hours</a></li>
            <li><a href="#" class="dropdown-selection">days</a></li>
        </ul>
    </div>
</body>
</html>
