public class fvo<T extends bsu> extends fuj<T> {
   private static final String a = "body_front";
   private static final String b = "body_back";
   private final fxa f;
   private final fxa g;

   public fvo(fxa $$0) {
      this.f = $$0;
      this.g = $$0.b("body_back");
   }

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      int $$2 = 20;
      fxj $$3 = $$1.a("body_front", fxf.c().a(0, 0).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), fxc.a(0.0F, 20.0F, 0.0F));
      fxj $$4 = $$1.a("body_back", fxf.c().a(0, 13).a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F), fxc.a(0.0F, 20.0F, 8.0F));
      $$1.a("head", fxf.c().a(22, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fxc.a(0.0F, 20.0F, 0.0F));
      $$4.a("back_fin", fxf.c().a(20, 10).a(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F), fxc.a(0.0F, 0.0F, 8.0F));
      $$3.a("top_front_fin", fxf.c().a(2, 1).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F), fxc.a(0.0F, -4.5F, 5.0F));
      $$4.a("top_back_fin", fxf.c().a(0, 2).a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F), fxc.a(0.0F, -4.5F, -1.0F));
      $$1.a("right_fin", fxf.c().a(-4, 0).a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fxc.a(-1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fxf.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F), fxc.a(1.5F, 21.5F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      return fxg.a($$0, 32, 32);
   }

   @Override
   public fxa a() {
      return this.f;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      float $$7 = 1.0F;
      if (!$$0.be()) {
         $$6 = 1.3F;
         $$7 = 1.7F;
      }

      this.g.f = -$$6 * 0.25F * ayz.a($$7 * 0.6F * $$3);
   }
}
