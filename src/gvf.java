public class gvf extends gut<cko, hbt, gey> {
   private static final alg a = alg.b("textures/entity/camel/camel.png");

   public gvf(gvz.a $$0) {
      super($$0, new gey($$0.a(git.M)), new gey($$0.a(git.N)), 0.7F);
      this.a(new hap<>(this, $$0.h(), hkv.d.i, $$0x -> $$0x.a, new gez($$0.a(git.O)), new gez($$0.a(git.P))));
   }

   public alg a(hbt $$0) {
      return a;
   }

   public hbt a() {
      return new hbt();
   }

   public void a(cko $$0, hbt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwn.h).v();
      $$1.b = $$0.ca();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.bL);
      $$1.e.a($$0.bM);
      $$1.f.a($$0.bN);
      $$1.g.a($$0.bO);
      $$1.h.a($$0.bP);
   }
}
