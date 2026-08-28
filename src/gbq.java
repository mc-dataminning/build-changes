public class gbq extends gby<gya> {
   private final gfa a;
   private final gfa b;
   private final gfa c;
   private final gfa d;
   private final gfa e;
   private static final int f = 6;

   public gbq(gfa $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.c = $$0.b("right_hind_leg");
      this.b = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.d = $$0.b("left_front_leg");
   }

   public static gfg a(gfe $$0) {
      gfi $$1 = new gfi();
      gfk $$2 = $$1.a();
      $$2.a("head", gff.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gfc.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", gff.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gfc.a(0.0F, 6.0F, 0.0F));
      gff $$3 = gff.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, gfc.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, gfc.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, gfc.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, gfc.a(2.0F, 18.0F, -4.0F));
      return gfg.a($$1, 64, 32);
   }

   public void a(gya $$0) {
      super.a($$0);
      this.a.f = $$0.aa * (float) (Math.PI / 180.0);
      this.a.e = $$0.ab * (float) (Math.PI / 180.0);
      float $$1 = $$0.ae;
      float $$2 = $$0.ad;
      this.b.e = ayy.b($$2 * 0.6662F) * 1.4F * $$1;
      this.c.e = ayy.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.d.e = ayy.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = ayy.b($$2 * 0.6662F) * 1.4F * $$1;
   }
}
