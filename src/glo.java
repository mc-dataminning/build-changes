public class glo implements gkw {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fvs e;
   private final gmq f;
   private int g = 0;

   public glo(fvs $$0, gmq $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.be()) {
         float $$0 = this.e.dJ().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((glm)(new glp.a(this.e, atp.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((glm)(new glp.a(this.e, atp.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((glm)(new glp.a(this.e, atp.A)));
         }
      }
   }
}
