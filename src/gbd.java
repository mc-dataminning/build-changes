public class gbd extends gcb<gxt> {
   private final gfd a;
   private final gfd b;
   private final gfd c;
   private final gfd d;
   private final gfd e;
   private final gfd f;
   private final gfd g;

   public gbd(gfd $$0) {
      super($$0, gmi::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfn $$2 = $$1.a("body", gfi.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gff.a(0.0F, 17.0F, 0.0F));
      gfn $$3 = $$1.a("head", gfi.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gff.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gfi.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gff.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gfi.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gff.a(1.1F, -3.0F, 0.0F));
      gfn $$4 = $$2.a("right_wing", gfi.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gff.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gfi.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gff.a(-2.0F, 0.0F, 0.0F));
      gfn $$5 = $$2.a("left_wing", gfi.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gff.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gfi.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gff.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gfi.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gff.a(0.0F, 5.0F, 0.0F));
      return gfj.a($$0, 32, 32);
   }

   public void a(gxt $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.aa);
      }

      this.a($$0.b, fmb.b, $$0.u, 1.0F);
      this.a($$0.c, fmb.a, $$0.u, 1.0F);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
