public interface xt {
   xe a();

   void a(ark var1, boolean var2, xa.a var3);

   static xt a(xu $$0) {
      return (xt)($$0.h() ? new xt.a($$0.d()) : new xt.b($$0));
   }

   public static record a(xe a) implements xt {
      @Override
      public void a(ark $$0, boolean $$1, xa.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(xu a) implements xt {
      @Override
      public xe a() {
         return this.a.d();
      }

      @Override
      public void a(ark $$0, boolean $$1, xa.a $$2) {
         xu $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public xu b() {
         return this.a;
      }
   }
}
