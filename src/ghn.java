import java.util.Set;

public class ghn extends gic<heh> {
   public static final String a = "red_thing";
   public static final float b = 16.0F;
   public static final glp c = new ggx(false, 5.0F, 2.0F, 2.0F, 1.99F, 24.0F, Set.of("head", "beak", "red_thing"));
   private final glg d;
   private final glg e;
   private final glg f;
   private final glg g;
   private final glg i;

   public ghn(glg $$0) {
      super($$0);
      this.d = $$0.b("head");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("right_wing");
      this.i = $$0.b("left_wing");
   }

   public static glm a() {
      glo $$0 = b();
      return glm.a($$0, 64, 32);
   }

   protected static glo b() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("head", gll.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gli.a(0.0F, 15.0F, -4.0F));
      $$2.a("beak", gll.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gli.a);
      $$2.a("red_thing", gll.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gli.a);
      $$1.a("body", gll.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gli.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gll $$3 = gll.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, gli.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, gli.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", gll.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gli.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", gll.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gli.a(4.0F, 13.0F, 0.0F));
      return $$0;
   }

   public void a(heh $$0) {
      super.a($$0);
      float $$1 = (azq.a($$0.a) + 1.0F) * $$0.b;
      this.d.e = $$0.ab * (float) (Math.PI / 180.0);
      this.d.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$2 = $$0.ae;
      float $$3 = $$0.ad;
      this.e.e = azq.b($$3 * 0.6662F) * 1.4F * $$2;
      this.f.e = azq.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.g = $$1;
      this.i.g = -$$1;
   }
}
