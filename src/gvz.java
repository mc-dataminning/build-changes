public class gvz extends gvn<ckw, hcn, gfr> {
   private static final alg a = alg.b("textures/entity/camel/camel.png");

   public gvz(gwt.a $$0) {
      super($$0, new gfr($$0.a(gjn.M)), new gfr($$0.a(gjn.N)), 0.7F);
      this.a(new hbj<>(this, $$0.h(), hlp.d.i, $$0x -> $$0x.a, new gfs($$0.a(gjn.O)), new gfs($$0.a(gjn.P))));
   }

   public alg a(hcn $$0) {
      return a;
   }

   public hcn a() {
      return new hcn();
   }

   public void a(ckw $$0, hcn $$1, float $$2) {
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
