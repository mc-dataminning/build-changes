public class gvd extends gtl<coq, haw, geo> {
   private static final akv a = akv.b("textures/entity/wandering_trader.png");

   public gvd(gsf.a $$0) {
      super($$0, new geo($$0.a(gfd.dw)), 0.5F);
      this.a(new gvy<>(this, $$0.f()));
      this.a(new gvx<>(this));
   }

   public akv a(haw $$0) {
      return a;
   }

   public haw b() {
      return new haw();
   }

   public void a(coq $$0, haw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gza.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
   }
}
