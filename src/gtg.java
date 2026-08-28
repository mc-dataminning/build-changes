public class gtg implements gso {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gdh e;
   private final guj f;
   private int g = 0;

   public gtg(gdh $$0, guj $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bl()) {
         float $$0 = this.e.dR().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gte)(new gth.a(this.e, avh.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gte)(new gth.a(this.e, avh.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gte)(new gth.a(this.e, avh.A)));
         }
      }
   }
}
