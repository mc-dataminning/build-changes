public class gkz extends gld {
   private final vg a;
   private eyk b = eyk.a;
   private final fdm c;
   private int v;

   public gkz(fdm $$0, vg $$1, vg $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aP_() {
      this.f.ac().i();
      this.b = eyk.a(this.i, this.a, this.g - 50);
      this.v = this.b.a() * 9;
      this.d(exr.a(vf.k, $$0 -> this.f.a(this.c)).a(this.g / 2 - 100, this.h / 2 + this.v / 2 + 9, 200, 20).a());
   }

   @Override
   public vg i() {
      return vg.i().b(this.e).f(": ").b(this.a);
   }

   @Override
   public void d() {
      evr.O().a(this.c);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, this.h / 2 - this.v / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.g / 2, this.h / 2 - this.v / 2);
   }
}
