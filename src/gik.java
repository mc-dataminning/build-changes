public class gik {
   public static final gik a = new gik(0.0F);
   final float b;
   final float c;
   final float d;

   public gik(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gik(float $$0) {
      this($$0, $$0, $$0);
   }

   public gik a(float $$0) {
      return new gik(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gik a(float $$0, float $$1, float $$2) {
      return new gik(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
