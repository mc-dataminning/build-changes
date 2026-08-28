public class gyd extends gue<cjs, hdw, ghn> {
   private static final ale a = ale.b("textures/entity/turtle/big_sea_turtle.png");

   public gyd(gvk.a $$0) {
      super($$0, new ghn($$0.a(gif.dC)), new ghn($$0.a(gif.dD)), 0.7F);
   }

   protected float a(hdw $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.83F : $$1;
   }

   public hdw b() {
      return new hdw();
   }

   public void a(cjs $$0, hdw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.n_() && $$0.q();
   }

   public ale b(hdw $$0) {
      return a;
   }
}
