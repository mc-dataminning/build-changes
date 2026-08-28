public class ghr extends gfy<heg> {
   private static final String a = "main";
   private final gjc b;

   public ghr(gjc $$0) {
      super($$0);
      this.b = $$0.b("main");
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      $$1.a(
         "main",
         gjh.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         gje.a
      );
      return gji.a($$0, 64, 32);
   }

   public void a(heg $$0) {
      super.a($$0);
      this.b.f = $$0.b * (float) (Math.PI / 180.0);
      this.b.e = $$0.a * (float) (Math.PI / 180.0);
   }
}
