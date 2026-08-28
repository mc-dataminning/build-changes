public class gia extends gkg {
   private final float a;
   private final float b;

   gia(gfy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hbl $$7) {
      this($$0, $$1, $$2, $$3, $$7);
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
   }

   @Override
   public gjk b() {
      return gjk.a;
   }

   protected gia(gfy $$0, double $$1, double $$2, double $$3, hbl $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      hej $$5 = $$4.a(this.r);
      if ($$5 != null) {
         this.a($$5);
      } else {
         this.a(flj.Q().a(hei.d).apply(hdz.b()));
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

   public static class a extends gia.b<lx> {
      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gia($$1, $$2, $$3, $$4, this.a(new cwp(cwt.cT), $$1));
      }
   }

   public abstract static class b<T extends lr> implements gjj<T> {
      private final hbl a = new hbl();

      protected hbl a(cwp $$0, gfy $$1) {
         flj.Q().bf().a(this.a, $$0, cwn.h, false, $$1, null, 0);
         return this.a;
      }
   }

   public static class c extends gia.b<lp> {
      public gjg a(lp $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gia($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1));
      }
   }

   public static class d extends gia.b<lx> {
      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gia($$1, $$2, $$3, $$4, this.a(new cwp(cwt.rx), $$1));
      }
   }

   public static class e extends gia.b<lx> {
      public gjg a(lx $$0, gfy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gia($$1, $$2, $$3, $$4, this.a(new cwp(cwt.rj), $$1));
      }
   }
}
