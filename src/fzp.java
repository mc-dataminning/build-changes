public class fzp implements fzs<dke> {
   private final frf a;
   private final frf b;

   public fzp(fzt.a $$0) {
      this.a = $$0.a(fre.j);
      this.b = $$0.a(fre.i);
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("main", frk.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), frh.a);
      $$1.a("left_leg", frk.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), frh.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", frk.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), frh.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return frl.a($$0, 64, 64);
   }

   public static frl c() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("main", frk.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), frh.a);
      $$1.a("left_leg", frk.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), frh.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", frk.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), frh.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return frl.a($$0, 64, 64);
   }

   public void a(dke $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      glf $$6 = fyh.p[$$0.c().a()];
      cxb $$7 = $$0.i();
      if ($$7 != null) {
         dnb $$8 = $$0.n();
         dcj.c<? extends dke> $$9 = dcj.a(dkk.y, czv::h, czv::g, dbf.c, $$8, $$7, $$0.aC_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fzv<>()).get($$4);
         this.a($$2, $$3, $$8.c(czv.b) == dno.a ? this.a : this.b, $$8.c(czv.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ih.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ih.d, $$6, $$4, $$5, true);
      }
   }

   private void a(eub $$0, fxs $$1, frf $$2, ih $$3, glf $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      euf $$8 = $$4.a($$1, fya::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
