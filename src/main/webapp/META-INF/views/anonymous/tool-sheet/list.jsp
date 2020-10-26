<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.toolSheet.list.label.title" path="title" />
	<acme:list-column code="anonymous.toolSheet.list.label.description" path="description" />
	<acme:list-column code="anonymous.toolSheet.list.label.providerName" path="providerName" />
	<acme:list-column code="anonymous.toolSheet.list.label.rating" path="rating" />
</acme:list>
