public class gdo extends gbh<gzv> {
   private final gej a;

   public gdo(gej $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static gep a(gen $$0) {
      ger $$1 = new ger();
      get $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", geo.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gel.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", geo.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gel.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", geo.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gel.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", geo.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gel.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", geo.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gel.a(0.0F, 20.5F, -3.0F));
      return gep.a($$1, 32, 32);
   }

   public void a(gzv $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azu.a(0.6F * $$0.p);
   }
}
