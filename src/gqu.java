public class gqu extends gqi<cjn, gxi, gav> {
   private static final alz a = alz.b("textures/entity/camel/camel.png");

   public gqu(gro.a $$0) {
      super($$0, new gav($$0.a(gel.J)), new gav($$0.a(gel.K)), 0.7F);
   }

   public alz a(gxi $$0) {
      return a;
   }

   public gxi a() {
      return new gxi();
   }

   public void a(cjn $$0, gxi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.ca();
      $$1.c = Math.max((float)$$0.c() - $$2, 0.0F);
      $$1.d.a($$0.cf);
      $$1.e.a($$0.cg);
      $$1.f.a($$0.ch);
      $$1.g.a($$0.ci);
      $$1.h.a($$0.cj);
   }
}
