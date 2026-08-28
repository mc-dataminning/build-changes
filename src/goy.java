public class goy<T extends btn> extends got<T, fxg<T>> {
   private final fvi<T> a;

   public goy(gmd<T, fxg<T>> $$0, fye $$1) {
      super($$0);
      this.a = new fxg<>($$1.a(fyh.bu));
   }

   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fgm $$10 = fgm.Q();
      boolean $$11 = $$10.b($$3) && $$3.ci();
      if (!$$3.ci() || $$11) {
         fbk $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gff.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gff.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gli.c($$3, 0.0F));
      }
   }
}
