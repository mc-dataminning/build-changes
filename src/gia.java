public class gia implements ghi {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fsh e;
   private final gjc f;
   private int g = 0;

   public gia(fsh $$0, gjc $$1) {
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
            this.f.a((ghy)(new gib.a(this.e, arr.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((ghy)(new gib.a(this.e, arr.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((ghy)(new gib.a(this.e, arr.A)));
         }
      }
   }
}
