public class gvn extends gvb<cks, hcb, gff> {
   private static final alg a = alg.b("textures/entity/camel/camel.png");

   public gvn(gwh.a $$0) {
      super($$0, new gff($$0.a(gjb.M)), new gff($$0.a(gjb.N)), 0.7F);
      this.a(new hax<>(this, $$0.h(), hld.d.i, $$0x -> $$0x.a, new gfg($$0.a(gjb.O)), new gfg($$0.a(gjb.P))));
   }

   public alg a(hcb $$0) {
      return a;
   }

   public hcb a() {
      return new hcb();
   }

   public void a(cks $$0, hcb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwp.h).v();
      $$1.b = $$0.ca();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.bM);
      $$1.e.a($$0.bN);
      $$1.f.a($$0.bO);
      $$1.g.a($$0.bP);
      $$1.h.a($$0.bQ);
   }
}
