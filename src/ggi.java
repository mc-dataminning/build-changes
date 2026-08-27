public class ggi<T extends bpp, M extends fpk<T>> extends ghv<T, M> {
   private final gcz a;

   public ggi(gdb.a $$0, gec<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eQ();
   }

   @Override
   protected void a(eub $$0, fxs $$1, int $$2, box $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = aww.c($$4 * $$4 + $$6 * $$6);
      cjc $$9 = new cjc($$3.dM(), $$3.dr(), $$3.dt(), $$3.dx(), cqm.h);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dC();
      $$9.O = $$9.dE();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
