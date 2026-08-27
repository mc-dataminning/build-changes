public class gju<T extends bre, M extends fsw<T>> extends glh<T, M> {
   private final ggl a;

   public gju(ggn.a $$0, gho<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eR();
   }

   @Override
   protected void a(exn $$0, gbe $$1, int $$2, bql $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = axw.c($$4 * $$4 + $$6 * $$6);
      ckt $$9 = new ckt($$3.dN(), $$3.ds(), $$3.du(), $$3.dy(), csd.i);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dD();
      $$9.P = $$9.dF();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
