public class hnb extends hne {
   private final wv a;
   private frg b = frg.a;
   private final fwf c;
   private int C;

   public hnb(fwf $$0, wv $$1, wv $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aN_() {
      this.m.af().i();
      this.b = frg.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fqn.a(wu.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public wv i() {
      return wv.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aK_() {
      fnd.Q().a(this.c);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
