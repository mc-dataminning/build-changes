public class gkh<T extends bqt> extends gkc<T, fst<T>> {
   private final fqv<T> a;

   public gkh(ghm<T, fst<T>> $$0, ftr $$1) {
      super($$0);
      this.a = new fst<>($$1.a(ftu.bt));
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      fby $$10 = fby.Q();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         ewv $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(gaq.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(gaq.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, ggs.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
