public class guy extends gqz<cia, hat, gel> {
   private static final akv a = akv.b("textures/entity/turtle/big_sea_turtle.png");

   public guy(gsf.a $$0) {
      super($$0, new gel($$0.a(gfd.dq)), new gel($$0.a(gfd.dr)), 0.7F);
   }

   protected float a(hat $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hat b() {
      return new hat();
   }

   public void a(cia $$0, hat $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public akv b(hat $$0) {
      return a;
   }
}
