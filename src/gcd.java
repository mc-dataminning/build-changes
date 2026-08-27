public class gcd<T extends blv> extends gbz<T, fkw<T>> {
   private final fiy<T> a;

   public gcd(fzj<T, fkw<T>> $$0, flu $$1) {
      super($$0);
      this.a = new fkw<>($$1.a(flx.bq));
   }

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      euk $$10 = euk.N();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eph $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fsq.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fsq.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fyp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
