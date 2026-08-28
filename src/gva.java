public class gva extends gve {
   private final xo a;
   private fhv b = fhv.a;
   private final fnb c;
   private int B;

   public gva(fnb $$0, xo $$1, xo $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aM_() {
      this.m.ae().i();
      this.b = fhv.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(fhc.a(xn.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public xo i() {
      return xo.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void d() {
      ffd.Q().a(this.c);
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
