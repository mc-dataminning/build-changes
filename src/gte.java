public class gte implements gsm {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gdf e;
   private final guh f;
   private int g = 0;

   public gte(gdf $$0, guh $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bk()) {
         float $$0 = this.e.dQ().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gtc)(new gtf.a(this.e, avh.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gtc)(new gtf.a(this.e, avh.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gtc)(new gtf.a(this.e, avh.A)));
         }
      }
   }
}
