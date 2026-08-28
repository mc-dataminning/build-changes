public class gfg implements gfj<doy> {
   private final fwv a;
   private final fwv b;

   public gfg(gfk.a $$0) {
      this.a = $$0.a(fwu.j);
      this.b = $$0.a(fwu.i);
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("main", fxa.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fwx.a);
      $$1.a("left_leg", fxa.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fwx.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxa.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fwx.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxb.a($$0, 64, 64);
   }

   public static fxb c() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("main", fxa.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fwx.a);
      $$1.a("left_leg", fxa.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fwx.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxa.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fwx.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxb.a($$0, 64, 64);
   }

   public void a(doy $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      gqy $$6 = gdy.p[$$0.c().a()];
      dbt $$7 = $$0.i();
      if ($$7 != null) {
         drx $$8 = $$0.n();
         dhb.c<? extends doy> $$9 = dhb.a(dpe.y, den::h, den::g, dfx.c, $$8, $$7, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gfm<>()).get($$4);
         this.a($$2, $$3, $$8.c(den.b) == dsk.a ? this.a : this.b, $$8.c(den.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, je.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, je.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ezt $$0, gdj $$1, fwv $$2, je $$3, gqy $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      ezx $$8 = $$4.a($$1, gdr::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
