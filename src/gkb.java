public class gkb extends gmh {
   private final float a;
   private final float b;

   gkb(ghz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hdn $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gll b() {
      return gll.a;
   }

   protected gkb(ghz $$0, double $$1, double $$2, double $$3, hdn $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hgs $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(fnd.Q().a(hgr.d).apply(hgh.c()));
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

   public static class a extends gkb.b<lz> {
      public glh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gkb($$1, $$2, $$3, $$4, this.a(new cxy(cyc.cT), $$1));
      }
   }

   public abstract static class b<T extends lt> implements glk<T> {
      private final hdn a = new hdn();

      protected hdn a(cxy $$0, ghz $$1) {
         fnd.Q().bf().a(this.a, $$0, cxw.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gkb.b<lr> {
      public glh a(lr $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gkb($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gkb.b<lz> {
      public glh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gkb($$1, $$2, $$3, $$4, this.a(new cxy(cyc.rB), $$1));
      }
   }

   public static class e extends gkb.b<lz> {
      public glh a(lz $$0, ghz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gkb($$1, $$2, $$3, $$4, this.a(new cxy(cyc.rn), $$1));
      }
   }
}
