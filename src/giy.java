public class giy {
   public static final giy a = new giy(0.0F);
   final float b;
   final float c;
   final float d;

   public giy(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public giy(float $$0) {
      this($$0, $$0, $$0);
   }

   public giy a(float $$0) {
      return new giy(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public giy a(float $$0, float $$1, float $$2) {
      return new giy(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
