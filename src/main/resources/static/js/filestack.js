"use strict";

$(async function () {

    import * as filestack from "filestack-js";
    const client = filestack.init(fileStackKey);
    await client.picker().open();


    $("#image").on("click", function (e) {
        print.console.log(e);
        e.preventDefault();
        client.picker({
            accept: ["image/*"],
            transformations: {
                circle: true,
                crop: true,
                rotate: true,
                force: true
            },
            onFileUploadFinished: function (file) {
                $("#image").val(file.url).submit();
                print.console.log(file.url);
            }
        }).open()
     });
});


// const client = filestack.init(API_KEY);
// client.picker().open();
//
// client.pick({
//     accept: 'image/*',
// }).then(function(result) {
//     // file url (plus mimetype, size and more)
//     // can be found inside the result object
//     console.log(result);
//     console.log("File url: " + result.filesUploaded[0].url);
// });
//
// client.pick({
//     accept: 'image/*',
//     onFileUploadFinished: function(file) {
//         // this will be called when file is uploaded
//         console.log(file);
//     }
// })