public class gln extends gkc<bts> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final glb g;

   protected gln(gkd.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public akq a(bts $$0) {
      return gqe.e;
   }

   public void a(bts $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      cuo $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dcu $$8 = $$0.dQ();
         float $$9 = ayn.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayn.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayn.j($$2, $$9, $$10)));
         gkz.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
