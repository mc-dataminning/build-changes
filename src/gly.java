public class gly implements gli<duh> {
   private final goy a;

   public gly(glj.a $$0) {
      this.a = $$0.c();
   }

   public void a(duh $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      dff $$6 = $$0.i();
      if ($$6 != null) {
         deg $$7 = $$0.c();
         bui $$8 = $$7.b($$6, $$0.aB_());
         if ($$8 != null) {
            a($$1, $$2, $$3, $$4, $$8, this.a, $$7.b(), $$7.a());
         }
      }
   }

   public static void a(float $$0, fek $$1, gix $$2, int $$3, bui $$4, goy $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.dt(), $$4.du());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)azn.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
