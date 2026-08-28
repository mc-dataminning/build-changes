public class geu<S extends hbc> extends gco<S> implements gem {
   private final gfd a = this.p.b("hat_rim");

   public geu(gfd $$0) {
      super($$0);
   }

   public static gfj a() {
      gfl $$0 = gco.a(gfh.a, 0.0F);
      gfn $$1 = $$0.a();
      gfn $$2 = $$1.a("head", new gfi().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gff.a);
      gfn $$3 = $$2.a("hat", gfi.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gfh(0.5F)), gff.a);
      $$3.a("hat_rim", gfi.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gff.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gfi.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gfh(0.05F)), gff.a);
      $$1.a("right_arm", gfi.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gfi.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gfi.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gfi.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gff.a(2.0F, 12.0F, 0.0F));
      return gfj.a($$0, 64, 64);
   }

   public static gfj a(gfh $$0) {
      gfl $$1 = gco.a($$0, 0.0F);
      gfn $$2 = $$1.a();
      gfn $$3 = $$2.a("head", gfi.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gff.a);
      $$2.a("body", gfi.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gff.a);
      $$2.a("right_leg", gfi.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gff.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gfi.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gff.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gfi.c(), gff.a);
      return gfj.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gat.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(ffu $$0) {
      this.a(bvb.b, $$0);
   }
}
