public class gff extends gda<haj> {
   private final ggc a;

   public gff(ggc $$0) {
      super($$0, gnh::g);
      this.a = $$0.b("tail");
   }

   public static ggi a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", ggh.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gge.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", ggh.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gge.a(0.0F, 22.0F, 0.0F));
      return ggi.a($$0, 16, 16);
   }

   public void a(haj $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * ayz.a(0.3F * $$0.u);
   }
}
