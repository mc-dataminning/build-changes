public class fzd<T extends blg, M extends fiu<T>> extends gao<T, M> {
   private final fvv a;

   public fzd(fvx.a $$0, fwy<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eP();
   }

   @Override
   protected void a(enw $$0, fqu $$1, int $$2, bkq $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = atm.c($$4 * $$4 + $$6 * $$6);
      cec $$9 = new cec($$3.dN(), $$3.ds(), $$3.du(), $$3.dy(), clj.b);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dD();
      $$9.O = $$9.dF();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
