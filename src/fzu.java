public class fzu<S extends gvx> extends fym<S> {
   public fzu(gbb $$0) {
      super($$0);
   }

   public static gbh c() {
      gbj $$0 = fym.a(gbf.a, 0.0F);
      gbl $$1 = $$0.a();
      a($$1);
      return gbh.a($$0, 64, 32);
   }

   protected static void a(gbl $$0) {
      $$0.a("right_arm", gbg.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbd.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", gbg.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbd.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", gbg.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbd.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", gbg.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), gbd.a(2.0F, 12.0F, 0.0F));
   }

   protected fym.a a(S $$0, bup $$1) {
      return $$0.aX_().a(cwb.ow) && $$0.b && $$0.ap == $$1 ? fym.a.d : fym.a.a;
   }

   public void a(S $$0) {
      super.a($$0);
      cvx $$1 = $$0.aX_();
      if ($$0.b && !$$1.a(cwb.ow)) {
         float $$2 = $$0.C;
         float $$3 = azj.a($$2 * (float) Math.PI);
         float $$4 = azj.a((1.0F - (1.0F - $$2) * (1.0F - $$2)) * (float) Math.PI);
         this.r.g = 0.0F;
         this.s.g = 0.0F;
         this.r.f = -(0.1F - $$3 * 0.6F);
         this.s.f = 0.1F - $$3 * 0.6F;
         this.r.e = (float) (-Math.PI / 2);
         this.s.e = (float) (-Math.PI / 2);
         this.r.e -= $$3 * 1.2F - $$4 * 0.4F;
         this.s.e -= $$3 * 1.2F - $$4 * 0.4F;
         fwu.a(this.r, this.s, $$0.p);
      }
   }

   @Override
   public void a(bup $$0, fdt $$1) {
      this.e().a($$1);
      float $$2 = $$0 == bup.b ? 1.0F : -1.0F;
      gbb $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
