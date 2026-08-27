public class gnx extends gob {
   private final vs a;
   private fbd b = fbd.a;
   private final fgh c;
   private int v;

   public gnx(fgh $$0, vs $$1, vs $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aP_() {
      this.f.ad().i();
      this.b = fbd.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.c(fak.a(vr.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public vs i() {
      return vs.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void d() {
      eyk.P().a(this.c);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
