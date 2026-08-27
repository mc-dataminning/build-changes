public class gsx extends gtb {
   private final wu a;
   private ffx b = ffx.a;
   private final fld c;
   private int B;

   public gsx(fld $$0, wu $$1, wu $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aM_() {
      this.m.ae().i();
      this.b = ffx.a(this.p, this.a, this.n - 50);
      this.B = this.b.a() * 9;
      this.c(ffe.a(wt.k, $$0 -> this.m.a(this.c)).a(this.n / 2 - 100, this.o / 2 + this.B / 2 + 9, 200, 20).a());
   }

   @Override
   public wu i() {
      return wu.i().b(this.l).f(": ").b(this.a);
   }

   @Override
   public void d() {
      fde.Q().a(this.c);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, this.o / 2 - this.B / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.n / 2, this.o / 2 - this.B / 2);
   }
}
