public class gvd extends gvh {
   private final xp a;
   private fhy b = fhy.a;
   private final fne c;
   private int B;

   public gvd(fne $$0, xp $$1, xp $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aM_() {
      this.m.ae().i();
      this.b = fhy.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(fhf.a(xo.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public xp i() {
      return xp.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void d() {
      ffg.Q().a(this.c);
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
