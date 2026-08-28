public class gih extends gii {
   protected final gjo a;

   public gih(gjo $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gjw a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      $$1.a("head", gjt.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gjq.a);
      return $$0;
   }

   public static gju b() {
      gjw $$0 = a();
      gjy $$1 = $$0.a();
      $$1.b("head").a("hat", gjt.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjs(0.25F)), gjq.a);
      return gju.a($$0, 64, 64);
   }

   public static gju c() {
      gjw $$0 = a();
      return gju.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
