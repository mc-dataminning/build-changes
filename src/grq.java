public class grq extends gru {
   private final wi a;
   private fer b = fer.a;
   private final fjx c;
   private int y;

   public grq(fjx $$0, wi $$1, wi $$2) {
      super($$1);
      this.c = $$0;
      this.a = $$2;
   }

   @Override
   public void aM_() {
      this.j.ae().i();
      this.b = fer.a(this.m, this.a, this.k - 50);
      this.y = this.b.a() * 9;
      this.c(fdy.a(wh.k, $$0 -> this.j.a(this.c)).a(this.k / 2 - 100, this.l / 2 + this.y / 2 + 9, 200, 20).a());
   }

   @Override
   public wi i() {
      return wi.i().b(this.i).f(": ").b(this.a);
   }

   @Override
   public void d() {
      fby.Q().a(this.c);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, this.l / 2 - this.y / 2 - 9 * 2, 11184810);
      this.b.a($$0, this.k / 2, this.l / 2 - this.y / 2);
   }
}
