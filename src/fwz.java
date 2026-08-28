public class fwz {
   public static final fwz a = new fwz(0.0F);
   final float b;
   final float c;
   final float d;

   public fwz(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fwz(float $$0) {
      this($$0, $$0, $$0);
   }

   public fwz a(float $$0) {
      return new fwz(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fwz a(float $$0, float $$1, float $$2) {
      return new fwz(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
