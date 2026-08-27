public class gki implements gjq {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fun e;
   private final glk f;
   private int g = 0;

   public gki(fun $$0, glk $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.be()) {
         float $$0 = this.e.dM().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gkg)(new gkj.a(this.e, atk.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gkg)(new gkj.a(this.e, atk.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gkg)(new gkj.a(this.e, atk.A)));
         }
      }
   }
}
