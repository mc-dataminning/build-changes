public class god<T extends btb> extends gny<T, fwm<T>> {
   private final fuo<T> a;

   public god(gli<T, fwm<T>> $$0, fxk $$1) {
      super($$0);
      this.a = new fwm<>($$1.a(fxn.bt));
   }

   public void a(fam $$0, ged $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fft $$10 = fft.Q();
      boolean $$11 = $$10.b($$3) && $$3.ci();
      if (!$$3.ci() || $$11) {
         faq $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gel.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gel.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gkn.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
