public class gjs {
   public static final gjs a = new gjs(0.0F);
   final float b;
   final float c;
   final float d;

   public gjs(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gjs(float $$0) {
      this($$0, $$0, $$0);
   }

   public gjs a(float $$0) {
      return new gjs(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gjs a(float $$0, float $$1, float $$2) {
      return new gjs(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
