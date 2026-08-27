public class gex extends gfb {
   private final tm a;
   private etj b = etj.a;
   private final eyk c;
   private int y;

   public gex(eyk $$0, tm $$1, tm $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aI_() {
      this.f.ac().a();
      this.b = etj.a(this.i, this.a, this.g - 50);
      this.y = this.b.a() * 9;
      this.d(esq.a(tl.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public tm g() {
      return tm.h().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void az_() {
      eqv.O().a(this.c);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.y / 2);
   }
}
