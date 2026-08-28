public class gmb extends goi {
   private final float a;
   private final float b;

   gmb(gjz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hfq $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gnm b() {
      return gnm.a;
   }

   protected gmb(gjz $$0, double $$1, double $$2, double $$3, hfq $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hix $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(foz.Q().a(hiw.d).apply(him.c()));
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

   public static class a extends gmb.b<mb> {
      public gni a(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmb($$1, $$2, $$3, $$4, this.a(new czd(czh.cT), $$1));
      }
   }

   public abstract static class b<T extends lv> implements gnl<T> {
      private final hfq a = new hfq();

      protected hfq a(czd $$0, gjz $$1) {
         foz.Q().bf().a(this.a, $$0, czb.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gmb.b<lt> {
      public gni a(lt $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmb($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gmb.b<mb> {
      public gni a(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmb($$1, $$2, $$3, $$4, this.a(new czd(czh.rG), $$1));
      }
   }

   public static class e extends gmb.b<mb> {
      public gni a(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gmb($$1, $$2, $$3, $$4, this.a(new czd(czh.rs), $$1));
      }
   }
}
