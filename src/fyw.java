public class fyw {
   public static final fyw a = new fyw(0.0F);
   final float b;
   final float c;
   final float d;

   public fyw(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fyw(float $$0) {
      this($$0, $$0, $$0);
   }

   public fyw a(float $$0) {
      return new fyw(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fyw a(float $$0, float $$1, float $$2) {
      return new fyw(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
