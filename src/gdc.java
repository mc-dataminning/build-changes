public class gdc extends gbk<gzm> {
   private static final String a = "main";
   private final gem b;

   public gdc(gem $$0) {
      super($$0);
      this.b = $$0.b("main");
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      $$1.a(
         "main",
         ger.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         geo.a
      );
      return ges.a($$0, 64, 32);
   }

   public void a(gzm $$0) {
      super.a($$0);
      this.b.f = $$0.b * (float) (Math.PI / 180.0);
      this.b.e = $$0.a * (float) (Math.PI / 180.0);
   }
}
