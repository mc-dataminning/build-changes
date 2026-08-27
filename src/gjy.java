public class gjy extends gkc {
   private final vd a;
   private exr b = exr.a;
   private final fct c;
   private int v;

   public gjy(fct $$0, vd $$1, vd $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aN_() {
      this.f.ab().a();
      this.b = exr.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.d(ewy.a(vc.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public vd h() {
      return vd.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void aE_() {
      eva.N().a(this.c);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
