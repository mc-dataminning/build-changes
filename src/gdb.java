public class gdb<T extends bmk> extends gcx<T, flu<T>> {
   private final fjw<T> a;

   public gdb(gah<T, flu<T>> $$0, fms $$1) {
      super($$0);
      this.a = new flu<>($$1.a(fmv.bq));
   }

   public void a(eqa $$0, ftg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      evh $$10 = evh.O();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eqe $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fto.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fto.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fzn.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
