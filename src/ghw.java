import java.util.Set;

public class ghw extends ggk<heo> {
   private static final float a = 50.0F;
   private static final float b = -40.0F;
   private static final float c = 0.6F;
   private static final gjx d = gjx.scaling(0.6F);
   private static final gjx e = new gff(true, 22.0F, 2.0F, 2.65F, 2.5F, 36.0F, Set.of("head", "left_ear", "right_ear", "nose"));
   private static final String f = "left_haunch";
   private static final String g = "right_haunch";
   private final gjo i;
   private final gjo j;
   private final gjo k;
   private final gjo l;
   private final gjo m;

   public ghw(gjo $$0) {
      super($$0);
      this.i = $$0.b("left_haunch");
      this.j = $$0.b("right_haunch");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_front_leg");
      this.m = $$0.b("head");
   }

   public static gju a(boolean $$0) {
      gjw $$1 = new gjw();
      gjy $$2 = $$1.a();
      gjy $$3 = $$2.a("left_haunch", gjt.c().a(30, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gjq.a(3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      gjy $$4 = $$2.a("right_haunch", gjt.c().a(16, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), gjq.a(-3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      $$3.a("left_hind_foot", gjt.c().a(26, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gjq.b(0.36651915F, 0.0F, 0.0F));
      $$4.a("right_hind_foot", gjt.c().a(8, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), gjq.b(0.36651915F, 0.0F, 0.0F));
      $$2.a("body", gjt.c().a(0, 0).a(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), gjq.a(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$2.a("left_front_leg", gjt.c().a(8, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gjq.a(3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      $$2.a("right_front_leg", gjt.c().a(0, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), gjq.a(-3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      gjy $$5 = $$2.a("head", gjt.c().a(32, 0).a(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), gjq.a(0.0F, 16.0F, -1.0F));
      $$5.a("right_ear", gjt.c().a(52, 0).a(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gjq.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 12), 0.0F));
      $$5.a("left_ear", gjt.c().a(58, 0).a(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), gjq.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F));
      $$2.a("tail", gjt.c().a(52, 6).a(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), gjq.a(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      $$5.a("nose", gjt.c().a(32, 9).a(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), gjq.a);
      return gju.a($$1, 64, 32).a($$0 ? e : d);
   }

   public void a(heo $$0) {
      super.a($$0);
      this.m.e = $$0.ab * (float) (Math.PI / 180.0);
      this.m.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$1 = azm.a($$0.a * (float) Math.PI);
      this.i.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.j.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.k.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
      this.l.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
   }
}
