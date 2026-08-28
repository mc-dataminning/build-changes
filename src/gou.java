public class gou<T extends btl> extends gop<T, fxc<T>> {
   private final fve<T> a;

   public gou(glz<T, fxc<T>> $$0, fya $$1) {
      super($$0);
      this.a = new fxc<>($$1.a(fyd.bu));
   }

   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fgi $$10 = fgi.Q();
      boolean $$11 = $$10.b($$3) && $$3.ci();
      if (!$$3.ci() || $$11) {
         fbg $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gfb.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gfb.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gle.c($$3, 0.0F));
      }
   }
}
