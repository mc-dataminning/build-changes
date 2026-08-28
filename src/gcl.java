public abstract class gcl extends gby {
   protected gpi E;

   protected gcl(fyd $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected gcl(fyd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   protected void a(gpi $$0) {
      this.E = $$0;
   }

   @Override
   protected float c() {
      return this.E.c();
   }

   @Override
   protected float d() {
      return this.E.d();
   }

   @Override
   protected float e() {
      return this.E.g();
   }

   @Override
   protected float f() {
      return this.E.h();
   }

   public void a(gcg $$0) {
      this.a($$0.a(this.r));
   }

   public void b(gcg $$0) {
      if (!this.o) {
         this.a($$0.a(this.s, this.t));
      }
   }
}
