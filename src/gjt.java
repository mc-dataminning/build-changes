public class gjt extends ghn<hfe> {
   private final gkr a;

   public gjt(gkr $$0) {
      super($$0, gry::g);
      this.a = $$0.b("tail");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gkw.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gkt.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gkw.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gkt.a(0.0F, 22.0F, 0.0F));
      return gkx.a($$0, 16, 16);
   }

   public void a(hfe $$0) {
      super.a($$0);
      float $$1 = $$0.an ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azz.a(0.3F * $$0.v);
   }
}
