public class gtl extends gsz<cka, gzz, gdj> {
   private static final ald a = ald.b("textures/entity/camel/camel.png");

   public gtl(guf.a $$0) {
      super($$0, new gdj($$0.a(ghc.M)), new gdj($$0.a(ghc.N)), 0.7F);
      this.a(new gyv<>(this, $$0.h(), hiy.d.i, $$0x -> $$0x.a, new gdk($$0.a(ghc.O)), new gdk($$0.a(ghc.P))));
   }

   public ald a(gzz $$0) {
      return a;
   }

   public gzz a() {
      return new gzz();
   }

   public void a(cka $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwc.h).v();
      $$1.b = $$0.ca();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.bK);
      $$1.e.a($$0.bL);
      $$1.f.a($$0.bM);
      $$1.g.a($$0.bN);
      $$1.h.a($$0.bO);
   }
}
