public class gpb<T extends bso> extends gpi<T, fwl<T>> {
   private final fvq<T> a;

   public gpb(gmp<T, fwl<T>> $$0, fyo $$1) {
      super($$0);
      this.a = new fxq<>($$1.a(fyr.bz));
   }

   public void a(fbc $$0, gfg $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fgj $$10 = fgj.Q();
      boolean $$11 = $$10.b($$3) && $$3.cm();
      if (!$$3.cm() || $$11) {
         fbg $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gfo.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gfo.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, glt.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
