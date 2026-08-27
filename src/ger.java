public class ger implements gdz {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fpj e;
   private final gft f;
   private int g = 0;

   public ger(fpj $$0, gft $$1) {
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
            this.f.a((gep)(new ges.a(this.e, aqn.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gep)(new ges.a(this.e, aqn.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gep)(new ges.a(this.e, aqn.A)));
         }
      }
   }
}
