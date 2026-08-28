public class gij extends ggp<hez> {
   public static final String a = "lid";
   private static final String b = "base";
   private final gjt c;
   private final gjt d;

   public gij(gjt $$0) {
      super($$0, grc::h);
      this.c = $$0.b("lid");
      this.d = $$0.b("head");
   }

   private static gkb c() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("lid", gjy.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), gjv.a(0.0F, 24.0F, 0.0F));
      $$1.a("base", gjy.c().a(0, 28).a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), gjv.a(0.0F, 24.0F, 0.0F));
      return $$0;
   }

   public static gjz a() {
      gkb $$0 = c();
      $$0.a().a("head", gjy.c().a(0, 52).a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), gjv.a(0.0F, 12.0F, 0.0F));
      return gjz.a($$0, 64, 64);
   }

   public static gjz b() {
      gkb $$0 = c();
      return gjz.a($$0, 64, 64);
   }

   public void a(hez $$0) {
      super.a($$0);
      float $$1 = (0.5F + $$0.c) * (float) Math.PI;
      float $$2 = -1.0F + azm.a($$1);
      float $$3 = 0.0F;
      if ($$1 > (float) Math.PI) {
         $$3 = azm.a($$0.u * 0.1F) * 0.7F;
      }

      this.c.a(0.0F, 16.0F + azm.a($$1) * 8.0F + $$3, 0.0F);
      if ($$0.c > 0.3F) {
         this.c.f = $$2 * $$2 * $$2 * $$2 * (float) Math.PI * 0.125F;
      } else {
         this.c.f = 0.0F;
      }

      this.d.e = $$0.ab * (float) (Math.PI / 180.0);
      this.d.f = ($$0.d - 180.0F - $$0.e) * (float) (Math.PI / 180.0);
   }
}
