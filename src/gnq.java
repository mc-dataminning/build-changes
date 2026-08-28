public class gnq extends gpx {
   private final float a;
   private final float b;

   gnq(glo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hhi $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gpb b() {
      return gpb.a;
   }

   protected gnq(glo $$0, double $$1, double $$2, double $$3, hhi $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hkq $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(fqq.Q().a(hkp.c).apply(hkf.c()));
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

   public static class a extends gnq.b<md> {
      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gnq($$1, $$2, $$3, $$4, this.a(new dak(dao.cT), $$1));
      }
   }

   public abstract static class b<T extends lx> implements gpa<T> {
      private final hhi a = new hhi();

      protected hhi a(dak $$0, glo $$1) {
         fqq.Q().bf().a(this.a, $$0, dai.h, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gnq.b<lv> {
      public gox a(lv $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gnq($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gnq.b<md> {
      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gnq($$1, $$2, $$3, $$4, this.a(new dak(dao.rG), $$1));
      }
   }

   public static class e extends gnq.b<md> {
      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gnq($$1, $$2, $$3, $$4, this.a(new dak(dao.rs), $$1));
      }
   }
}
