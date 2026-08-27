public class gln<T extends bsa> extends gli<T, ftz<T>> {
   private final fsb<T> a;

   public gln(gis<T, ftz<T>> $$0, fux $$1) {
      super($$0);
      this.a = new ftz<>($$1.a(fva.bt));
   }

   public void a(exx $$0, gbo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fde $$10 = fde.Q();
      boolean $$11 = $$10.b($$3) && $$3.cf();
      if (!$$3.cf() || $$11) {
         eyb $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gbw.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gbw.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, ghy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
