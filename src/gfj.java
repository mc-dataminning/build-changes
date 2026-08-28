public class gfj implements gfm<dpb> {
   private final fwy a;
   private final fwy b;

   public gfj(gfn.a $$0) {
      this.a = $$0.a(fwx.j);
      this.b = $$0.a(fwx.i);
   }

   public static fxe b() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("main", fxd.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxa.a);
      $$1.a("left_leg", fxd.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxa.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxd.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxa.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxe.a($$0, 64, 64);
   }

   public static fxe c() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("main", fxd.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxa.a);
      $$1.a("left_leg", fxd.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxa.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxd.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxa.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxe.a($$0, 64, 64);
   }

   public void a(dpb $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      grb $$6 = geb.p[$$0.c().a()];
      dbw $$7 = $$0.i();
      if ($$7 != null) {
         dsa $$8 = $$0.n();
         dhe.c<? extends dpb> $$9 = dhe.a(dph.y, deq::h, deq::g, dga.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gfp<>()).get($$4);
         this.a($$2, $$3, $$8.c(deq.b) == dsn.a ? this.a : this.b, $$8.c(deq.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, je.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, je.d, $$6, $$4, $$5, true);
      }
   }

   private void a(ezw $$0, gdm $$1, fwy $$2, je $$3, grb $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      faa $$8 = $$4.a($$1, gdu::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
