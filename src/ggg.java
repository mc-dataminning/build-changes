public class ggg {
   public static final ggg a = new ggg(0.0F);
   final float b;
   final float c;
   final float d;

   public ggg(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ggg(float $$0) {
      this($$0, $$0, $$0);
   }

   public ggg a(float $$0) {
      return new ggg(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public ggg a(float $$0, float $$1, float $$2) {
      return new ggg(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
