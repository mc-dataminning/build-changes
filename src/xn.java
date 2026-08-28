public interface xn {
   wy a();

   void a(arr var1, boolean var2, wu.a var3);

   static xn a(xo $$0) {
      return (xn)($$0.h() ? new xn.a($$0.d()) : new xn.b($$0));
   }

   public static record a(wy a) implements xn {
      @Override
      public void a(arr $$0, boolean $$1, wu.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xo a) implements xn {
      @Override
      public wy a() {
         return this.a.d();
      }

      @Override
      public void a(arr $$0, boolean $$1, wu.a $$2) {
         xo $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xo b() {
         return this.a;
      }
   }
}
