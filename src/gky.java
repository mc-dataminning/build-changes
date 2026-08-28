public class gky extends gjn<btj> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gkm g;

   protected gky(gjo.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public akk a(btj $$0) {
      return gpp.e;
   }

   public void a(btj $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      cud $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dcg $$8 = $$0.dR();
         float $$9 = ayg.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayg.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayg.j($$2, $$9, $$10)));
         gkk.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
