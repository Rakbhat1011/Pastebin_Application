//const apiBaseUrl = 'http://localhost:8080/api/pastes';
//
//document.addEventListener('DOMContentLoaded', (event) => {
//    loadPastes();
//});
//
//function createPaste() {
//    const content = document.getElementById('pasteContent').value;
//    const paste = { content: content, createdAt: new Date().toISOString() };
//
//    fetch(apiBaseUrl, {
//        method: 'POST',
//        headers: {
//            'Content-Type': 'application/json'
//        },
//        body: JSON.stringify(paste)
//    })
//    .then(response => response.json())
//    .then(data => {
//        alert('Paste created successfully');
//        document.getElementById('pasteContent').value = '';
//        loadPastes();
//    })
//    .catch(error => console.error('Error:', error));
//}
//
//function loadPastes() {
//    fetch(apiBaseUrl)
//    .then(response => response.json())
//    .then(data => {
//        const pasteList = document.getElementById('pasteList');
//        pasteList.innerHTML = '';
//        data.forEach(paste => {
//            const pasteDiv = document.createElement('div');
//            pasteDiv.className = 'paste';
//            pasteDiv.innerHTML = `
//                <p>${paste.content}</p>
//                <small>Created At: ${new Date(paste.createdAt).toLocaleString()}</small>
//            `;
//            pasteList.appendChild(pasteDiv);
//        });
//    })
//    .catch(error => console.error('Error:', error));
//}

//---------------------------
//const apiBaseUrl = 'http://localhost:8080/api/pastes';
//
//document.addEventListener('DOMContentLoaded', (event) => {
//    loadPastes();
//});
//
//function createPaste() {
//    const content = document.getElementById('pasteContent').value;
//    const paste = { content: content, createdAt: new Date().toISOString() };
//
//    fetch(apiBaseUrl, {
//        method: 'POST',
//        headers: {
//            'Content-Type': 'application/json'
//        },
//        body: JSON.stringify(paste)
//    })
//    .then(response => response.json())
//    .then(data => {
//        alert('Paste created successfully');
//        document.getElementById('pasteContent').value = '';
//        loadPastes();
//    })
//    .catch(error => console.error('Error:', error));
//}
//
//function loadPastes() {
//    fetch(apiBaseUrl)
//    .then(response => response.json())
//    .then(data => {
//        const pasteList = document.getElementById('pasteList');
//        pasteList.innerHTML = '';
//        data.forEach(paste => {
//            const pasteDiv = document.createElement('div');
//            pasteDiv.className = 'paste';
//            pasteDiv.innerHTML = `
//                <p>${paste.content}</p>
//                <small>Created At: ${new Date(paste.createdAt).toLocaleString()}</small>
//                <div class="paste-actions">
//                    <input type="text" id="updateContent-${paste.id}" placeholder="Update content">
//                    <button onclick="updatePaste(${paste.id})">Update</button>
//                    <button onclick="deletePaste(${paste.id})">Delete</button>
//                </div>
//            `;
//            pasteList.appendChild(pasteDiv);
//        });
//    })
//    .catch(error => console.error('Error:', error));
//}
//
//function updatePaste(id) {
//    const content = document.getElementById(`updateContent-${id}`).value;
//    const paste = { content: content, createdAt: new Date().toISOString() };
//
//    fetch(`${apiBaseUrl}/${id}`, {
//        method: 'PUT',
//        headers: {
//            'Content-Type': 'application/json'
//        },
//        body: JSON.stringify(paste)
//    })
//    .then(response => response.json())
//    .then(data => {
//        alert('Paste updated successfully');
//        loadPastes();
//    })
//    .catch(error => console.error('Error:', error));
//}
//
//function deletePaste(id) {
//    fetch(`${apiBaseUrl}/${id}`, {
//        method: 'DELETE'
//    })
//    .then(() => {
//        alert('Paste deleted successfully');
//        loadPastes();
//    })
//    .catch(error => console.error('Error:', error));
//}
