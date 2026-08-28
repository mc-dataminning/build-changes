public class ghs extends ghn<hem> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gkr d = this.v.b("body");
   private final gkr e = this.d.b("head");
   private final gkr f = this.e.b("eyes");
   private final gkr g = this.d.b("tongue");
   private final gkr i = this.d.b("left_arm");
   private final gkr j = this.d.b("right_arm");
   private final gkr k = this.v.b("left_leg");
   private final gkr l = this.v.b("right_leg");
   private final gkr m = this.d.b("croaking_body");

   public ghs(gkr $$0) {
      super($$0.b("root"));
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("root", gkw.c(), gkt.a(0.0F, 24.0F, 0.0F));
      glb $$3 = $$2.a(
         "body", gkw.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gkt.a(0.0F, -2.0F, 4.0F)
      );
      glb $$4 = $$3.a(
         "head", gkw.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gkt.a(0.0F, -2.0F, -1.0F)
      );
      glb $$5 = $$4.a("eyes", gkw.c(), gkt.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gkw.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gkt.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gkw.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gkt.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gkw.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gkv(-0.1F)), gkt.a(0.0F, -1.0F, -5.0F));
      glb $$6 = $$3.a("tongue", gkw.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gkt.a(0.0F, -1.01F, 1.0F));
      glb $$7 = $$3.a("left_arm", gkw.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gkt.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gkw.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gkt.a(0.0F, 3.0F, -1.0F));
      glb $$8 = $$3.a("right_arm", gkw.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gkt.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gkw.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gkt.a(0.0F, 3.0F, 0.0F));
      glb $$9 = $$2.a("left_leg", gkw.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gkt.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gkw.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gkt.a(2.0F, 3.0F, 0.0F));
      glb $$10 = $$2.a("right_leg", gkw.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gkt.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gkw.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gkt.a(-2.0F, 3.0F, 0.0F));
      return gkx.a($$0, 48, 48);
   }

   public void a(hem $$0) {
      super.a($$0);
      this.a($$0.b, frm.c, $$0.v);
      this.a($$0.c, frm.a, $$0.v);
      this.a($$0.d, frm.d, $$0.v);
      if ($$0.a) {
         this.a(frm.e, $$0.ag, $$0.ah, 1.0F, 2.5F);
      } else {
         this.a(frm.b, $$0.ag, $$0.ah, 1.5F, 2.5F);
      }

      this.a($$0.e, frm.f, $$0.v);
      this.m.k = $$0.c.b();
   }
}
