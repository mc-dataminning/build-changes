public class gfu implements gfx<dpj> {
   private final fxi a;
   private final fxi b;

   public gfu(gfy.a $$0) {
      this.a = $$0.a(fxh.j);
      this.b = $$0.a(fxh.i);
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("main", fxn.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxk.a);
      $$1.a("left_leg", fxn.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxk.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxn.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxk.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxo.a($$0, 64, 64);
   }

   public static fxo c() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("main", fxn.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxk.a);
      $$1.a("left_leg", fxn.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxk.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxn.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxk.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxo.a($$0, 64, 64);
   }

   public void a(dpj $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      grm $$6 = gem.p[$$0.c().a()];
      dcd $$7 = $$0.i();
      if ($$7 != null) {
         dsh $$8 = $$0.n();
         dhm.c<? extends dpj> $$9 = dhm.a(dpp.y, dey::h, dey::g, dgi.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gga<>()).get($$4);
         this.a($$2, $$3, $$8.c(dey.b) == dsu.a ? this.a : this.b, $$8.c(dey.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jf.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jf.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fag $$0, gdx $$1, fxi $$2, jf $$3, grm $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fak $$8 = $$4.a($$1, gef::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
