public class guc extends gqd<cit, gzu, gdo> {
   private static final alz a = alz.b("textures/entity/turtle/big_sea_turtle.png");

   public guc(grj.a $$0) {
      super($$0, new gdo($$0.a(geg.dl)), new gdo($$0.a(geg.dm)), 0.7F);
   }

   protected float a(gzu $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gzu b() {
      return new gzu();
   }

   public void a(cit $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public alz b(gzu $$0) {
      return a;
   }
}
