public class gaj extends fzl {
   private final gaq a;
   private final gaq b;

   public gaj(gaq $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.b = this.a.b("jaw");
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      float $$2 = -16.0F;
      gba $$3 = $$1.a(
         "head",
         gav.c()
            .a("upper_lip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upper_head", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a(true)
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a(false)
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         gas.a(0.0F, -7.986666F, 0.0F).b(0.75F)
      );
      $$3.a("jaw", gav.c().a(176, 65).a("jaw", -6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F), gas.a(0.0F, 4.0F, -8.0F));
      return gaw.a($$0, 256, 256);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.b.e = (float)(Math.sin((double)($$0 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
