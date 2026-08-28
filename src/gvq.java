public class gvq extends gvu {
   private final wu a;
   private fin b = fin.a;
   private final fnl c;
   private int A;

   public gvq(fnl $$0, wu $$1, wu $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aP_() {
      this.l.ae().i();
      this.b = fin.a(this.o, this.a, this.m - 50);
      this.A = this.b.a() * 9;
      this.c(fhu.a(wt.k, $$0 -> this.l.a(this.c)).a(this.m / 2 - 100, this.n / 2 + this.A / 2 + 9, 200, 20).a());
   }

   @Override
   public wu i() {
      return wu.i().b(this.k).f(": ").b(this.a);
   }

   @Override
   public void d() {
      ffw.Q().a(this.c);
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, this.n / 2 - this.A / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.m / 2, this.n / 2 - this.A / 2);
   }
}
