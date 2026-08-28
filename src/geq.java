public class geq {
   public static final geq a = new geq(0.0F);
   final float b;
   final float c;
   final float d;

   public geq(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public geq(float $$0) {
      this($$0, $$0, $$0);
   }

   public geq a(float $$0) {
      return new geq(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public geq a(float $$0, float $$1, float $$2) {
      return new geq(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
