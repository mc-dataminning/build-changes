public class gfe implements gem {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fpw e;
   private final ggg f;
   private int g = 0;

   public gfe(fpw $$0, ggg $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.be()) {
         float $$0 = this.e.dN().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gfc)(new gff.a(this.e, aqr.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gfc)(new gff.a(this.e, aqr.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gfc)(new gff.a(this.e, aqr.A)));
         }
      }
   }
}
