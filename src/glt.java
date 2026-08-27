public class glt extends gmf<cgk, fth<cgk>> {
   private final fth<cgk> a;

   public glt(gjp<cgk, fth<cgk>> $$0, fvs $$1) {
      super($$0);
      this.a = new fth<>($$1.a(fvv.aq));
   }

   public void a(eys $$0, gck $$1, int $$2, cgk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cto $$10 = $$3.fQ();
      if ($$10.g() instanceof crc $$11 && $$11.d() == crc.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awe.bz)) {
            int $$13 = cwg.a($$10, -6265536);
            $$14 = (float)axo.b.b($$13) / 255.0F;
            $$15 = (float)axo.b.c($$13) / 255.0F;
            $$16 = (float)axo.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         eyw $$20 = $$1.getBuffer(gcs.e($$11.b()));
         this.a.a($$0, $$20, $$2, gnm.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
