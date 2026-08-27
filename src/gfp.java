public class gfp<T extends boi> extends gfl<T, fog<T>> {
   private final fmi<T> a;

   public gfp(gcv<T, fog<T>> $$0, fpf $$1) {
      super($$0);
      this.a = new fog<>($$1.a(fpi.bp));
   }

   public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      exo $$10 = exo.P();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         esl $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fwb.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fwb.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gcb.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
