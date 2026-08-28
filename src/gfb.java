public class gfb extends gfe {
   private final fyu a;
   private final gig b = gig.i(gns.a);

   gfb(gbx $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fyh(fja.Q().aT().a(gba.aq));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gfi b() {
      return gfi.d;
   }

   @Override
   public void a(fdx $$0, fij $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * azj.a($$3 * (float) Math.PI);
      int $$5 = axu.a($$4, 1.0F, 1.0F, 1.0F);
      fdt $$6 = new fdt();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      ghw.a $$8 = fja.Q().aS().c();
      fdx $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, gxj.d, $$5);
      $$8.b();
   }

   public static class a implements gfh<lu> {
      public gfe a(lu $$0, gbx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfb($$1, $$2, $$3, $$4);
      }
   }
}
