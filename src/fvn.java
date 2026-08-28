public class fvn<T extends bsp> extends fue<T> {
   private static final String a = "main";
   private final fwv b;
   private final fwv f;

   public fvn(fwv $$0) {
      this.b = $$0;
      this.f = $$0.b("main");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a(
         "main",
         fxa.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         fwx.a
      );
      return fxb.a($$0, 64, 32);
   }

   @Override
   public fwv a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
