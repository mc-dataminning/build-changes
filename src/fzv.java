public class fzv extends fzw {
   protected final gbb a;

   public fzv(gbb $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gbj a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("head", gbg.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gbd.a);
      return $$0;
   }

   public static gbh b() {
      gbj $$0 = a();
      gbl $$1 = $$0.a();
      $$1.b("head").a("hat", gbg.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gbf(0.25F)), gbd.a);
      return gbh.a($$0, 64, 64);
   }

   public static gbh c() {
      gbj $$0 = a();
      return gbh.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
