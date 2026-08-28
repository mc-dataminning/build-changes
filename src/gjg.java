public class gjg {
   public static final gjg a = new gjg(0.0F);
   final float b;
   final float c;
   final float d;

   public gjg(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gjg(float $$0) {
      this($$0, $$0, $$0);
   }

   public gjg a(float $$0) {
      return new gjg(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gjg a(float $$0, float $$1, float $$2) {
      return new gjg(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
