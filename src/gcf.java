public class gcf extends gcb<gyu> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gfd d = this.v.b("body");
   private final gfd e = this.d.b("head");
   private final gfd f = this.e.b("eyes");
   private final gfd g = this.d.b("tongue");
   private final gfd i = this.d.b("left_arm");
   private final gfd j = this.d.b("right_arm");
   private final gfd k = this.v.b("left_leg");
   private final gfd l = this.v.b("right_leg");
   private final gfd m = this.d.b("croaking_body");

   public gcf(gfd $$0) {
      super($$0.b("root"));
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfn $$2 = $$1.a("root", gfi.c(), gff.a(0.0F, 24.0F, 0.0F));
      gfn $$3 = $$2.a(
         "body", gfi.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gff.a(0.0F, -2.0F, 4.0F)
      );
      gfn $$4 = $$3.a(
         "head", gfi.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gff.a(0.0F, -2.0F, -1.0F)
      );
      gfn $$5 = $$4.a("eyes", gfi.c(), gff.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gfi.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gff.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gfi.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gff.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gfi.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gfh(-0.1F)), gff.a(0.0F, -1.0F, -5.0F));
      gfn $$6 = $$3.a("tongue", gfi.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gff.a(0.0F, -1.01F, 1.0F));
      gfn $$7 = $$3.a("left_arm", gfi.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gff.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gfi.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gff.a(0.0F, 3.0F, -1.0F));
      gfn $$8 = $$3.a("right_arm", gfi.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gff.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gfi.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gff.a(0.0F, 3.0F, 0.0F));
      gfn $$9 = $$2.a("left_leg", gfi.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gff.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gfi.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gff.a(2.0F, 3.0F, 0.0F));
      gfn $$10 = $$2.a("right_leg", gfi.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gff.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gfi.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gff.a(-2.0F, 3.0F, 0.0F));
      return gfj.a($$0, 48, 48);
   }

   public void a(gyu $$0) {
      super.a($$0);
      this.a($$0.b, fmf.c, $$0.u);
      this.a($$0.c, fmf.a, $$0.u);
      this.a($$0.d, fmf.d, $$0.u);
      if ($$0.a) {
         this.a(fmf.e, $$0.ad, $$0.ae, 1.0F, 2.5F);
      } else {
         this.a(fmf.b, $$0.ad, $$0.ae, 1.5F, 2.5F);
      }

      this.a($$0.e, fmf.f, $$0.u);
      this.m.k = $$0.c.b();
   }
}
