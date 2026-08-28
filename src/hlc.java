public class hlc extends hlf {
   private final wp a;
   private fpn b = fpn.a;
   private final fum c;
   private int C;

   public hlc(fum $$0, wp $$1, wp $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aR_() {
      this.m.af().i();
      this.b = fpn.a(this.p, this.a, this.n - 50);
      this.C = this.b.a() * 9;
      this.c(fou.a(wo.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.C / 2 + 9, 200, 20).a());
   }

   @Override
   public wp i() {
      return wp.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void aO_() {
      flk.Q().a(this.c);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.C / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.C / 2);
   }
}
