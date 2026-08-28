public class fys extends fxa<gun> {
   private static final String a = "main";
   private final gab b;
   private final gab c;

   public fys(gab $$0) {
      this.b = $$0;
      this.c = $$0.b("main");
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a(
         "main",
         gag.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         gad.a
      );
      return gah.a($$0, 64, 32);
   }

   @Override
   public gab a() {
      return this.b;
   }

   public void a(gun $$0) {
      this.c.f = $$0.b * (float) (Math.PI / 180.0);
      this.c.e = $$0.a * (float) (Math.PI / 180.0);
   }
}
