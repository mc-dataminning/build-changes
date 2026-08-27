public class geh implements gek<doc> {
   private final fvw a;
   private final fvw b;

   public geh(gel.a $$0) {
      this.a = $$0.a(fvv.j);
      this.b = $$0.a(fvv.i);
   }

   public static fwc b() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("main", fwb.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fvy.a);
      $$1.a("left_leg", fwb.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fvy.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fwb.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fvy.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fwc.a($$0, 64, 64);
   }

   public static fwc c() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("main", fwb.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fvy.a);
      $$1.a("left_leg", fwb.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fvy.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fwb.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fvy.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fwc.a($$0, 64, 64);
   }

   public void a(doc $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      gpz $$6 = gcz.p[$$0.c().a()];
      dax $$7 = $$0.i();
      if ($$7 != null) {
         drb $$8 = $$0.n();
         dgf.c<? extends doc> $$9 = dgf.a(doi.y, ddr::h, ddr::g, dfb.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gen<>()).get($$4);
         this.a($$2, $$3, $$8.c(ddr.b) == dro.a ? this.a : this.b, $$8.c(ddr.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, it.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, it.d, $$6, $$4, $$5, true);
      }
   }

   private void a(eys $$0, gck $$1, fvw $$2, it $$3, gpz $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eyw $$8 = $$4.a($$1, gcs::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
