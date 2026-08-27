public class get extends gex {
   private final tl a;
   private etd b = etd.a;
   private final eye c;
   private int y;

   public get(eye $$0, tl $$1, tl $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aH_() {
      this.f.ac().a();
      this.b = etd.a(this.i, this.a, this.g - 50);
      this.y = this.b.a() * 9;
      this.d(esk.a(tk.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public tl g() {
      return tl.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void az_() {
      eqp.O().a(this.c);
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.y / 2);
   }
}
