public class glt extends gki<btu> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final glh h;

   protected glt(gkj.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public akr a(btu $$0) {
      return gqk.e;
   }

   public void a(btu $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      cuq $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dcw $$8 = $$0.dO();
         float $$9 = ayo.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayo.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayo.j($$2, $$9, $$10)));
         glf.a(this.h, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
