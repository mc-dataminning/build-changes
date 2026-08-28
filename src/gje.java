public class gje extends gki {
   gje(gga $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.u = 0.75F;
      this.B = 0.999F;
      this.j *= 0.8F;
      this.k *= 0.8F;
      this.l *= 0.8F;
      this.k = (double)(this.r.i() * 0.4F + 0.05F);
      this.D = this.D * (this.r.i() * 2.0F + 0.2F);
      this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public gjm b() {
      return gjm.b;
   }

   @Override
   public int a(float $$0) {
      int $$1 = super.a($$0);
      int $$2 = 240;
      int $$3 = $$1 >> 16 & 0xFF;
      return 240 | $$3 << 16;
   }

   @Override
   public float b(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      return this.D * (1.0F - $$1 * $$1);
   }

   @Override
   public void a() {
      super.a();
      if (!this.o) {
         float $$0 = (float)this.s / (float)this.t;
         if (this.r.i() > $$0) {
            this.c.a(lt.ag, this.g, this.h, this.i, this.j, this.k, this.l);
         }
      }
   }

   public static class a implements gjl<lx> {
      private final gkd a;

      public a(gkd $$0) {
         this.a = $$0;
      }

      public gji a(lx $$0, gga $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gje $$8 = new gje($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }
}
