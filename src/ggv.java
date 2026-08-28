public class ggv implements ggf<drf> {
   private final gjm a;

   public ggv(ggg.a $$0) {
      this.a = $$0.c();
   }

   public void a(drf $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      dcg $$6 = $$0.i();
      if ($$6 != null) {
         dbi $$7 = $$0.c();
         bsh $$8 = $$7.b($$6, $$0.az_());
         if ($$8 != null) {
            a($$1, $$2, $$3, $$4, $$8, this.a, $$7.b(), $$7.a());
         }
      }
   }

   public static void a(float $$0, fao $$1, gef $$2, int $$3, bsh $$4, gjm $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dl(), $$4.dm());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)ayg.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, 0.0F, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
