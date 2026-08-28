public interface xz {
   xk a();

   void a(ary var1, boolean var2, xg.a var3);

   static xz a(ya $$0) {
      return (xz)($$0.h() ? new xz.a($$0.d()) : new xz.b($$0));
   }

   public static record a(xk a) implements xz {
      @Override
      public void a(ary $$0, boolean $$1, xg.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(ya a) implements xz {
      @Override
      public xk a() {
         return this.a.d();
      }

      @Override
      public void a(ary $$0, boolean $$1, xg.a $$2) {
         ya $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public ya b() {
         return this.a;
      }
   }
}
