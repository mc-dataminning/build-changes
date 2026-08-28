public class gec extends gby<hai> {
   public static final gfj a = gfj.scaling(0.5F);
   private static final String b = "right_bottom_bristle";
   private static final String c = "right_middle_bristle";
   private static final String d = "right_top_bristle";
   private static final String e = "left_top_bristle";
   private static final String f = "left_middle_bristle";
   private static final String g = "left_bottom_bristle";
   private final gfa i;
   private final gfa j;
   private final gfa k;
   private final gfa l;
   private final gfa m;
   private final gfa n;
   private final gfa o;
   private final gfa p;
   private final gfa q;

   public gec(gfa $$0) {
      super($$0);
      this.i = $$0.b("right_leg");
      this.j = $$0.b("left_leg");
      this.k = $$0.b("body");
      this.l = this.k.b("right_bottom_bristle");
      this.m = this.k.b("right_middle_bristle");
      this.n = this.k.b("right_top_bristle");
      this.o = this.k.b("left_top_bristle");
      this.p = this.k.b("left_middle_bristle");
      this.q = this.k.b("left_bottom_bristle");
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("right_leg", gff.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), gfc.a(-4.0F, 8.0F, 0.0F));
      $$1.a("left_leg", gff.c().a(0, 55).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), gfc.a(4.0F, 8.0F, 0.0F));
      gfk $$2 = $$1.a("body", gff.c().a(0, 0).a(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F), gfc.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_bottom_bristle", gff.c().a(16, 65).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gfc.a(-8.0F, 4.0F, -8.0F, 0.0F, 0.0F, -1.2217305F));
      $$2.a("right_middle_bristle", gff.c().a(16, 49).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gfc.a(-8.0F, -1.0F, -8.0F, 0.0F, 0.0F, -1.134464F));
      $$2.a("right_top_bristle", gff.c().a(16, 33).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gfc.a(-8.0F, -5.0F, -8.0F, 0.0F, 0.0F, -0.87266463F));
      $$2.a("left_top_bristle", gff.c().a(16, 33).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gfc.a(8.0F, -6.0F, -8.0F, 0.0F, 0.0F, 0.87266463F));
      $$2.a("left_middle_bristle", gff.c().a(16, 49).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gfc.a(8.0F, -2.0F, -8.0F, 0.0F, 0.0F, 1.134464F));
      $$2.a("left_bottom_bristle", gff.c().a(16, 65).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gfc.a(8.0F, 3.0F, -8.0F, 0.0F, 0.0F, 1.2217305F));
      return gfg.a($$0, 64, 128);
   }

   public void a(hai $$0) {
      super.a($$0);
      float $$1 = $$0.ad;
      float $$2 = Math.min($$0.ae, 0.25F);
      if (!$$0.c) {
         this.k.e = $$0.ab * (float) (Math.PI / 180.0);
         this.k.f = $$0.aa * (float) (Math.PI / 180.0);
      } else {
         this.k.e = 0.0F;
         this.k.f = 0.0F;
      }

      float $$3 = 1.5F;
      this.k.g = 0.1F * ayy.a($$1 * 1.5F) * 4.0F * $$2;
      this.k.c = 2.0F;
      this.k.c = this.k.c - 2.0F * ayy.b($$1 * 1.5F) * 2.0F * $$2;
      this.j.e = ayy.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.i.e = ayy.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.j.g = (float) (Math.PI / 18) * ayy.b($$1 * 1.5F * 0.5F) * $$2;
      this.i.g = (float) (Math.PI / 18) * ayy.b($$1 * 1.5F * 0.5F + (float) Math.PI) * $$2;
      this.j.c = 8.0F + 2.0F * ayy.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.i.c = 8.0F + 2.0F * ayy.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.l.g = -1.2217305F;
      this.m.g = -1.134464F;
      this.n.g = -0.87266463F;
      this.o.g = 0.87266463F;
      this.p.g = 1.134464F;
      this.q.g = 1.2217305F;
      float $$4 = ayy.b($$1 * 1.5F + (float) Math.PI) * $$2;
      this.l.g += $$4 * 1.3F;
      this.m.g += $$4 * 1.2F;
      this.n.g += $$4 * 0.6F;
      this.o.g += $$4 * 0.6F;
      this.p.g += $$4 * 1.2F;
      this.q.g += $$4 * 1.3F;
      float $$5 = 1.0F;
      float $$6 = 1.0F;
      this.l.g = this.l.g + 0.05F * ayy.a($$0.u * 1.0F * -0.4F);
      this.m.g = this.m.g + 0.1F * ayy.a($$0.u * 1.0F * 0.2F);
      this.n.g = this.n.g + 0.1F * ayy.a($$0.u * 1.0F * 0.4F);
      this.o.g = this.o.g + 0.1F * ayy.a($$0.u * 1.0F * 0.4F);
      this.p.g = this.p.g + 0.1F * ayy.a($$0.u * 1.0F * 0.2F);
      this.q.g = this.q.g + 0.05F * ayy.a($$0.u * 1.0F * -0.4F);
   }
}
