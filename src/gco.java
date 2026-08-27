public class gco implements gbw {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fng e;
   private final gdq f;
   private int g = 0;

   public gco(fng $$0, gdq $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bc()) {
         float $$0 = this.e.dL().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gcm)(new gcp.a(this.e, ape.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gcm)(new gcp.a(this.e, ape.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gcm)(new gcp.a(this.e, ape.A)));
         }
      }
   }
}
