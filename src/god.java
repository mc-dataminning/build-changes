public class god extends gqk {
   private final float a;
   private final float b;

   god(gmb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hhs $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gpo b() {
      return gpo.a;
   }

   protected god(gmb $$0, double $$1, double $$2, double $$3, hhs $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hla $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(frd.Q().a(hkz.c).apply(hkp.c()));
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

   public static class a extends god.b<mc> {
      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new god($$1, $$2, $$3, $$4, this.a(new czy(dac.cT), $$1));
      }
   }

   public abstract static class b<T extends lw> implements gpn<T> {
      private final hhs a = new hhs();

      protected hhs a(czy $$0, gmb $$1) {
         frd.Q().bf().a(this.a, $$0, czw.h, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends god.b<lu> {
      public gpk a(lu $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new god($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends god.b<mc> {
      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new god($$1, $$2, $$3, $$4, this.a(new czy(dac.rG), $$1));
      }
   }

   public static class e extends god.b<mc> {
      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new god($$1, $$2, $$3, $$4, this.a(new czy(dac.rs), $$1));
      }
   }
}
