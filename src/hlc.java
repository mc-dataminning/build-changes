public class hlc implements fpv {
   private final wp a;
   private final int b;
   private final int c;
   private final int d;

   public hlc(wp $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      $$0.a(fli.Q().h, this.a, this.b, this.c, this.d);
   }

   public wp a() {
      return this.a;
   }
}
