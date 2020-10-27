<%--
	- form.jsp
	-
	- Copyright (c) 2019 Rafael Corchuelo.
	-
	- In keeping with the traditional purpose of furthering education and research, it is
	- the policy of the copyright owner to permit non-commercial use and redistribution of
	- this software. It has been tested carefully, but it is not guaranteed for any particular
	- purposes.  The copyright owner does not offer any warranties or representations, nor do
	- they accept any liabilities with respect to them.
	--%>
	

	<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>
	

	<div>
	<acme:message code="administrator.chart.form.label.numberOfNewsGroupedByCategory"/>
		<canvas id="numberOfNewsGroupedByCategory"></canvas>
	</div>
	<br></br>
	<div>
	<acme:message code="administrator.chart.form.label.ratioOfWarningNewsVersusRestOfit"/>
	    <canvas id="ratioOfWarningNewsVersusRestOfit"></canvas>
	</div>
	<br></br>
	<div>
	<acme:message code="administrator.chart.form.label.numberOfAdvertisementsGroupedByDiscount"/>
		<canvas id="numberOfAdvertisementsGroupedByDiscount"></canvas>
	</div>
	<br></br>
	

	<script type ="text/javascript">
	 $(document).ready(function(){
		 var CanvasCompany = document.getElementById("numberOfNewsGroupedByCategory");
		 Chart.defaults.global.defaultFontFamily = "Modeka";
		 Chart.defaults.global.defaultFontSize = 15;
		 
		 var DataCompany = {
				 labels : [
					 <jstl:forEach items = "${numberOfNewsGroupedByCategory}" var="item">
					 "<jstl:out value= "${item[0]}" />" ,
					 </jstl:forEach>
				 ],
				 datasets:[
					 {
						 data: [
							 <jstl:forEach items= "${numberOfNewsGroupedByCategory}" var="item">
							 "<jstl:out value = "${item[1]}" />" ,
							 </jstl:forEach>
						 ],
						 backgroundColor :["blue", "red", "yellow", "green", "purple"]
					 }
				 ]
		 };
		 var pieChartCompany = new Chart(CanvasCompany, {
			 type: 'pie',
			 data: DataCompany
		 });
	 });
	 
	 $(document).ready(function(){
		 var CanvasInvestor = document.getElementById("ratioOfWarningNewsVersusRestOfit");
		 Chart.defaults.global.defaultFontFamily = "Modeka";
		 Chart.defaults.global.defaultFontSize = 15;
		 
		 var DataInvestor = {
				 labels : [
					 <jstl:forEach items = "${ratioOfWarningNewsVersusRestOfit}" var="item">
					 "<jstl:out value= "${item[0]}" />" ,
					 </jstl:forEach>
				 ],
				 datasets:[
					 {
						 data: [
							 <jstl:forEach items= "${ratioOfWarningNewsVersusRestOfit}" var="item">
							 "<jstl:out value = "${item[1]}" />" ,
							 </jstl:forEach>
						 ],
						 backgroundColor :["blue", "red", "yellow", "green", "purple"]
					 }
				 ]
		 };
		 var pieChartInvestor = new Chart(CanvasInvestor, {
			 type: 'pie',
			 data: DataInvestor
		 });
	 });
	 
	 $(document).ready(function(){
		 var CanvasInvestor = document.getElementById("numberOfAdvertisementsGroupedByDiscount");
		 Chart.defaults.global.defaultFontFamily = "Modeka";
		 Chart.defaults.global.defaultFontSize = 15;
		 
		 var DataInvestor = {
				 labels : [
					 <jstl:forEach items = "${numberOfAdvertisementsGroupedByDiscount}" var="item">
					 "<jstl:out value= "${item[0]}" />" ,
					 </jstl:forEach>
				 ],
				 datasets:[
					 {
						 data: [
							 <jstl:forEach items= "${numberOfAdvertisementsGroupedByDiscount}" var="item">
							 "<jstl:out value = "${item[1]}" />" ,
							 </jstl:forEach>
						 ],
						 backgroundColor :["blue", "red", "yellow", "green", "purple"]
					 }
				 ]
		 };
		 var pieChartInvestor = new Chart(CanvasInvestor, {
			 type: 'pie',
			 data: DataInvestor
		 });
	 });
	 
	</script>

