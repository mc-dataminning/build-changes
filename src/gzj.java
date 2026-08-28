public class gzj extends gyj<cny, her> {
   private static final alk a = alk.b("textures/entity/lead_knot.png");
   private final giu g;

   public gzj(gyk.a $$0) {
      super($$0);
      this.g = new giu($$0.a(glf.bD));
   }

   @Override
   public void a(her $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      flt $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hks.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public her d() {
      return new her();
   }
}
