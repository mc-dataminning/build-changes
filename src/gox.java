public class gox extends gpb {
   private final vu a;
   private fbz b = fbz.a;
   private final fhf c;
   private int v;

   public gox(fhf $$0, vu $$1, vu $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aO_() {
      this.f.ae().i();
      this.b = fbz.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.c(fbg.a(vt.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public vu i() {
      return vu.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void d() {
      ezg.Q().a(this.c);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
