public class glt extends goa {
   private final float a;
   private final float b;

   glt(gjr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hfi $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gne b() {
      return gne.a;
   }

   protected glt(gjr $$0, double $$1, double $$2, double $$3, hfi $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hip $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(fos.Q().a(hio.d).apply(hie.c()));
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

   public static class a extends glt.b<mb> {
      public gna a(mb $$0, gjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new glt($$1, $$2, $$3, $$4, this.a(new cyy(czc.cT), $$1));
      }
   }

   public abstract static class b<T extends lv> implements gnd<T> {
      private final hfi a = new hfi();

      protected hfi a(cyy $$0, gjr $$1) {
         fos.Q().bf().a(this.a, $$0, cyw.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends glt.b<lt> {
      public gna a(lt $$0, gjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new glt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends glt.b<mb> {
      public gna a(mb $$0, gjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new glt($$1, $$2, $$3, $$4, this.a(new cyy(czc.rD), $$1));
      }
   }

   public static class e extends glt.b<mb> {
      public gna a(mb $$0, gjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new glt($$1, $$2, $$3, $$4, this.a(new cyy(czc.rp), $$1));
      }
   }
}
