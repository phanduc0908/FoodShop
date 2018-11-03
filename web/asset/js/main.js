
/**************************
******  Responsive product ******
***************************/
$('.products .owl-carousel').owlCarousel({
    loop:true,
    margin:10,
    nav:true,
    responsive:{
        0:{
            items:1
        },
        425:{
            items:1
        },
        768:{
            items:2
        },
        992:{
            items:3
        }
    }
});
/**************************
******  Control button products ******
***************************/
$(document).ready(function(){
    var owl = $('#sp-noi-bat');
        owl.owlCarousel();
    $('.sp-noi-bat .next').click(function() {
        owl.trigger('next.owl.carousel');
    })
    $('.sp-noi-bat .prev').click(function() {
        owl.trigger('prev.owl.carousel');
    })

    // Control san pham moi nhat
    var owl_moi_nhat = $('#sp-moi-nhat');
        owl_moi_nhat.owlCarousel();
    $('.sp-moi-nhat .next').click(function() {
        owl_moi_nhat.trigger('next.owl.carousel');
    })
    $('.sp-moi-nhat .prev').click(function() {
        owl_moi_nhat.trigger('prev.owl.carousel');
    })
    // control owl mua nhieu trong tuan
    var owl_mua_nhieu = $('#muaNhieuTrongTuan');
        owl_mua_nhieu.owlCarousel();
    $('.mua-nhieu-trong-tuan .next').click(function() {
        owl_mua_nhieu.trigger('next.owl.carousel');
    })
    $('.mua-nhieu-trong-tuan .prev').click(function() {
        owl_mua_nhieu.trigger('prev.owl.carousel');
    })
})
/**************************
******  Responsive brand ******
***************************/
$('#brand-owl').owlCarousel({
    loop:true,
    margin:10,
    nav:false,
    responsive:{
        0   :{
            items:1
        },
        350:{
            items:2
        },
        600:{
            items:4
        },
        1000:{
            items:5
        },
        1200:{
            items:4
        }
    }
})

/**************************
******  Responsive products use owl-carousel ******
***************************/
$('#products-owl').owlCarousel({
    loop:true,
    margin:10,
    nav:false,
    responsive:{
        600:{
            items:6
        },
        1000:{
            items:6
        },
        1200:{
            items:6
        }
    }
})
/**************************
******  Toogle Add to cart ******
***************************/

/**************************
******  Validate form register ******
***************************/

    $(document).ready(function(){
        $('#registerForm').validate({
            rules:{
                sname:{
                    required:true,
                    minlength:8
                },
                address:{
                    required:true
                },
                phone:{
                    required:true,
                    digits:true,
                    minlength:9
                },
                username:{
                    required:true,
                    minlength:6
                },
                password:{
                    required:true
                }
            },
            messages:{
                sname:{
                    required:"Hãy nhập họ và tên",
                    minlength:"Độ dài phải lớn hơn 8"
                },
                address:{
                    required:"Hãy nhập địa chỉ"
                },
                phone:{
                    required:"Hãy nhập số điện thoại",
                    digits:"Số điện thoại không chính xác",
                    minlength:"Độ dài số điện thoại phải lớn hơn 8 ký tự"
                },
                username:{
                    required:"Hãy nhập họ và tên",
                    minlength:"Độ dài phải lớn hơn 6"
                },
                password:{
                    required:"Hãy nhập mật khẩu"
                }

            }
        })

        
    })
    $('#registerForm').submit(function(){
        if($(this).valid()){
            alert("Good");
        }
        return;
    });