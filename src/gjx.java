public class gjx {
   public static final gjx a = new gjx(0.0F);
   final float b;
   final float c;
   final float d;

   public gjx(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gjx(float $$0) {
      this($$0, $$0, $$0);
   }

   public gjx a(float $$0) {
      return new gjx(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gjx a(float $$0, float $$1, float $$2) {
      return new gjx(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
