/**
 * 
 */
 	const searchForm = document.getElementById("searchForm");
	const searchFormInA = document.getElementById("searchFormInA");
	
	searchFormInA.addEventListener("click", function(e){
		e.preventDefault();
				
		searchForm.submit();
	});


	const pageForm = document.getElementById("pageForm");
	const changePage = document.querySelectorAll(".changePage");
	const pageFormPageNum = document.querySelector("#pageForm > input");
	
	for(let i=0; i<changePage.length; i++){
		changePage[i].addEventListener("click", function(e){
			e.preventDefault();
			pageFormPageNum.value = changePage[i].getAttribute("href");
			pageForm.submit();
		})
	}	
