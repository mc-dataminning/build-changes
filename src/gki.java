public class gki<S extends hgw> extends gib<S> implements gjz {
   private final gkr a = this.p.b("hat_rim");

   public gki(gkr $$0) {
      super($$0);
   }

   public static gkx a() {
      gkz $$0 = gib.a(gkv.a, 0.0F);
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("head", new gkw().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gkt.a);
      glb $$3 = $$2.a("hat", gkw.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gkv(0.5F)), gkt.a);
      $$3.a("hat_rim", gkw.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gkt.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gkw.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gkv(0.05F)), gkt.a);
      $$1.a("right_arm", gkw.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gkt.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gkw.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gkt.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gkw.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gkt.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gkw.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gkt.a(2.0F, 12.0F, 0.0F));
      return gkx.a($$0, 64, 64);
   }

   public static gkx a(gkv $$0) {
      gkz $$1 = gib.a($$0, 0.0F);
      glb $$2 = $$1.a();
      glb $$3 = $$2.a("head", gkw.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gkt.a);
      $$2.a("body", gkw.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gkt.a);
      $$2.a("right_leg", gkw.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gkt.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gkw.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gkt.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gkw.c(), gkt.a);
      return gkx.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.K;
      ggb.a(this.s, this.r, $$0.a, $$1, $$0.v);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fld $$0) {
      this.a(bxw.b, $$0);
   }
}
