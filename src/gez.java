public class gez extends gfd {
   private final tn a;
   private etl b = etl.a;
   private final eym c;
   private int y;

   public gez(eym $$0, tn $$1, tn $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aH_() {
      this.f.ac().a();
      this.b = etl.a(this.i, this.a, this.g - 50);
      this.y = this.b.a() * 9;
      this.d(ess.a(tm.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public tn g() {
      return tn.h().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void az_() {
      eqx.O().a(this.c);
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.y / 2);
   }
}
