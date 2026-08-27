public class fvq implements fvt<dgz> {
   private final fnj a;
   private final fnj b;

   public fvq(fvu.a $$0) {
      this.a = $$0.a(fni.j);
      this.b = $$0.a(fni.i);
   }

   public static fnp b() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("main", fno.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fnl.a);
      $$1.a("left_leg", fno.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fnl.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fno.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fnl.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fnp.a($$0, 64, 64);
   }

   public static fnp c() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("main", fno.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fnl.a);
      $$1.a("left_leg", fno.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fnl.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fno.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fnl.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fnp.a($$0, 64, 64);
   }

   public void a(dgz $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      ghe $$6 = fui.p[$$0.d().a()];
      ctx $$7 = $$0.i();
      if ($$7 != null) {
         djp $$8 = $$0.r();
         czf.c<? extends dgz> $$9 = czf.a(dhf.y, cwr::h, cwr::g, cyb.c, $$8, $$7, $$0.aE_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new fvw<>()).get($$4);
         this.a($$2, $$3, $$8.c(cwr.b) == dkc.a ? this.a : this.b, $$8.c(cwr.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ic.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ic.d, $$6, $$4, $$5, true);
      }
   }

   private void a(eqk $$0, ftt $$1, fnj $$2, ic $$3, ghe $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      eqo $$8 = $$4.a($$1, fub::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
