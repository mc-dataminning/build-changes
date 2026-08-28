public interface xo {
   wz a();

   void a(aqv var1, boolean var2, wv.a var3);

   static xo a(xp $$0) {
      return (xo)($$0.h() ? new xo.a($$0.d()) : new xo.b($$0));
   }

   public static record a(wz a) implements xo {
      @Override
      public void a(aqv $$0, boolean $$1, wv.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(xp a) implements xo {
      @Override
      public wz a() {
         return this.a.d();
      }

      @Override
      public void a(aqv $$0, boolean $$1, wv.a $$2) {
         xp $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public xp b() {
         return this.a;
      }
   }
}
