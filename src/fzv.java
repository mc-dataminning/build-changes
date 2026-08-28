import java.util.Set;

public class fzv extends fyk<gwb> {
   private static final float a = 50.0F;
   private static final float b = -40.0F;
   private static final float c = 0.6F;
   private static final gbv d = gbv.scaling(0.6F);
   private static final gbv e = new fxm(true, 22.0F, 2.0F, 2.65F, 2.5F, 36.0F, Set.of("head", "left_ear", "right_ear", "nose"));
   private static final String f = "left_haunch";
   private static final String g = "right_haunch";
   private final gbm i;
   private final gbm j;
   private final gbm k;
   private final gbm l;
   private final gbm m;
   private final gbm n;
   private final gbm o;
   private final gbm p;
   private final gbm q;
   private final gbm r;

   public fzv(gbm $$0) {
      super($$0);
      this.i = $$0.b("left_hind_foot");
      this.j = $$0.b("right_hind_foot");
      this.k = $$0.b("left_haunch");
      this.l = $$0.b("right_haunch");
      this.m = $$0.b("left_front_leg");
      this.n = $$0.b("right_front_leg");
      this.o = $$0.b("head");
      this.p = $$0.b("right_ear");
      this.q = $$0.b("left_ear");
      this.r = $$0.b("nose");
   }

   public static gbs a(boolean $$0) {
      gbu $$1 = new gbu();
      gbw $$2 = $$1.a();
      $$2.a("left_hind_foot", gbr.c().a(26, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gbo.a(3.0F, 17.5F, 3.7F));
      $$2.a("right_hind_foot", gbr.c().a(8, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gbo.a(-3.0F, 17.5F, 3.7F));
      $$2.a("left_haunch", gbr.c().a(30, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gbo.a(3.0F, 17.5F, 3.7F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$2.a("right_haunch", gbr.c().a(16, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gbo.a(-3.0F, 17.5F, 3.7F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$2.a("body", gbr.c().a(0, 0).a(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), gbo.a(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$2.a("left_front_leg", gbr.c().a(8, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gbo.a(3.0F, 17.0F, -1.0F, (float) (-Math.PI / 18), 0.0F, 0.0F));
      $$2.a("right_front_leg", gbr.c().a(0, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gbo.a(-3.0F, 17.0F, -1.0F, (float) (-Math.PI / 18), 0.0F, 0.0F));
      $$2.a("head", gbr.c().a(32, 0).a(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), gbo.a(0.0F, 16.0F, -1.0F));
      $$2.a("right_ear", gbr.c().a(52, 0).a(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gbo.a(0.0F, 16.0F, -1.0F, 0.0F, (float) (-Math.PI / 12), 0.0F));
      $$2.a("left_ear", gbr.c().a(58, 0).a(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gbo.a(0.0F, 16.0F, -1.0F, 0.0F, (float) (Math.PI / 12), 0.0F));
      $$2.a("tail", gbr.c().a(52, 6).a(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), gbo.a(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      $$2.a("nose", gbr.c().a(32, 9).a(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), gbo.a(0.0F, 16.0F, -1.0F));
      return gbs.a($$1, 64, 32).a($$0 ? e : d);
   }

   public void a(gwb $$0) {
      super.a($$0);
      this.r.e = $$0.V * (float) (Math.PI / 180.0);
      this.o.e = $$0.V * (float) (Math.PI / 180.0);
      this.p.e = $$0.V * (float) (Math.PI / 180.0);
      this.q.e = $$0.V * (float) (Math.PI / 180.0);
      this.r.f = $$0.U * (float) (Math.PI / 180.0);
      this.o.f = $$0.U * (float) (Math.PI / 180.0);
      this.p.f = this.r.f - (float) (Math.PI / 12);
      this.q.f = this.r.f + (float) (Math.PI / 12);
      float $$1 = azk.a($$0.a * (float) Math.PI);
      this.k.e = ($$1 * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.l.e = ($$1 * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.i.e = $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.j.e = $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.m.e = ($$1 * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
      this.n.e = ($$1 * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
   }
}
