public class gea<T extends bog, M extends fng<T>> extends gfn<T, M> {
   private final gar a;

   public gea(gat.a $$0, gbu<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eP();
   }

   @Override
   protected void a(esa $$0, fvm $$1, int $$2, bno $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = awh.c($$4 * $$4 + $$6 * $$6);
      chp $$9 = new chp($$3.dM(), $$3.dr(), $$3.dt(), $$3.dx(), coz.h);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.M = $$9.dC();
      $$9.N = $$9.dE();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
