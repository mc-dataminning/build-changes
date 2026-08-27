public class gdb implements gde<dmz> {
   private final fur a;
   private final fur b;

   public gdb(gdf.a $$0) {
      this.a = $$0.a(fuq.j);
      this.b = $$0.a(fuq.i);
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("main", fuw.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fut.a);
      $$1.a("left_leg", fuw.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fut.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", fuw.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), fut.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return fux.a($$0, 64, 64);
   }

   public static fux c() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("main", fuw.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), fut.a);
      $$1.a("left_leg", fuw.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fut.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", fuw.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), fut.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return fux.a($$0, 64, 64);
   }

   public void a(dmz $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      gor $$6 = gbt.p[$$0.c().a()];
      czu $$7 = $$0.i();
      if ($$7 != null) {
         dpy $$8 = $$0.n();
         dfc.c<? extends dmz> $$9 = dfc.a(dnf.y, dco::h, dco::g, ddy.c, $$8, $$7, $$0.az_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gdh<>()).get($$4);
         this.a($$2, $$3, $$8.c(dco.b) == dql.a ? this.a : this.b, $$8.c(dco.aE), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, ir.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, ir.d, $$6, $$4, $$5, true);
      }
   }

   private void a(exn $$0, gbe $$1, fur $$2, ir $$3, gor $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      exr $$8 = $$4.a($$1, gbm::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
