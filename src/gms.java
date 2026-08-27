public class gms extends gmw {
   private final vq a;
   private faa b = faa.a;
   private final ffe c;
   private int v;

   public gms(ffe $$0, vq $$1, vq $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aQ_() {
      this.f.ac().i();
      this.b = faa.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.d(ezh.a(vp.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public vq i() {
      return vq.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void d() {
      exh.O().a(this.c);
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
