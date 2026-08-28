public abstract class gct extends gcg {
   protected gpq E;

   protected gct(fyl $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected gct(fyl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   protected void a(gpq $$0) {
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

   public void a(gco $$0) {
      this.a($$0.a(this.r));
   }

   public void b(gco $$0) {
      if (!this.o) {
         this.a($$0.a(this.s, this.t));
      }
   }
}
