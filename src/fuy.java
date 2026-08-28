public class fuy extends fwf {
   private static final int a = 90;
   private final wv b;
   private frg c = frg.a;
   private final Runnable d;
   private final wv s;
   private final boolean u;

   public fuy(Runnable $$0, wv $$1, wv $$2) {
      this($$0, $$1, $$2, wu.k, true);
   }

   public fuy(Runnable $$0, wv $$1, wv $$2, wv $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public wv i() {
      return wu.a(super.i(), this.b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = frg.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azk.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fqn.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aC_() {
      return this.u;
   }
}
