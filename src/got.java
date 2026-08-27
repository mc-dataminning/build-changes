public class got extends gpi<cgk, fwb<cgk>> {
   private final fwb<cgk> a;

   public got(gmp<cgk, fwb<cgk>> $$0, fyo $$1) {
      super($$0);
      this.a = new fwb<>($$1.a(fyr.au));
   }

   public void a(fbc $$0, gfg $$1, int $$2, cgk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuh $$10 = $$3.fZ();
      if ($$10.f() instanceof crs $$11 && $$11.d() == crs.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awm.bA)) {
            int $$13 = cxi.a($$10, -6265536);
            $$14 = (float)axw.b.b($$13) / 255.0F;
            $$15 = (float)axw.b.c($$13) / 255.0F;
            $$16 = (float)axw.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         fbg $$20 = $$1.getBuffer(gfo.e($$11.b()));
         this.a.a($$0, $$20, $$2, gqp.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
