public class ger {
   public static final ger a = new ger(0.0F);
   final float b;
   final float c;
   final float d;

   public ger(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ger(float $$0) {
      this($$0, $$0, $$0);
   }

   public ger a(float $$0) {
      return new ger(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public ger a(float $$0, float $$1, float $$2) {
      return new ger(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
