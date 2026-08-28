public class gkw extends gjl<bti> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gkk g;

   protected gkw(gjm.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public akk a(bti $$0) {
      return gpn.e;
   }

   public void a(bti $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      cuc $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dcf $$8 = $$0.dQ();
         float $$9 = ayg.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayg.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayg.j($$2, $$9, $$10)));
         gki.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
