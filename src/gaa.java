public class gaa extends fxn<cfv> {
   public static final agt a = new agt("textures/entity/trident.png");
   private final fld f;

   public gaa(fxo.a $$0) {
      super($$0);
      this.f = new fld($$0.a(flx.bF));
   }

   public void a(cfv $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aty.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aty.i($$2, $$0.O, $$0.dE()) + 90.0F));
      eph $$6 = fym.c($$4, this.f.a(this.a($$0)), false, $$0.I());
      this.f.a($$3, $$6, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agt a(cfv $$0) {
      return a;
   }
}
