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
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/ui-lightness/jquery-ui.css" type="text/css"
    media="all" />

<link rel="stylesheet" type="text/css" href="css/haslearntit-login.css" media="screen" />

<script src="https://www.google.com/jsapi?key=ABQIAAAAUxUCpv_-wchVMBPB7LVQnRToRG0_EwnD46K32g5KL4I8_QPFRhSN0FGRemLxhNwTuWDoZMMht4aUrA"
    type="text/javascript"></script>

<script type="text/javascript">
	google.load("jquery", "1.7.1");
	google.load("jqueryui", "1.8.16");

	function OnLoad() {
		$(document).ready(function() {
			$("div.clickable").click(function() {
				window.location = $(this).attr("url");
			});

			$('.service-image').click(function() {
				$('#' + $(this).attr('id') + '-form').submit();
			});
		});
	}
	google.setOnLoadCallback(OnLoad);
</script>
</head>

<body>
    <div class="row">
        <div id="main">
            <header id="header" style="background: url('img/login-button-bg.jpg') repeat-x;">
                <div class="left">
                    <img src="img/login-logo.jpg" />
                </div>
                <div id="login-subtitle">
                    <span class="label">A new professional community portal<br />for those, who want to self-motivate to learn.
                    </span>
                </div>
                <div class="right">
                    <img src="img/login-button-right.jpg" />
                </div>
            </header>

            <div class="clear"></div>

            <section id="top">
                <div class="left" style="margin-left: 50px; margin-top: 20px;">
                    <h2 style="font-size: 18pt;">Are you learning something or plan to learn?</h2>
                    <ul>
                        <li>Create an account</li>
                        <li>Fill in your profile</li>
                        <li>Get motivated to learn</li>
                        <li>Compete with your friends while gaining new skills</li>
                        <li>Comment on your friends' new skills</li>
                    </ul>
                </div>
            </section>

            <section id="login" class="sidebar rounded"
                style="float: right; height: 270px; margin-right: 50px; margin-top: 10px; background-color: #eac79f; color: #555;">
                <p class="title">Sign in using your favourite service:</p>
                <div style="margin-left: 20px; width:200px; margin-bottom: 30px;">
                    <img id="facebook" class="service-image" src="img/social/facebook.png"/>
                    <img id="google" class="service-image" src="img/social/google.png"/>
                    <img id="openid" class="service-image" src="img/social/openid.png"/>
                    
                    <form id="google-form" action="j_spring_openid_security_check" method="post">                        
                        <input name="googleOpenId" type="hidden"/>
                        <input name="openid_identifier" type="hidden" value="https://www.google.com/accounts/o8/id"/>
                    </form>    
                    <form id="openid-form" action="j_spring_openid_security_check" method="post">                                                
                    </form>    
                    <form id="facebook-form" action="j_spring_openid_security_check" method="post">                                                
                    </form>    
                </div>
                <p class="title" style="margin-bottom: 0px;">OpenID mastah?:</p>
                <div style="margin-left: 20px; width:200px;">
                    <form action="j_spring_openid_security_check" method="post"  style="text-align: left; margin-top: 0px;">
                        <label for="openid_identifier">Gimme your OpenId:</label>
                        <input name="openid_identifier" maxlength="100" type="text" style="width:100%;"/>
                        <input type="submit" value="Sign in" style="float: right; width:60px;"/>
                    </form>                
                </div>

                <!--
                <form action="wall.html" style="text-align: left; margin-left: 20px;">
                    <label for="j_username">Your login:</label>
                    <input type="text" name="j_username" placeholder="username..." style="width:200px;"/><label for="j_password">Your password:</label>
                    <input type="password" name="j_password" placeholder="password..." style="width:200px;"/><br/><br/>
                    <input type='checkbox' name='_spring_security_remember_me'/> Remember me
                    <input type="submit" value="Sign in" style="float: right; margin-right: 23px; width:60px; top: -7px;"/>
                </form>
                -->
            </section>

            <div class="clear"></div>

            <section id="" class="sidebar rounded" style="float: left; height: 300px; margin-left: 200px;">
                <p class="title">Trends:</p>
                <ol>
                    <li><a href="#">JAVA cośtam</a><br />128 users</li>
                    <li><a href="#">MySQL cośtam</a><br />110 users</li>
                    <li><a href="#">HTML5 &amp; CSS3</a><br />98 users</li>
                    <li><a href="#">MySQL cośtam</a><br />110 users</li>
                    <li><a href="#">HTML5 &amp; CSS3</a><br />98 users</li>
                </ol>
            </section>
            <section class="sidebar rounded" style="float: left; height: 300px; margin-left: 20px;">
                <p class="title">Top 5 users:</p>
                <table>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/b36fee01ac1166d8dd46f3c2e7649be6" /></td>
                        <td class="name"><a href="#">Krzysiek Jelski</a> <br />1200 points</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/49f4023a979fe8e47c7b639697f86f00" /></td>
                        <td class="name"><a href="#">Jakub Nabrdalik</a><br />1023 points</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/69eec1703cac03acdd3f80637c6a2b7e" /></td>
                        <td class="name"><a href="#">Tomasz Bartczak</a><br />918 points</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/49f4023a979fe8e47c7b639697f86f00" /></td>
                        <td class="name"><a href="#">Jakub Nabrdalik</a><br />1023 points</td>
                    </tr>
                    <tr>
                        <td class="img"><img src="http://gravatar.com/avatar/69eec1703cac03acdd3f80637c6a2b7e" /></td>
                        <td class="name"><a href="#">Tomasz Bartczak</a><br />918 points</td>
                    </tr>
                </table>
            </section>
            
            <div class="clear"></div>
            <div id="footer" style="margin-left: 50px;">HasLearnt.it &copy; 2011</div>
            <div class="clear"></div>
        </div>
    </div>
</body>
</html>
