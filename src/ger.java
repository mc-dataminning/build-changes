public class ger<S extends haz> extends gcl<S> implements gej {
   private final gfa a = this.p.b("hat_rim");

   public ger(gfa $$0) {
      super($$0);
   }

   public static gfg a() {
      gfi $$0 = gcl.a(gfe.a, 0.0F);
      gfk $$1 = $$0.a();
      gfk $$2 = $$1.a("head", new gff().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gfc.a);
      gfk $$3 = $$2.a("hat", gff.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gfe(0.5F)), gfc.a);
      $$3.a("hat_rim", gff.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gfc.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gff.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gfe(0.05F)), gfc.a);
      $$1.a("right_arm", gff.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfc.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gff.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfc.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gff.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfc.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gff.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gfc.a(2.0F, 12.0F, 0.0F));
      return gfg.a($$0, 64, 64);
   }

   public static gfg a(gfe $$0) {
      gfi $$1 = gcl.a($$0, 0.0F);
      gfk $$2 = $$1.a();
      gfk $$3 = $$2.a("head", gff.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gfc.a);
      $$2.a("body", gff.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfc.a);
      $$2.a("right_leg", gff.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfc.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gff.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gfc.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gff.c(), gfc.a);
      return gfg.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.H;
      gaq.a(this.s, this.r, $$0.a, $$1, $$0.u);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(ffs $$0) {
      this.a(buz.b, $$0);
   }
}
