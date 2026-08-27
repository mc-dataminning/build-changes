public class fzg extends fzs<byk, fhn<byk>> {
   private final fhn<byk> a;

   public fzg(fxf<byk, fhn<byk>> $$0, fjx $$1) {
      super($$0);
      this.a = new fhn<>($$1.a(fka.ak));
   }

   public void a(enk $$0, fqh $$1, int $$2, byk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clb $$10 = $$3.s();
      if ($$10.d() instanceof ckr) {
         ckr $$11 = (ckr)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof cjs) {
            int $$12 = ((cjs)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         eno $$19 = $$1.getBuffer(fqp.e($$11.h()));
         this.a.a($$0, $$19, $$2, gay.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
