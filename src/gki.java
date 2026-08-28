public class gki extends gix<btx> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gjw g;

   protected gki(giy.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public alf a(btx $$0) {
      return goz.e;
   }

   public void a(btx $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      cuq $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dbz $$8 = $$0.dP();
         float $$9 = ayz.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayz.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayz.j($$2, $$9, $$10)));
         gju.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
