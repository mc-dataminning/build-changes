public class gen {
   public static final gen a = new gen(0.0F);
   final float b;
   final float c;
   final float d;

   public gen(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gen(float $$0) {
      this($$0, $$0, $$0);
   }

   public gen a(float $$0) {
      return new gen(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gen a(float $$0, float $$1, float $$2) {
      return new gen(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
