public class gic extends gki {
   private final float a;
   private final float b;

   gic(gga $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hbp $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gjm b() {
      return gjm.a;
   }

   protected gic(gga $$0, double $$1, double $$2, double $$3, hbp $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      het $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(flk.Q().a(hes.d).apply(hei.c()));
      }

      this.u = 1.0F;
      this.D /= 2.0F;
      this.a = this.r.i() * 3.0F;
      this.b = this.r.i() * 3.0F;
   }

   @Override
   protected float c() {
      return this.E.a((this.a + 1.0F) / 4.0F);
   }

   @Override
   protected float d() {
      return this.E.a(this.a / 4.0F);
   }

   @Override
   protected float e() {
      return this.E.c(this.b / 4.0F);
   }

   @Override
   protected float f() {
      return this.E.c((this.b + 1.0F) / 4.0F);
   }

   public static class a extends gic.b<lx> {
      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gic($$1, $$2, $$3, $$4, this.a(new cwq(cwu.cT), $$1));
      }
   }

   public abstract static class b<T extends lr> implements gjl<T> {
      private final hbp a = new hbp();

      protected hbp a(cwq $$0, gga $$1) {
         flk.Q().bf().a(this.a, $$0, cwo.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gic.b<lp> {
      public gji a(lp $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gic($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gic.b<lx> {
      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gic($$1, $$2, $$3, $$4, this.a(new cwq(cwu.rx), $$1));
      }
   }

   public static class e extends gic.b<lx> {
      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gic($$1, $$2, $$3, $$4, this.a(new cwq(cwu.rj), $$1));
      }
   }
}
