public class gvg implements gup<dzw> {
   private final gyi a;

   public gvg(guq.a $$0) {
      this.a = $$0.c();
   }

   public void a(dzw $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      djz $$7 = $$0.i();
      if ($$7 != null) {
         diz $$8 = $$0.c();
         bwv $$9 = $$8.b($$7, $$0.aB_());
         if ($$9 != null) {
            a($$1, $$2, $$3, $$4, $$9, this.a, $$8.b(), $$8.a());
         }
      }
   }

   public static void a(float $$0, flq $$1, gsc $$2, int $$3, bwv $$4, gyi $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dq(), $$4.dr());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)azq.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
