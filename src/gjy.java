public class gjy<T extends bqo> extends gjt<T, fsk<T>> {
   private final fqm<T> a;

   public gjy(ghd<T, fsk<T>> $$0, fti $$1) {
      super($$0);
      this.a = new fsk<>($$1.a(ftl.bt));
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fbp $$10 = fbp.Q();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         ewm $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gah.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gah.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, ggj.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
