import java.util.Set;

public class giz extends ghn<hft> {
   private static final float a = 50.0F;
   private static final float b = -40.0F;
   private static final float c = 0.6F;
   private static final gla d = gla.scaling(0.6F);
   private static final gla e = new ggi(true, 22.0F, 2.0F, 2.65F, 2.5F, 36.0F, Set.of("head", "left_ear", "right_ear", "nose"));
   private static final String f = "left_haunch";
   private static final String g = "right_haunch";
   private final gkr i;
   private final gkr j;
   private final gkr k;
   private final gkr l;
   private final gkr m;

   public giz(gkr $$0) {
      super($$0);
      this.i = $$0.b("left_haunch");
      this.j = $$0.b("right_haunch");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_front_leg");
      this.m = $$0.b("head");
   }

   public static gkx a(boolean $$0) {
      gkz $$1 = new gkz();
      glb $$2 = $$1.a();
      glb $$3 = $$2.a("left_haunch", gkw.c().a(30, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gkt.a(3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      glb $$4 = $$2.a("right_haunch", gkw.c().a(16, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gkt.a(-3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      $$3.a("left_hind_foot", gkw.c().a(26, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gkt.b(0.36651915F, 0.0F, 0.0F));
      $$4.a("right_hind_foot", gkw.c().a(8, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gkt.b(0.36651915F, 0.0F, 0.0F));
      $$2.a("body", gkw.c().a(0, 0).a(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), gkt.a(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$2.a("left_front_leg", gkw.c().a(8, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gkt.a(3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      $$2.a("right_front_leg", gkw.c().a(0, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gkt.a(-3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      glb $$5 = $$2.a("head", gkw.c().a(32, 0).a(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), gkt.a(0.0F, 16.0F, -1.0F));
      $$5.a("right_ear", gkw.c().a(52, 0).a(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gkt.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 12), 0.0F));
      $$5.a("left_ear", gkw.c().a(58, 0).a(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gkt.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F));
      $$2.a("tail", gkw.c().a(52, 6).a(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), gkt.a(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      $$5.a("nose", gkw.c().a(32, 9).a(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), gkt.a);
      return gkx.a($$1, 64, 32).a($$0 ? e : d);
   }

   public void a(hft $$0) {
      super.a($$0);
      this.m.e = $$0.ae * (float) (Math.PI / 180.0);
      this.m.f = $$0.ad * (float) (Math.PI / 180.0);
      float $$1 = azz.a($$0.a * (float) Math.PI);
      this.i.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.j.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.k.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
      this.l.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
   }
}
