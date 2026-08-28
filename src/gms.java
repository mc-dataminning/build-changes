public class gms extends goz {
   private final float a;
   private final float b;

   gms(gkq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hgi $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public god b() {
      return god.a;
   }

   protected gms(gkq $$0, double $$1, double $$2, double $$3, hgi $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hjq $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(fpt.Q().a(hjp.c).apply(hjf.c()));
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

   public static class a extends gms.b<mc> {
      public gnz a(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gms($$1, $$2, $$3, $$4, this.a(new czn(czr.cT), $$1));
      }
   }

   public abstract static class b<T extends lw> implements goc<T> {
      private final hgi a = new hgi();

      protected hgi a(czn $$0, gkq $$1) {
         fpt.Q().bf().a(this.a, $$0, czl.h, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gms.b<lu> {
      public gnz a(lu $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gms($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gms.b<mc> {
      public gnz a(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gms($$1, $$2, $$3, $$4, this.a(new czn(czr.rG), $$1));
      }
   }

   public static class e extends gms.b<mc> {
      public gnz a(mc $$0, gkq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gms($$1, $$2, $$3, $$4, this.a(new czn(czr.rs), $$1));
      }
   }
}
