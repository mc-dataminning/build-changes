public class ghn extends ghr {
   private final ur a;
   private evs b = evs.a;
   private final fau c;
   private int v;

   public ghn(fau $$0, ur $$1, ur $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aP_() {
      this.f.ab().a();
      this.b = evs.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.d(euz.a(uq.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public ur h() {
      return ur.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void aF_() {
      etd.N().a(this.c);
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
