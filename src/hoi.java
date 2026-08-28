public class hoi extends hol {
   private final ww a;
   private fsj b = fsj.a;
   private final fxi c;
   private int C;

   public hoi(fxi $$0, ww $$1, ww $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aN_() {
      this.m.af().i();
      this.b = fsj.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(frq.a(wv.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public ww i() {
      return ww.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aK_() {
      fof.Q().a(this.c);
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
