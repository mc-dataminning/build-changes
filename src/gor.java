public class gor extends gof<cip, gve, fyv> {
   private static final alj a = alj.b("textures/entity/camel/camel.png");

   public gor(gpk.a $$0) {
      super($$0, new fyv($$0.a(gck.J)), new fyv($$0.a(gck.K)), 0.7F);
   }

   public alj a(gve $$0) {
      return a;
   }

   public gve a() {
      return new gve();
   }

   public void a(cip $$0, gve $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.ca();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.ce);
      $$1.e.a($$0.cf);
      $$1.f.a($$0.cg);
      $$1.g.a($$0.ch);
      $$1.h.a($$0.ci);
   }
}
