public class gkx implements gkh<dtw> {
   private final gnx a;

   public gkx(gki.a $$0) {
      this.a = $$0.c();
   }

   public void a(dtw $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      dev $$6 = $$0.i();
      if ($$6 != null) {
         ddw $$7 = $$0.c();
         btz $$8 = $$7.b($$6, $$0.aC_());
         if ($$8 != null) {
            a($$1, $$2, $$3, $$4, $$8, this.a, $$7.b(), $$7.a());
         }
      }
   }

   public static void a(float $$0, fdt $$1, ghw $$2, int $$3, btz $$4, gnx $$5, double $$6, double $$7) {
      $$1.a();
      $$1.a(0.5F, 0.0F, 0.5F);
      float $$8 = 0.53125F;
      float $$9 = Math.max($$4.ds(), $$4.dt());
      if ((double)$$9 > 1.0) {
         $$8 /= $$9;
      }

      $$1.a(0.0F, 0.4F, 0.0F);
      $$1.a(a.d.rotationDegrees((float)azj.d((double)$$0, $$6, $$7) * 10.0F));
      $$1.a(0.0F, -0.2F, 0.0F);
      $$1.a(a.b.rotationDegrees(-30.0F));
      $$1.b($$8, $$8, $$8);
      $$5.a($$4, 0.0, 0.0, 0.0, $$0, $$1, $$2, $$3);
      $$1.b();
   }
}
