public class fyr extends fxn<cfi> {
   private static final agt a = new agt("textures/entity/llama/spit.png");
   private final fjs<cfi> f;

   public fyr(fxo.a $$0) {
      super($$0);
      this.f = new fjs<>($$0.a(flx.aw));
   }

   public void a(cfi $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aty.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aty.i($$2, $$0.O, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eph $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agt a(cfi $$0) {
      return a;
   }
}
