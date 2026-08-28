public class gqp extends gqd<cjj, gxd, gaq> {
   private static final alz a = alz.b("textures/entity/camel/camel.png");

   public gqp(grj.a $$0) {
      super($$0, new gaq($$0.a(geg.J)), new gaq($$0.a(geg.K)), 0.7F);
   }

   public alz a(gxd $$0) {
      return a;
   }

   public gxd a() {
      return new gxd();
   }

   public void a(cjj $$0, gxd $$1, float $$2) {
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
