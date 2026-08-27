public class ghu extends gfh<cky> {
   public static final ajt a = new ajt("textures/entity/trident.png");
   private final fsr f;

   public ghu(gfi.a $$0) {
      super($$0);
      this.f = new fsr($$0.a(ftl.bI));
   }

   public void a(cky $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(axk.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axk.i($$2, $$0.O, $$0.dE()) + 90.0F));
      ewm $$6 = ggg.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajt a(cky $$0) {
      return a;
   }
}
