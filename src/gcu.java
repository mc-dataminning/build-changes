public class gcu extends gbl<gxu> {
   private final gen a;
   private final gen b;

   public gcu(gen $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", ges.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gep.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", ges.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gep.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", ges.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gep.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", ges.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gep.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", ges.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gep.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", ges.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gep.a(1.5F, 22.0F, -1.5F));
      return get.a($$0, 32, 32);
   }

   @Override
   public void a(gxu $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * bae.a($$0.p * 0.2F);
      this.a.g = 0.2F - 0.4F * bae.a($$0.p * 0.2F);
   }
}
