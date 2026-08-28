public class gfy extends gga {
   public gfy(gjo $$0) {
      super($$0);
   }

   public static gju a() {
      gjw $$0 = c();
      $$0.a()
         .a(
            "body",
            gjt.c()
               .a(20, 32)
               .a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new gjs(0.5F))
               .a(18, 4)
               .a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F)
               .a(52, 0)
               .a(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
            gjq.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
         );
      gjy $$1 = $$0.a()
         .a("head", gjt.c().a(0, 0).a(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F).a(8, 32).a(-3.0F, 0.99F, -7.0F, 6.0F, 3.0F, 2.0F), gjq.a(0.0F, 4.0F, -8.0F));
      $$1.a("right_horn", gjt.c().a(0, 32).a(-1.5F, -4.5F, -0.5F, 2.0F, 6.0F, 2.0F), gjq.a(-4.5F, -2.5F, -3.5F, 1.5708F, 0.0F, 0.0F));
      $$1.a("left_horn", gjt.c().a().a(0, 32).a(-1.5F, -3.0F, -0.5F, 2.0F, 6.0F, 2.0F), gjq.a(5.5F, -2.5F, -5.0F, 1.5708F, 0.0F, 0.0F));
      return gju.a($$0, 64, 64);
   }
}
