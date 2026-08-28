public class gof<T extends btc> extends goa<T, fwo<T>> {
   private final fuq<T> a;

   public gof(glk<T, fwo<T>> $$0, fxm $$1) {
      super($$0);
      this.a = new fwo<>($$1.a(fxp.bt));
   }

   public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ffw $$10 = ffw.Q();
      boolean $$11 = $$10.b($$3) && $$3.cj();
      if (!$$3.cj() || $$11) {
         fas $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gen.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gen.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gkp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
