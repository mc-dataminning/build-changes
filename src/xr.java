public interface xr {
   xc a();

   void a(arv var1, boolean var2, wy.a var3);

   static xr a(xs $$0) {
      return (xr)($$0.h() ? new xr.a($$0.d()) : new xr.b($$0));
   }

   public static record a(xc a) implements xr {
      @Override
      public void a(arv $$0, boolean $$1, wy.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xs a) implements xr {
      @Override
      public xc a() {
         return this.a.d();
      }

      @Override
      public void a(arv $$0, boolean $$1, wy.a $$2) {
         xs $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xs b() {
         return this.a;
      }
   }
}
