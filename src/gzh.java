public class gzh extends gyh<cnw, hep> {
   private static final ali a = ali.b("textures/entity/lead_knot.png");
   private final gis g;

   public gzh(gyi.a $$0) {
      super($$0);
      this.g = new gis($$0.a(gld.bD));
   }

   @Override
   public void a(hep $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      flr $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hkq.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hep d() {
      return new hep();
   }
}
