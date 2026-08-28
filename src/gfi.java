public class gfi {
   public static final gfi a = new gfi(0.0F);
   final float b;
   final float c;
   final float d;

   public gfi(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gfi(float $$0) {
      this($$0, $$0, $$0);
   }

   public gfi a(float $$0) {
      return new gfi(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gfi a(float $$0, float $$1, float $$2) {
      return new gfi(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
