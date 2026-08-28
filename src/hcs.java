public class hcs implements hca {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final ght e;
   private final hdv f;
   private int g = 0;

   public hcs(ght $$0, hdv $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bq()) {
         float $$0 = this.e.dY().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hcq)(new hct.a(this.e, awo.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hcq)(new hct.a(this.e, awo.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hcq)(new hct.a(this.e, awo.A)));
         }
      }
   }
}
