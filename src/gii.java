public class gii extends ggp<hey> {
   private static final String a = "main";
   private final gjt b;

   public gii(gjt $$0) {
      super($$0);
      this.b = $$0.b("main");
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a(
         "main",
         gjy.c()
            .a(0, 0)
            .a(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F)
            .a(0, 10)
            .a(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F)
            .a(20, 0)
            .a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F),
         gjv.a
      );
      return gjz.a($$0, 64, 32);
   }

   public void a(hey $$0) {
      super.a($$0);
      this.b.f = $$0.b * (float) (Math.PI / 180.0);
      this.b.e = $$0.a * (float) (Math.PI / 180.0);
   }
}
