<%@include file="/WEB-INF/views/includes/includes.jsp"%>

<!-- Sidebar -->
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="index.html">
		<div class="sidebar-brand-icon rotate-n-15">
			<i class="fas fa-theater-masks"></i>
		</div>
		<div class="sidebar-brand-text mx-3">Calev Devises</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<c:url value="blank/" var="blank"></c:url>
	<li class="nav-item"><a class="nav-link" href="index.html"> <i
			class="fa fa-dashboard fa-fw"></i> <fmt:message
				key="common.dashboard" />
	</a></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading">Menu</div>

	<!-- Nav Item - Pages Collapse Menu -->
	<!--       <li class="nav-item"> -->
	<!--       <a class="nav-link" href="../salarie"> -->
	<!--       <i class="fas fa-child"></i> -->
	<!--       <span>Salari�s</span> </li> -->
	<!--       </a> -->
	<div>
<c:url value="/salarie" var="salarie"/>

</div>
	<li class="nav-item"><a class="nav-link" href="${salarie }"> <i
			class="fas fa-child"></i> <fmt:message key="common.salarie" />
	</a></li>
	
<div>
<c:url value="/employeur" var="employeur"/>
</div>
	<li class="nav-item"><a class="nav-link" href="${employeur }"> <i
			class="fas fa-user-tie"></i> <fmt:message key="common.employeur" />
	</a></li>
	
<div>
<c:url value="/retraite" var="retraite"/>
</div>
	<li class="nav-item"><a class="nav-link" href="${retraite }"> 
			<i class="fab fa-jenkins"></i> <fmt:message key="common.retraite" />
	</a></li>
	
<div>
<c:url value="/salaire" var="salaire"/>
</div>
	<li class="nav-item"><a class="nav-link" href="${salaire }"> 
			<i class="fas fa-dollar-sign"></i> <fmt:message key="common.salaire" />
	</a></li>

<div>
<c:url value="/remunerationbrute" var="remunerationbrute"/>
</div>
	<li class="nav-item"><a class="nav-link" href="${remBrute }"> 
			<i class="fas fa-hand-holding-usd"></i> <fmt:message
				key="commmon.remunerationbrute" />
	</a></li>
	
	
<div>
<c:url value="/sante" var="sante"/>
</div>
	<li class="nav-item"><a class="nav-link" href="${sante }"> 
			<i class="fas fa-first-aid"></i> <fmt:message key="common.sant�" />
	</a></li>



	<!--       <li class="nav-item"> -->
	<!--       <a class="nav-link" href="../employeur"> -->
	<!--    <i class="fas fa-user-tie"></i> -->
	<!--       <span>Employeur</span> </li> -->
	<!--       </a>  -->



	<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
		data-parent="#accordionSidebar">
		<div class="bg-white py-2 collapse-inner rounded">
			<h6 class="collapse-header">Custom Components:</h6>
			<a class="collapse-item" href="buttons.html">Buttons</a> <a
				class="collapse-item" href="cards.html">Cards</a>
		</div>
	</div>
	</li>

	<!-- Nav Item - Utilities Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseUtilities"
		aria-expanded="true" aria-controls="collapseUtilities"> <i
			class="fas fa-fw fa-wrench"></i> <span>Utilities</span>
	</a>
		<div id="collapseUtilities" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Custom Utilities:</h6>
				<a class="collapse-item" href="utilities-color.html">Colors</a> <a
					class="collapse-item" href="utilities-border.html">Borders</a> <a
					class="collapse-item" href="utilities-animation.html">Animations</a>
				<a class="collapse-item" href="utilities-other.html">Other</a>
			</div>
		</div></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading">Addons</div>

	<!-- Nav Item - Pages Collapse Menu -->
	<li class="nav-item active"><a class="nav-link" href="#"
		data-toggle="collapse" data-target="#collapsePages"
		aria-expanded="true" aria-controls="collapsePages"> <i
			class="fas fa-fw fa-folder"></i> <span>Rubrique</span>
	</a>
		<div id="collapsePages" class="collapse show"
			aria-labelledby="headingPages" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Login Screens:</h6>
				<a class="collapse-item" href="login.html">Login</a> <a
					class="collapse-item" href="register.html">Register</a> <a
					class="collapse-item" href="forgot-password.html">Forgot
					Password</a>
				<div class="collapse-divider"></div>
				<h6 class="collapse-header">Other Pages:</h6>
				<a class="collapse-item" href="404.html">404 Page</a> <a
					class="collapse-item active" href="blank.html">Blank Page</a>
			</div>
		</div></li>

	<!-- Nav Item - Charts -->



	<!-- Nav Item - Tables -->
	<li class="nav-item"><a class="nav-link" href="tables.html"> <i
			class="fas fa-fw fa-table"></i> <span>Tables</span></a></li>

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>
<!-- End of Sidebar -->