public class fyp<T extends bkj> extends fyl<T, fhv<T>> {
   private final ffx<T> a;

   public fyp(fvy<T, fhv<T>> $$0, fis $$1) {
      super($$0);
      this.a = new fhv<>($$1.a(fiv.bn));
   }

   public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ero $$10 = ero.O();
      boolean $$11 = $$10.b($$3) && $$3.cd();
      if (!$$3.cd() || $$11) {
         eml $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fpj.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fpj.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fve.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
