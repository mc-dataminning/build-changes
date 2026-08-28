public class hkv extends hky {
   private final wo a;
   private fpj b = fpj.a;
   private final fui c;
   private int C;

   public hkv(fui $$0, wo $$1, wo $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aR_() {
      this.m.af().i();
      this.b = fpj.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fop.a(wn.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public wo i() {
      return wo.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aO_() {
      flh.Q().a(this.c);
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
