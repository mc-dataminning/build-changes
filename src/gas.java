public class gas<S extends gws> extends fym<S> implements gak {
   private final gbb a = this.p.b("hat_rim");

   public gas(gbb $$0) {
      super($$0);
   }

   public static gbh a() {
      gbj $$0 = fym.a(gbf.a, 0.0F);
      gbl $$1 = $$0.a();
      gbl $$2 = $$1.a("head", new gbg().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gbd.a);
      gbl $$3 = $$2.a("hat", gbg.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gbf(0.5F)), gbd.a);
      $$3.a("hat_rim", gbg.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gbd.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gbg.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gbf(0.05F)), gbd.a);
      $$1.a("right_arm", gbg.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbd.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gbg.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbd.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gbg.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbd.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gbg.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gbd.a(2.0F, 12.0F, 0.0F));
      return gbh.a($$0, 64, 64);
   }

   public static gbh a(gbf $$0) {
      gbj $$1 = fym.a($$0, 0.0F);
      gbl $$2 = $$1.a();
      gbl $$3 = $$2.a("head", gbg.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gbd.a);
      $$2.a("body", gbg.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gbd.a);
      $$2.a("right_leg", gbg.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gbd.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gbg.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gbd.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gbg.c(), gbd.a);
      return gbh.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.C;
      fwu.a(this.s, this.r, $$0.a, $$1, $$0.p);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }
}
