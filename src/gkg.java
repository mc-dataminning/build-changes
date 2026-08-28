public class gkg extends giv<btv> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gju g;

   protected gkg(giw.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public ale a(btv $$0) {
      return gox.e;
   }

   public void a(btv $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      cuo $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dbx $$8 = $$0.dP();
         float $$9 = ayy.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayy.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayy.j($$2, $$9, $$10)));
         gjs.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
