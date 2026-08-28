public class gxb extends gwp<clp, hdq, ggu> {
   private static final alr a = alr.b("textures/entity/camel/camel.png");

   public gxb(gxv.a $$0) {
      super($$0, new ggu($$0.a(gkq.M)), new ggu($$0.a(gkq.N)), 0.7F);
      this.a(new hcm<>(this, $$0.h(), hmw.d.i, $$0x -> $$0x.a, new ggv($$0.a(gkq.O)), new ggv($$0.a(gkq.P))));
   }

   public alr a(hdq $$0) {
      return a;
   }

   public hdq a() {
      return new hdq();
   }

   public void a(clp $$0, hdq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bxo.h).v();
      $$1.b = $$0.bZ();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.bO);
      $$1.e.a($$0.bP);
      $$1.f.a($$0.bQ);
      $$1.g.a($$0.bR);
      $$1.h.a($$0.bS);
   }
}
