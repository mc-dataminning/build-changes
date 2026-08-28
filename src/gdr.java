public class gdr extends gbm<gyt> {
   private final geo a;

   public gdr(geo $$0) {
      super($$0, glv::g);
      this.a = $$0.b("tail");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", get.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), geq.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", get.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), geq.a(0.0F, 22.0F, 0.0F));
      return geu.a($$0, 16, 16);
   }

   public void a(gyt $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * bae.a(0.3F * $$0.p);
   }
}
