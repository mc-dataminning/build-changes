public abstract class kd extends kg {
   @Override
   public csd a(ke $$0, csd $$1) {
      czu $$2 = $$0.b();
      jf $$3 = dfa.a($$0);
      ir $$4 = $$0.d().c(dfa.b);
      cld $$5 = this.a($$2, $$3, $$1);
      $$5.c((double)$$4.j(), (double)((float)$$4.k() + 0.1F), (double)$$4.l(), this.b(), this.a());
      $$2.b($$5);
      $$1.g(1);
      return $$1;
   }

   @Override
   protected void a(ke $$0) {
      $$0.b().c(1002, $$0.c(), 0);
   }

   protected abstract cld a(czu var1, jf var2, csd var3);

   protected float a() {
      return 6.0F;
   }

   protected float b() {
      return 1.1F;
   }
}
