public class glk {
   public static final glk a = new glk(0.0F);
   final float b;
   final float c;
   final float d;

   public glk(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public glk(float $$0) {
      this($$0, $$0, $$0);
   }

   public glk a(float $$0) {
      return new glk(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public glk a(float $$0, float $$1, float $$2) {
      return new glk(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
