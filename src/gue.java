public class gue extends gqf<cip, gzw, gdq> {
   private static final alp a = alp.b("textures/entity/turtle/big_sea_turtle.png");

   public gue(grl.a $$0) {
      super($$0, new gdq($$0.a(gei.dq)), new gdq($$0.a(gei.dr)), 0.7F);
   }

   protected float a(gzw $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gzw b() {
      return new gzw();
   }

   public void a(cip $$0, gzw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bj() && $$0.aJ();
      $$1.b = $$0.t();
      $$1.c = !$$0.e_() && $$0.p();
   }

   public alp b(gzw $$0) {
      return a;
   }
}
