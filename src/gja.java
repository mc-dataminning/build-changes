public class gja extends glg {
   private final float a;
   private final float b;

   gja(ggy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hcn $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gkk b() {
      return gkk.a;
   }

   protected gja(ggy $$0, double $$1, double $$2, double $$3, hcn $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hfr $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(fmg.Q().a(hfq.d).apply(hfg.c()));
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

   public static class a extends gja.b<lx> {
      public gkg a(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gja($$1, $$2, $$3, $$4, this.a(new cxh(cxl.cT), $$1));
      }
   }

   public abstract static class b<T extends lr> implements gkj<T> {
      private final hcn a = new hcn();

      protected hcn a(cxh $$0, ggy $$1) {
         fmg.Q().bf().a(this.a, $$0, cxf.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gja.b<lp> {
      public gkg a(lp $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gja($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gja.b<lx> {
      public gkg a(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gja($$1, $$2, $$3, $$4, this.a(new cxh(cxl.rz), $$1));
      }
   }

   public static class e extends gja.b<lx> {
      public gkg a(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gja($$1, $$2, $$3, $$4, this.a(new cxh(cxl.rl), $$1));
      }
   }
}
