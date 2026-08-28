public class gmv extends gmj<chu, gtg, fxa> {
   private static final ale a = ale.b("textures/entity/camel/camel.png");

   public gmv(gno.a $$0) {
      super($$0, new fxa($$0.a(gap.H)), new fxa($$0.a(gap.I)), 0.7F);
   }

   public ale a(gtg $$0) {
      return a;
   }

   public gtg a() {
      return new gtg();
   }

   public void a(chu $$0, gtg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
      $$1.b = $$0.bX();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.ce);
      $$1.e.a($$0.cf);
      $$1.f.a($$0.cg);
      $$1.g.a($$0.ch);
      $$1.h.a($$0.ci);
   }
}
