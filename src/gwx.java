public class gwx extends gxb {
   private final xe a;
   private fjg b = fjg.a;
   private final fon c;
   private int B;

   public gwx(fon $$0, xe $$1, xe $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aN_() {
      this.m.ae().i();
      this.b = fjg.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(fin.a(xd.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public xe i() {
      return xe.i().a(this.l).f(": ").a(this.a);
   }

   @Override
   public void d() {
      fgj.Q().a(this.c);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
