public class gau {
   public static final gau a = new gau(0.0F);
   final float b;
   final float c;
   final float d;

   public gau(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gau(float $$0) {
      this($$0, $$0, $$0);
   }

   public gau a(float $$0) {
      return new gau(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gau a(float $$0, float $$1, float $$2) {
      return new gau(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
