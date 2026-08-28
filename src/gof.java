public class gof extends gqm {
   private final float a;
   private final float b;

   gof(gmd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hhu $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gpq b() {
      return gpq.a;
   }

   protected gof(gmd $$0, double $$1, double $$2, double $$3, hhu $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hlc $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(frf.Q().a(hlb.c).apply(hkr.c()));
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

   public static class a extends gof.b<md> {
      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gof($$1, $$2, $$3, $$4, this.a(new daa(dae.cT), $$1));
      }
   }

   public abstract static class b<T extends lx> implements gpp<T> {
      private final hhu a = new hhu();

      protected hhu a(daa $$0, gmd $$1) {
         frf.Q().bf().a(this.a, $$0, czy.h, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gof.b<lv> {
      public gpm a(lv $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gof($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gof.b<md> {
      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gof($$1, $$2, $$3, $$4, this.a(new daa(dae.rG), $$1));
      }
   }

   public static class e extends gof.b<md> {
      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gof($$1, $$2, $$3, $$4, this.a(new daa(dae.rs), $$1));
      }
   }
}
