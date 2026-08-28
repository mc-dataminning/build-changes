public interface xs {
   xd a();

   void a(ari var1, boolean var2, wz.a var3);

   static xs a(xt $$0) {
      return (xs)($$0.h() ? new xs.a($$0.d()) : new xs.b($$0));
   }

   public static record a(xd a) implements xs {
      @Override
      public void a(ari $$0, boolean $$1, wz.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(xt a) implements xs {
      @Override
      public xd a() {
         return this.a.d();
      }

      @Override
      public void a(ari $$0, boolean $$1, wz.a $$2) {
         xt $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public xt b() {
         return this.a;
      }
   }
}
