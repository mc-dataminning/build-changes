public class gqd implements gpl {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gag e;
   private final grf f;
   private int g = 0;

   public gqd(gag $$0, grf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bh()) {
         float $$0 = this.e.dN().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gqb)(new gqe.a(this.e, auz.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gqb)(new gqe.a(this.e, auz.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gqb)(new gqe.a(this.e, auz.A)));
         }
      }
   }
}
