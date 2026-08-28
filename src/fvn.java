public abstract class fvn {
   protected static final int a = 14737632;
   protected static final int b = 60;
   protected static final int c = 1;
   protected final fti d;
   protected final bpr e;

   protected fvn(fti $$0, bpr $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public int a(int $$0) {
      return Math.min(this.e.c() + 2, $$0);
   }

   public int a() {
      return 60 + 9;
   }

   public void a(ftk $$0, int $$1, int $$2) {
      int $$3 = $$0.b();
      $$0.a(gry.G(), $$1, $$3 - 60, $$1 + $$2, $$3, -1873784752);
      long $$4 = 0L;
      long $$5 = 2147483647L;
      long $$6 = -2147483648L;
      int $$7 = Math.max(0, this.e.c() - ($$2 - 2));
      int $$8 = this.e.d() - $$7;

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         int $$10 = $$1 + $$9 + 1;
         int $$11 = $$7 + $$9;
         long $$12 = this.b($$11);
         $$5 = Math.min($$5, $$12);
         $$6 = Math.max($$6, $$12);
         $$4 += $$12;
         this.a($$0, $$3, $$10, $$11);
      }

      $$0.a(gry.G(), $$1, $$1 + $$2 - 1, $$3 - 60, -1);
      $$0.a(gry.G(), $$1, $$1 + $$2 - 1, $$3 - 1, -1);
      $$0.b(gry.G(), $$1, $$3 - 60, $$3, -1);
      $$0.b(gry.G(), $$1 + $$2 - 1, $$3 - 60, $$3, -1);
      if ($$8 > 0) {
         String $$13 = this.a((double)$$5) + " min";
         String $$14 = this.a((double)$$4 / (double)$$8) + " avg";
         String $$15 = this.a((double)$$6) + " max";
         $$0.b(this.d, $$13, $$1 + 2, $$3 - 60 - 9, 14737632);
         $$0.a(this.d, $$14, $$1 + $$2 / 2, $$3 - 60 - 9, 14737632);
         $$0.b(this.d, $$15, $$1 + $$2 - this.d.b($$15) - 2, $$3 - 60 - 9, 14737632);
      }

      this.d($$0, $$1, $$2, $$3);
   }

   protected void a(ftk $$0, int $$1, int $$2, int $$3) {
      this.b($$0, $$1, $$2, $$3);
      this.c($$0, $$1, $$2, $$3);
   }

   protected void b(ftk $$0, int $$1, int $$2, int $$3) {
      long $$4 = this.e.a($$3);
      int $$5 = this.b((double)$$4);
      int $$6 = this.a($$4);
      $$0.a(gry.G(), $$2, $$1 - $$5, $$2 + 1, $$1, $$6);
   }

   protected void c(ftk $$0, int $$1, int $$2, int $$3) {
   }

   protected long b(int $$0) {
      return this.e.a($$0);
   }

   protected void d(ftk $$0, int $$1, int $$2, int $$3) {
   }

   protected void a(ftk $$0, String $$1, int $$2, int $$3) {
      $$0.a(gry.G(), $$2, $$3, $$2 + this.d.b($$1) + 1, $$3 + 9, -1873784752);
      $$0.a(this.d, $$1, $$2 + 1, $$3 + 1, 14737632, false);
   }

   protected abstract String a(double var1);

   protected abstract int b(double var1);

   protected abstract int a(long var1);

   protected int a(double $$0, double $$1, int $$2, double $$3, int $$4, double $$5, int $$6) {
      $$0 = azz.a($$0, $$1, $$5);
      return $$0 < $$3 ? ayh.a((float)(($$0 - $$1) / ($$3 - $$1)), $$2, $$4) : ayh.a((float)(($$0 - $$3) / ($$5 - $$3)), $$4, $$6);
   }
}
