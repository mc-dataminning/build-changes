import java.util.Set;

public class fyu extends fyk<gvb> {
   public static final gbv a = new fxm(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F, Set.of("head"));
   private static final float b = 0.87266463F;
   private static final float c = (float) (-Math.PI / 9);
   private final gbm d;
   private final gbm e;
   private final gbm f;
   private final gbm g;
   private final gbm i;
   private final gbm j;
   private final gbm k;
   private final gbm l;
   private final gbm m;

   public fyu(gbm $$0) {
      super($$0);
      this.g = $$0.b("body");
      this.m = this.g.b("mane");
      this.d = $$0.b("head");
      this.e = this.d.b("right_ear");
      this.f = this.d.b("left_ear");
      this.i = $$0.b("right_front_leg");
      this.j = $$0.b("left_front_leg");
      this.k = $$0.b("right_hind_leg");
      this.l = $$0.b("left_hind_leg");
   }

   private static gbu c() {
      gbu $$0 = new gbu();
      gbw $$1 = $$0.a();
      gbw $$2 = $$1.a("body", gbr.c().a(1, 1).a(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F), gbo.a(0.0F, 7.0F, 0.0F));
      $$2.a("mane", gbr.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new gbq(0.001F)), gbo.a(0.0F, -14.0F, -7.0F));
      gbw $$3 = $$1.a("head", gbr.c().a(61, 1).a(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F), gbo.a(0.0F, 2.0F, -12.0F, 0.87266463F, 0.0F, 0.0F));
      $$3.a("right_ear", gbr.c().a(1, 1).a(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), gbo.a(-6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (-Math.PI * 2.0 / 9.0)));
      $$3.a("left_ear", gbr.c().a(1, 6).a(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), gbo.a(6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (Math.PI * 2.0 / 9.0)));
      $$3.a("right_horn", gbr.c().a(10, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), gbo.a(-7.0F, 2.0F, -12.0F));
      $$3.a("left_horn", gbr.c().a(1, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), gbo.a(7.0F, 2.0F, -12.0F));
      int $$4 = 14;
      int $$5 = 11;
      $$1.a("right_front_leg", gbr.c().a(66, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), gbo.a(-4.0F, 10.0F, -8.5F));
      $$1.a("left_front_leg", gbr.c().a(41, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), gbo.a(4.0F, 10.0F, -8.5F));
      $$1.a("right_hind_leg", gbr.c().a(21, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), gbo.a(-5.0F, 13.0F, 10.0F));
      $$1.a("left_hind_leg", gbr.c().a(0, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), gbo.a(5.0F, 13.0F, 10.0F));
      return $$0;
   }

   public static gbs a() {
      gbu $$0 = c();
      return gbs.a($$0, 128, 64);
   }

   public static gbs b() {
      gbu $$0 = c();
      gbw $$1 = $$0.a().b("body");
      $$1.a("mane", gbr.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new gbq(0.001F)), gbo.a(0.0F, -14.0F, -3.0F));
      return gbs.a($$0, 128, 64).a(a);
   }

   public void a(gvb $$0) {
      super.a($$0);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.e.g = (float) (-Math.PI * 2.0 / 9.0) - $$1 * azk.a($$2);
      this.f.g = (float) (Math.PI * 2.0 / 9.0) + $$1 * azk.a($$2);
      this.d.f = $$0.U * (float) (Math.PI / 180.0);
      float $$3 = 1.0F - (float)azk.a(10 - 2 * $$0.a) / 10.0F;
      this.d.e = azk.h($$3, 0.87266463F, (float) (-Math.PI / 9));
      if ($$0.ae) {
         this.d.c += $$3 * 2.5F;
      }

      float $$4 = 1.2F;
      this.i.e = azk.b($$2) * 1.2F * $$1;
      this.j.e = azk.b($$2 + (float) Math.PI) * 1.2F * $$1;
      this.k.e = this.j.e;
      this.l.e = this.i.e;
   }
}
