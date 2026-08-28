public class gma<T extends btk, M extends fva<T>> extends gnn<T, M> {
   private final giq a;

   public gma(gis.a $$0, gjt<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eT();
   }

   @Override
   protected void a(ezt $$0, gdj $$1, int $$2, bsp $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = ayu.c($$4 * $$4 + $$6 * $$6);
      cna $$9 = new cna($$3.dP(), $$3.du(), $$3.dw(), $$3.dA(), cuk.l);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dF();
      $$9.P = $$9.dH();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
