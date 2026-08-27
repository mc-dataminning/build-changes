public class gjd extends ghs<bsx> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gir g;

   protected gjd(ght.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public akn a(bsx $$0) {
      return gnu.e;
   }

   public void a(bsx $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      ctq $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         daz $$8 = $$0.dP();
         float $$9 = ayf.g((float)($$8.Y() - 1L)) * 40.0F;
         float $$10 = ayf.g((float)$$8.Y()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayf.j($$2, $$9, $$10)));
         gip.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
