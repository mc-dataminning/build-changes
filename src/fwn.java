public class fwn<T extends bjg, M extends fgi<T>> extends fxy<T, M> {
   private final ftf a;

   public fwn(fth.a $$0, fui<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eN();
   }

   @Override
   protected void a(elp $$0, foe $$1, int $$2, biq $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = arw.c($$4 * $$4 + $$6 * $$6);
      ccc $$9 = new ccc($$3.dL(), $$3.dq(), $$3.ds(), $$3.dw());
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dB();
      $$9.O = $$9.dD();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
