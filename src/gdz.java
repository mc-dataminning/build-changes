public class gdz extends ged {
   private final te a;
   private etb b = etb.a;
   private final exv c;
   private int y;

   public gdz(exv $$0, te $$1, te $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aE_() {
      this.f.ab().a();
      this.b = etb.a(this.i, this.a, this.g - 50);
      this.y = this.b.a() * 9;
      this.d(esi.a(td.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public te e() {
      return te.h().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void au_() {
      eqn.N().a(this.c);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.y / 2);
   }
}
