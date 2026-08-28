public class gfn implements gfq<dpf> {
   private final fxc a;
   private final fxc b;

   public gfn(gfr.a $$0) {
      this.a = $$0.a(fxb.j);
      this.b = $$0.a(fxb.i);
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("main", fxh.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxe.a);
      $$1.a("left_leg", fxh.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxe.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxh.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxe.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxi.a($$0, 64, 64);
   }

   public static fxi c() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      $$1.a("main", fxh.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxe.a);
      $$1.a("left_leg", fxh.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxe.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxh.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxe.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxi.a($$0, 64, 64);
   }

   public void a(dpf $$0, float $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      grf $$6 = gef.p[$$0.c().a()];
      dca $$7 = $$0.i();
      if ($$7 != null) {
         dse $$8 = $$0.n();
         dhi.c<? extends dpf> $$9 = dhi.a(dpl.y, deu::h, deu::g, dge.c, $$8, $$7, $$0.ay_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gft<>()).get($$4);
         this.a($$2, $$3, $$8.c(deu.b) == dsr.a ? this.a : this.b, $$8.c(deu.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, je.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, je.d, $$6, $$4, $$5, true);
      }
   }

   private void a(faa $$0, gdq $$1, fxc $$2, je $$3, grf $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fae $$8 = $$4.a($$1, gdy::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
