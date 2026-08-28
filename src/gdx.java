public class gdx extends gdy {
   protected final gfd a;

   public gdx(gfd $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gfl a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("head", gfi.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gff.a);
      return $$0;
   }

   public static gfj b() {
      gfl $$0 = a();
      gfn $$1 = $$0.a();
      $$1.b("head").a("hat", gfi.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfh(0.25F)), gff.a);
      return gfj.a($$0, 64, 64);
   }

   public static gfj c() {
      gfl $$0 = a();
      return gfj.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
