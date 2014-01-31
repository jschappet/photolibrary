
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object photoviewer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[com.avaje.ebean.Page[Photo],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(photos: com.avaje.ebean.Page[Photo]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""
<html>
    <head>
        <title>Photo Library</title>


	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.47*/routes/*8.53*/.Assets.at("bootstrap/dist/css/bootstrap.min.css"))),format.raw/*8.103*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("bootstrap/dist/css/bootstrap-theme.min.css"))),format.raw/*9.109*/("""">
	

	<!-- Latest compiled and minified JavaScript -->
	<script src=""""),_display_(Seq[Any](/*13.16*/routes/*13.22*/.Assets.at("bootstrap/dist/js/bootstrap.min.js"))),format.raw/*13.70*/(""""></script>

	<!-- Add jQuery library -->
	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>



        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*20.59*/routes/*20.65*/.Assets.at("images/favicon.png"))),format.raw/*20.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*21.70*/routes/*21.76*/.Assets.at("stylesheets/main.css"))),format.raw/*21.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*22.46*/routes/*22.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*22.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*23.46*/routes/*23.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*23.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*24.46*/routes/*24.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*24.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*25.46*/routes/*25.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*25.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*26.46*/routes/*26.52*/.Assets.at("javascripts/main.js"))),format.raw/*26.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*27.46*/routes/*27.52*/.Application.javascriptRoutes)),format.raw/*27.81*/(""""></script>
    </head>
<body>

    <header>
        <hgroup>
            <h1>Photos</h1>
            <h2>Tasks over all Photos</h2>
        </hgroup>
    </header>
    
    <article  class="photo">
	"""),_display_(Seq[Any](/*39.3*/views/*39.8*/.html.photos.group("Main",photos.getList))),format.raw/*39.49*/("""
    </article>
</body>
</html>
"""))}
    }
    
    def render(photos:com.avaje.ebean.Page[Photo]): play.api.templates.HtmlFormat.Appendable = apply(photos)
    
    def f:((com.avaje.ebean.Page[Photo]) => play.api.templates.HtmlFormat.Appendable) = (photos) => apply(photos)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 09:42:15 CST 2014
                    SOURCE: /home/jimmy/git/playframework/samples/java/zentasks/app/views/photoviewer.scala.html
                    HASH: 708f36c8a0f88c18d1a261182ab990554d4a596c
                    MATRIX: 801->1|932->38|1114->185|1128->191|1200->241|1284->290|1298->296|1376->352|1483->423|1498->429|1568->477|1799->672|1814->678|1868->710|1976->782|1991->788|2048->822|2132->870|2147->876|2210->917|2303->974|2318->980|2386->1026|2479->1083|2494->1089|2559->1132|2652->1189|2667->1195|2730->1236|2823->1293|2838->1299|2893->1332|2986->1389|3001->1395|3052->1424|3288->1625|3301->1630|3364->1671
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|41->13|41->13|41->13|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|67->39|67->39|67->39
                    -- GENERATED --
                */
            