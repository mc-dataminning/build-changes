import java.util.Set;

public class ggy extends ghn<hds> {
   public static final String a = "red_thing";
   public static final float b = 16.0F;
   public static final gla c = new ggi(false, 5.0F, 2.0F, 2.0F, 1.99F, 24.0F, Set.of("head", "beak", "red_thing"));
   private final gkr d;
   private final gkr e;
   private final gkr f;
   private final gkr g;
   private final gkr i;

   public ggy(gkr $$0) {
      super($$0);
      this.d = $$0.b("head");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("right_wing");
      this.i = $$0.b("left_wing");
   }

   public static gkx a() {
      gkz $$0 = b();
      return gkx.a($$0, 64, 32);
   }

   protected static gkz b() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      glb $$2 = $$1.a("head", gkw.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gkt.a(0.0F, 15.0F, -4.0F));
      $$2.a("beak", gkw.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gkt.a);
      $$2.a("red_thing", gkw.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gkt.a);
      $$1.a("body", gkw.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gkt.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gkw $$3 = gkw.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, gkt.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, gkt.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", gkw.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gkt.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", gkw.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gkt.a(4.0F, 13.0F, 0.0F));
      return $$0;
   }

   public void a(hds $$0) {
      super.a($$0);
      float $$1 = (azz.a($$0.a) + 1.0F) * $$0.b;
      this.d.e = $$0.ae * (float) (Math.PI / 180.0);
      this.d.f = $$0.ad * (float) (Math.PI / 180.0);
      float $$2 = $$0.ah;
      float $$3 = $$0.ag;
      this.e.e = azz.b($$3 * 0.6662F) * 1.4F * $$2;
      this.f.e = azz.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.g = $$1;
      this.i.g = -$$1;
   }
}
