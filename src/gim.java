public class gim extends gin {
   protected final gjt a;

   public gim(gjt $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gkb a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      $$1.a("head", gjy.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gjv.a);
      return $$0;
   }

   public static gjz b() {
      gkb $$0 = a();
      gkd $$1 = $$0.a();
      $$1.b("head").a("hat", gjy.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjx(0.25F)), gjv.a);
      return gjz.a($$0, 64, 64);
   }

   public static gjz c() {
      gkb $$0 = a();
      return gjz.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
