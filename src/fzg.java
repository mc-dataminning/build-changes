public class fzg extends fzh {
   private final gal b;
   protected final gal a;

   public fzg(gal $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static gat b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("head", gaq.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gan.a);
      return $$0;
   }

   public static gar c() {
      gat $$0 = b();
      gav $$1 = $$0.a();
      $$1.b("head").a("hat", gaq.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gap(0.25F)), gan.a);
      return gar.a($$0, 64, 64);
   }

   public static gar d() {
      gat $$0 = b();
      return gar.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public gal a() {
      return this.b;
   }
}
