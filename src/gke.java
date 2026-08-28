public class gke implements gkh<dsc> {
   private final fyu a;
   private final fyu b;

   public gke(gki.a $$0) {
      this.a = new fyu.a($$0.a(gba.p), gig::c);
      this.b = new fyu.a($$0.a(gba.o), gig::c);
   }

   public static gbh b() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("main", gbg.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gbd.a);
      $$1.a("left_leg", gbg.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gbd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gbg.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gbd.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gbh.a($$0, 64, 64);
   }

   public static gbh c() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("main", gbg.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gbd.a);
      $$1.a("left_leg", gbg.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gbd.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gbg.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gbd.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gbh.a($$0, 64, 64);
   }

   public void a(dsc $$0, float $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      hab $$6 = gir.r[$$0.c().a()];
      dev $$7 = $$0.i();
      if ($$7 != null) {
         dvd $$8 = $$0.m();
         dkf.c<? extends dsc> $$9 = dkf.a(dsi.y, dhr::i, dhr::h, djb.c, $$8, $$7, $$0.aC_(), ($$0x, $$1x) -> false);
         int $$10 = $$9.apply(new gkk<>()).get($$4);
         this.a($$2, $$3, $$8.c(dhr.b) == dvq.a ? this.a : this.b, $$8.c(dhr.aF), $$6, $$10, $$5, false);
      } else {
         this.a($$2, $$3, this.a, jl.d, $$6, $$4, $$5, false);
         this.a($$2, $$3, this.b, jl.d, $$6, $$4, $$5, true);
      }
   }

   private void a(fdt $$0, ghw $$1, fyu $$2, jl $$3, hab $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      $$0.a(0.0F, 0.5625F, $$7 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$3.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
      fdx $$8 = $$4.a($$1, gig::c);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }
}
