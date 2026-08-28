public class glr extends gkf<cgi, fwk<cgi>> {
   private static final alf a = new alf("textures/entity/turtle/big_sea_turtle.png");

   public glr(giz.a $$0) {
      super($$0, new fwk<>($$0.a(fxb.bN)), 0.7F);
   }

   protected float a(cgi $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.83F : $$1;
   }

   public alf b(cgi $$0) {
      return a;
   }
}
