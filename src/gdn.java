import java.util.Set;

public class gdn extends gcc<haa> {
   private static final float a = 50.0F;
   private static final float b = -40.0F;
   private static final float c = 0.6F;
   private static final gfn d = gfn.scaling(0.6F);
   private static final gfn e = new gbb(true, 22.0F, 2.0F, 2.65F, 2.5F, 36.0F, Set.of("head", "left_ear", "right_ear", "nose"));
   private static final String f = "left_haunch";
   private static final String g = "right_haunch";
   private final gfe i;
   private final gfe j;
   private final gfe k;
   private final gfe l;
   private final gfe m;

   public gdn(gfe $$0) {
      super($$0);
      this.i = $$0.b("left_haunch");
      this.j = $$0.b("right_haunch");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_front_leg");
      this.m = $$0.b("head");
   }

   public static gfk a(boolean $$0) {
      gfm $$1 = new gfm();
      gfo $$2 = $$1.a();
      gfo $$3 = $$2.a("left_haunch", gfj.c().a(30, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gfg.a(3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      gfo $$4 = $$2.a("right_haunch", gfj.c().a(16, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gfg.a(-3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      $$3.a("left_hind_foot", gfj.c().a(26, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gfg.b(0.36651915F, 0.0F, 0.0F));
      $$4.a("right_hind_foot", gfj.c().a(8, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gfg.b(0.36651915F, 0.0F, 0.0F));
      $$2.a("body", gfj.c().a(0, 0).a(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), gfg.a(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$2.a("left_front_leg", gfj.c().a(8, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gfg.a(3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      $$2.a("right_front_leg", gfj.c().a(0, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gfg.a(-3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      gfo $$5 = $$2.a("head", gfj.c().a(32, 0).a(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), gfg.a(0.0F, 16.0F, -1.0F));
      $$5.a("right_ear", gfj.c().a(52, 0).a(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gfg.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 12), 0.0F));
      $$5.a("left_ear", gfj.c().a(58, 0).a(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gfg.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F));
      $$2.a("tail", gfj.c().a(52, 6).a(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), gfg.a(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      $$5.a("nose", gfj.c().a(32, 9).a(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), gfg.a);
      return gfk.a($$1, 64, 32).a($$0 ? e : d);
   }

   public void a(haa $$0) {
      super.a($$0);
      this.m.e = $$0.ab * (float) (Math.PI / 180.0);
      this.m.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$1 = ayz.a($$0.a * (float) Math.PI);
      this.i.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.j.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.k.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
      this.l.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
   }
}
