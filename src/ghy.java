public class ghy extends gke {
   private final float a;
   private final float b;

   ghy(gfw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hbk $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gji b() {
      return gji.a;
   }

   protected ghy(gfw $$0, double $$1, double $$2, double $$3, hbk $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hem $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(flh.Q().a(hel.d).apply(heb.c()));
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

   public static class a extends ghy.b<lx> {
      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghy($$1, $$2, $$3, $$4, this.a(new cwn(cwr.cT), $$1));
      }
   }

   public abstract static class b<T extends lr> implements gjh<T> {
      private final hbk a = new hbk();

      protected hbk a(cwn $$0, gfw $$1) {
         flh.Q().bf().a(this.a, $$0, cwl.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends ghy.b<lp> {
      public gje a(lp $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghy($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends ghy.b<lx> {
      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghy($$1, $$2, $$3, $$4, this.a(new cwn(cwr.rx), $$1));
      }
   }

   public static class e extends ghy.b<lx> {
      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghy($$1, $$2, $$3, $$4, this.a(new cwn(cwr.rj), $$1));
      }
   }
}
