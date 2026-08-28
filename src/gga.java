public class gga implements ggd<dpl> {
   private final fxo a;
   private final fxo b;

   public gga(gge.a $$0) {
      this.a = $$0.a(fxn.j);
      this.b = $$0.a(fxn.i);
   }

   public static fxu b() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("main", fxt.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxq.a);
      $$1.a("left_leg", fxt.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fxt.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fxq.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fxu.a($$0, 64, 64);
   }

   public static fxu c() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("main", fxt.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fxq.a);
      $$1.a("left_leg", fxt.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxq.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fxt.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fxq.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fxu.a($$0, 64, 64);
   }

   public void a(dpl $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
      grs $$6 = ges.r[$$0.c().a()];
      dcf $$7 = $$0.i();
      if ($$7 != null) {
         dsk $$8 = $$0.n();
         dho.c<? extends dpl> $$9 = dho.a(dpr.y, dfa::h, dfa::g, dgk.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new ggg<>()).get($$4);
         this.a($$2, $$3, $$8.c(dfa.b) == dsx.a ? this.a : this.b, $$8.c(dfa.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jf.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jf.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fam $$0, ged $$1, fxo $$2, jf $$3, grs $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      faq $$8 = $$4.a($$1, gel::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
