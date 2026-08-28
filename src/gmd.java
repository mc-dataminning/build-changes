public class gmd<T extends btn, M extends fvd<T>> extends gnq<T, M> {
   private final git a;

   public gmd(giv.a $$0, gjw<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eT();
   }

   @Override
   protected void a(ezw $$0, gdm $$1, int $$2, bss $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = ayx.c($$4 * $$4 + $$6 * $$6);
      cnd $$9 = new cnd($$3.dP(), $$3.du(), $$3.dw(), $$3.dA(), cun.l);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dF();
      $$9.P = $$9.dH();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
