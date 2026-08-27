public class gkl extends gkp {
   private final vf a;
   private exz b = exz.a;
   private final fdb c;
   private int v;

   public gkl(fdb $$0, vf $$1, vf $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aN_() {
      this.f.ac().i();
      this.b = exz.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.d(exg.a(ve.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public vf h() {
      return vf.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void aE_() {
      evi.O().a(this.c);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
