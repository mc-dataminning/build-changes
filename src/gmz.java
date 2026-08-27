public class gmz extends gnd {
   private final vq a;
   private fah b = fah.a;
   private final ffl c;
   private int v;

   public gmz(ffl $$0, vq $$1, vq $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aQ_() {
      this.f.ad().i();
      this.b = fah.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.c(ezo.a(vp.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public vq i() {
      return vq.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void d() {
      exo.P().a(this.c);
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
