public class gkq extends gjf<btf> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gke g;

   protected gkq(gjg.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public akk a(btf $$0) {
      return gph.e;
   }

   public void a(btf $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      cua $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dcd $$8 = $$0.dP();
         float $$9 = aye.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = aye.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(aye.j($$2, $$9, $$10)));
         gkc.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
