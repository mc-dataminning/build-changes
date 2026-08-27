public abstract class jd extends jg {
   @Override
   public cmh a(je $$0, cmh $$1) {
      csy $$2 = $$0.b();
      ip $$3 = cye.a($$0);
      ia $$4 = $$0.d().c(cye.b);
      cfj $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(je $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cfj a(csy var1, ip var2, cmh var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
