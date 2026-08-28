public class gib extends gkh {
   private final float a;
   private final float b;

   gib(gfz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hbo $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gjl b() {
      return gjl.a;
   }

   protected gib(gfz $$0, double $$1, double $$2, double $$3, hbo $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hes $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(flj.Q().a(her.d).apply(heh.c()));
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

   public static class a extends gib.b<lx> {
      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gib($$1, $$2, $$3, $$4, this.a(new cwp(cwt.cT), $$1));
      }
   }

   public abstract static class b<T extends lr> implements gjk<T> {
      private final hbo a = new hbo();

      protected hbo a(cwp $$0, gfz $$1) {
         flj.Q().bf().a(this.a, $$0, cwn.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gib.b<lp> {
      public gjh a(lp $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gib($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gib.b<lx> {
      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gib($$1, $$2, $$3, $$4, this.a(new cwp(cwt.rx), $$1));
      }
   }

   public static class e extends gib.b<lx> {
      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gib($$1, $$2, $$3, $$4, this.a(new cwp(cwt.rj), $$1));
      }
   }
}
