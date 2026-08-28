public class gkf extends giu<btu> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gjt g;

   protected gkf(giv.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public ale a(btu $$0) {
      return gow.e;
   }

   public void a(btu $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      cun $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dbw $$8 = $$0.dP();
         float $$9 = ayx.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayx.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayx.j($$2, $$9, $$10)));
         gjr.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
