public class gxd extends gvl<cqa, hcu, ggn> {
   private static final ald a = ald.b("textures/entity/wandering_trader.png");

   public gxd(guf.a $$0) {
      super($$0, new ggn($$0.a(ghc.dI)), 0.5F);
      this.a(new gxy<>(this, $$0.f()));
      this.a(new gxx<>(this));
   }

   public ald a(hcu $$0) {
      return a;
   }

   public hcu b() {
      return new hcu();
   }

   public void a(cqa $$0, hcu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      haz.a($$0, $$1, this.h);
      $$1.a = $$0.q() > 0;
   }
}
