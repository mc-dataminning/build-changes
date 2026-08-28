public class hbc implements hak {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final ggh e;
   private final hcf f;
   private int g = 0;

   public hbc(ggh $$0, hcf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bn()) {
         float $$0 = this.e.dS().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hba)(new hbd.a(this.e, awg.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hba)(new hbd.a(this.e, awg.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hba)(new hbd.a(this.e, awg.A)));
         }
      }
   }
}
