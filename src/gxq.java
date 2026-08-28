public class gxq extends gxe<clg, hef, ghj> {
   private static final alk a = alk.b("textures/entity/camel/camel.png");

   public gxq(gyk.a $$0) {
      super($$0, new ghj($$0.a(glf.M)), new ghj($$0.a(glf.N)), 0.7F);
      this.a(new hdb<>(this, $$0.h(), hni.d.i, $$0x -> $$0x.a, new ghk($$0.a(glf.O)), new ghk($$0.a(glf.P))));
   }

   public alk a(hef $$0) {
      return a;
   }

   public hef a() {
      return new hef();
   }

   public void a(clg $$0, hef $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxf.h).v();
      $$1.b = $$0.bZ();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.bO);
      $$1.e.a($$0.bP);
      $$1.f.a($$0.bQ);
      $$1.g.a($$0.bR);
      $$1.h.a($$0.bS);
   }
}
