public class gmo<T extends bsy, M extends fvn<T>> extends gob<T, M> {
   private final gje a;

   public gmo(gjg.a $$0, gkh<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eP();
   }

   @Override
   protected void a(fag $$0, gdx $$1, int $$2, bsd $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = aye.c($$4 * $$4 + $$6 * $$6);
      cmp $$9 = new cmp($$3.dP(), $$3.du(), $$3.dw(), $$3.dA(), cua.l, null);
      $$9.s((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.t((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dF();
      $$9.P = $$9.dH();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
