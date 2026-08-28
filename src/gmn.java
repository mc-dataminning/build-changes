public class gmn extends gou {
   private final float a;
   private final float b;

   gmn(gkl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hgc $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gny b() {
      return gny.a;
   }

   protected gmn(gkl $$0, double $$1, double $$2, double $$3, hgc $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hjk $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(fpo.Q().a(hjj.c).apply(hiz.c()));
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

   public static class a extends gmn.b<mc> {
      public gnu a(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmn($$1, $$2, $$3, $$4, this.a(new czk(czo.cT), $$1));
      }
   }

   public abstract static class b<T extends lw> implements gnx<T> {
      private final hgc a = new hgc();

      protected hgc a(czk $$0, gkl $$1) {
         fpo.Q().bf().a(this.a, $$0, czi.h, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gmn.b<lu> {
      public gnu a(lu $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmn($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gmn.b<mc> {
      public gnu a(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmn($$1, $$2, $$3, $$4, this.a(new czk(czo.rG), $$1));
      }
   }

   public static class e extends gmn.b<mc> {
      public gnu a(mc $$0, gkl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmn($$1, $$2, $$3, $$4, this.a(new czk(czo.rs), $$1));
      }
   }
}
