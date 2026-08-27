public class gda<T extends bmk> extends gcw<T, flt<T>> {
   private final fjv<T> a;

   public gda(gag<T, flt<T>> $$0, fmr $$1) {
      super($$0);
      this.a = new flt<>($$1.a(fmu.bq));
   }

   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      evg $$10 = evg.O();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eqd $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(ftn.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(ftn.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fzm.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
