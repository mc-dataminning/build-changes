public class gmk<T extends bso> extends gmf<T, fuu<T>> {
   private final fsw<T> a;

   public gmk(gjp<T, fuu<T>> $$0, fvs $$1) {
      super($$0);
      this.a = new fuu<>($$1.a(fvv.bt));
   }

   public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fdz $$10 = fdz.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         eyw $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gcs.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gcs.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, giu.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
