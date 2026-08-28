public class gwj extends gvj<cmr, hbp> {
   private static final ale a = ale.b("textures/entity/lead_knot.png");
   private final gfv g;

   public gwj(gvk.a $$0) {
      super($$0);
      this.g = new gfv($$0.a(gif.bz));
   }

   @Override
   public void a(hbp $$0, fiq $$1, gpd $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      fiu $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hhp.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hbp d() {
      return new hbp();
   }
}
