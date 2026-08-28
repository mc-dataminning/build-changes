public class gzr extends gxz<crb, hfj, gix> {
   private static final alg a = alg.b("textures/entity/wandering_trader.png");

   public gzr(gwt.a $$0) {
      super($$0, new gix($$0.a(gjn.dM)), 0.5F);
      this.a(new ham<>(this, $$0.f()));
      this.a(new hal<>(this));
   }

   public alg a(hfj $$0) {
      return a;
   }

   public hfj b() {
      return new hfj();
   }

   public void a(crb $$0, hfj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hdo.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}
