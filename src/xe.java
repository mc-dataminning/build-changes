public interface xe {
   wp a();

   void a(are var1, boolean var2, wl.a var3);

   static xe a(xf $$0) {
      return (xe)($$0.h() ? new xe.a($$0.d()) : new xe.b($$0));
   }

   public static record a(wp a) implements xe {
      @Override
      public void a(are $$0, boolean $$1, wl.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xf a) implements xe {
      @Override
      public wp a() {
         return this.a.d();
      }

      @Override
      public void a(are $$0, boolean $$1, wl.a $$2) {
         xf $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xf b() {
         return this.a;
      }
   }
}
