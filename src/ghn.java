public class ghn extends gjs {
   ghn(gfk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.u = -0.125F;
      this.B = 0.85F;
      this.b(0.02F, 0.02F);
      this.D = this.D * (this.r.i() * 0.6F + 0.2F);
      this.j = $$4 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.k = $$5 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.l = $$6 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.t = (int)(40.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void a() {
      super.a();
      if (!this.o && !this.c.b_(jh.a(this.g, this.h, this.i)).a(aya.a)) {
         this.k();
      }
   }

   @Override
   public giw b() {
      return giw.b;
   }

   public static class a implements giv<lw> {
      private final gjn a;

      public a(gjn $$0) {
         this.a = $$0;
      }

      public gis a(lw $$0, gfk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ghn $$8 = new ghn($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
