public abstract class gau<T extends cxf> extends gas<T> implements geh {
   private final gec<?> G;
   private boolean H;

   public gau(T $$0, gec<?> $$1, crw $$2, xa $$3) {
      super($$0, $$2, $$3);
      this.G = $$1;
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.H = this.n < 379;
      this.G.a(this.n, this.o, this.m, this.H);
      this.C = this.G.a(this.n, this.s);
      this.M();
   }

   protected abstract fyr G();

   private void M() {
      fyr $$0 = this.G();
      this.c(new fux($$0.a(), $$0.b(), 20, 18, gec.a, $$0x -> {
         this.G.c();
         this.C = this.G.a(this.n, this.s);
         fyr $$1 = this.G();
         $$0x.c($$1.a(), $$1.b());
         this.H();
      }));
      this.d(this.G);
   }

   protected void H() {
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      if (this.G.d() && this.H) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }

      this.G.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      this.G.a($$0, $$1, $$2, this.B);
   }

   @Override
   protected void c(ftx $$0) {
      super.c($$0);
      this.G.a($$0, this.I());
   }

   protected boolean I() {
      return true;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.G.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.G.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.G.a($$0, $$1, $$2)) {
         this.a(this.G);
         return true;
      } else {
         return this.H && this.G.d() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.H || !this.G.d()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
      return this.G.a($$0, $$1, this.C, this.D, this.s, this.u, $$4) && $$5;
   }

   @Override
   protected void a(cxn $$0, int $$1, int $$2, cwb $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G.b($$0);
   }

   @Override
   public void E() {
      super.E();
      this.G.e();
   }

   @Override
   public void L() {
      this.G.g();
   }

   @Override
   public void a(dfv $$0) {
      this.G.a($$0);
   }
}
