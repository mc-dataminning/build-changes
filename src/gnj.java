public class gnj<T extends btk> extends gne<T, fvt<T>> {
   private final ftv<T> a;

   public gnj(gko<T, fvt<T>> $$0, fwr $$1) {
      super($$0);
      this.a = new fvt<>($$1.a(fwu.bt));
   }

   public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ffa $$10 = ffa.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         ezx $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gdr.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gdr.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gjt.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
