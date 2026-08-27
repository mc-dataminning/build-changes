public class gdc<T extends bml> extends gcy<T, flv<T>> {
   private final fjx<T> a;

   public gdc(gai<T, flv<T>> $$0, fmt $$1) {
      super($$0);
      this.a = new flv<>($$1.a(fmw.bq));
   }

   public void a(eqb $$0, fth $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      evi $$10 = evi.O();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eqf $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(ftp.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(ftp.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fzo.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
