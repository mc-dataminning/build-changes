public class gxs extends gws<cni, hcz> {
   private static final alg a = alg.b("textures/entity/lead_knot.png");
   private final ghc g;

   public gxs(gwt.a $$0) {
      super($$0);
      this.g = new ghc($$0.a(gjn.bD));
   }

   @Override
   public void a(hcz $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      fkc $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hja.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hcz d() {
      return new hcz();
   }
}
