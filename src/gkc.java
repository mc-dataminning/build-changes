public class gkc extends gir<btr> {
   private static final float a = 40.0F;
   private static final int f = 50;
   private final gjq g;

   protected gkc(gis.a $$0) {
      super($$0);
      this.g = $$0.b();
   }

   public alb a(btr $$0) {
      return got.e;
   }

   public void a(btr $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      cuk $$6 = $$0.s();
      if (!$$6.e()) {
         $$3.a();
         if ($$0.ai <= 50) {
            float $$7 = Math.min((float)$$0.ai + $$2, 50.0F) / 50.0F;
            $$3.b($$7, $$7, $$7);
         }

         dbt $$8 = $$0.dP();
         float $$9 = ayu.g((float)($$8.Z() - 1L)) * 40.0F;
         float $$10 = ayu.g((float)$$8.Z()) * 40.0F;
         $$3.a(a.d.rotationDegrees(ayu.j($$2, $$9, $$10)));
         gjo.a(this.g, $$3, $$4, 15728880, $$6, $$8.z, $$8);
         $$3.b();
      }
   }
}
