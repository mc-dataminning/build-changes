public class gno<T extends btp> extends gnj<T, fvy<T>> {
   private final fua<T> a;

   public gno(gkt<T, fvy<T>> $$0, fww $$1) {
      super($$0);
      this.a = new fvy<>($$1.a(fwz.bt));
   }

   public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fff $$10 = fff.Q();
      boolean $$11 = $$10.b($$3) && $$3.ch();
      if (!$$3.ch() || $$11) {
         fac $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gdw.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gdw.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gjy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
