public class grh extends grl {
   private final wg a;
   private fei b = fei.a;
   private final fjo c;
   private int y;

   public grh(fjo $$0, wg $$1, wg $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aN_() {
      this.j.ae().i();
      this.b = fei.a(this.m, this.a, this.k - 50);
      this.y = this.b.a() * 9;
      this.c(fdp.a(wf.k, $$0 -> this.j.a(this.c)).a(this.k / 2 - 100, this.l / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public wg i() {
      return wg.i().b(this.i).f(": ").b(this.a);
   }

   @Override
   public void d() {
      fbp.Q().a(this.c);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, this.l / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.k / 2, this.l / 2 - this.y / 2);
   }
}
