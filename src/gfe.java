public class gfe {
   public static final gfe a = new gfe(0.0F);
   final float b;
   final float c;
   final float d;

   public gfe(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gfe(float $$0) {
      this($$0, $$0, $$0);
   }

   public gfe a(float $$0) {
      return new gfe(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gfe a(float $$0, float $$1, float $$2) {
      return new gfe(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
