public class fyn extends fxn<cay> {
   private static final agt a = new agt("textures/entity/lead_knot.png");
   private final fjp<cay> f;

   public fyn(fxo.a $$0) {
      super($$0);
      this.f = new fjp<>($$0.a(flx.at));
   }

   public void a(cay $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eph $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agt a(cay $$0) {
      return a;
   }
}
