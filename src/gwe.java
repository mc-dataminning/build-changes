public class gwe extends gvs<ckt, hct, gfw> {
   private static final alg a = alg.b("textures/entity/camel/camel.png");

   public gwe(gwy.a $$0) {
      super($$0, new gfw($$0.a(gjs.M)), new gfw($$0.a(gjs.N)), 0.7F);
      this.a(new hbp<>(this, $$0.h(), hlw.d.i, $$0x -> $$0x.a, new gfx($$0.a(gjs.O)), new gfx($$0.a(gjs.P))));
   }

   public alg a(hct $$0) {
      return a;
   }

   public hct a() {
      return new hct();
   }

   public void a(ckt $$0, hct $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bws.h).v();
      $$1.b = $$0.bY();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.bM);
      $$1.e.a($$0.bN);
      $$1.f.a($$0.bO);
      $$1.g.a($$0.bP);
      $$1.h.a($$0.bQ);
   }
}
