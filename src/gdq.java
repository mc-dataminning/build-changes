public class gdq extends gbl<gys> {
   private final gen a;

   public gdq(gen $$0) {
      super($$0, glu::g);
      this.a = $$0.b("tail");
   }

   public static get a() {
      gev $$0 = new gev();
      gex $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", ges.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gep.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", ges.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gep.a(0.0F, 22.0F, 0.0F));
      return get.a($$0, 16, 16);
   }

   public void a(gys $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * bae.a(0.3F * $$0.p);
   }
}
