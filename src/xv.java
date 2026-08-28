public interface xv {
   xg a();

   void a(asc var1, boolean var2, xc.a var3);

   static xv a(xw $$0) {
      return (xv)($$0.h() ? new xv.a($$0.d()) : new xv.b($$0));
   }

   public static record a(xg a) implements xv {
      @Override
      public void a(asc $$0, boolean $$1, xc.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xw a) implements xv {
      @Override
      public xg a() {
         return this.a.d();
      }

      @Override
      public void a(asc $$0, boolean $$1, xc.a $$2) {
         xw $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xw b() {
         return this.a;
      }
   }
}
