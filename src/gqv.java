public class gqv extends gqj<cjn, gxj, gaw> {
   private static final alz a = alz.b("textures/entity/camel/camel.png");

   public gqv(grp.a $$0) {
      super($$0, new gaw($$0.a(gem.J)), new gaw($$0.a(gem.K)), 0.7F);
   }

   public alz a(gxj $$0) {
      return a;
   }

   public gxj a() {
      return new gxj();
   }

   public void a(cjn $$0, gxj $$1, float $$2) {
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
