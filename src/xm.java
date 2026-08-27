public interface xm {
   wx a();

   void a(aqo var1, boolean var2, wt.a var3);

   static xm a(xn $$0) {
      return (xm)($$0.h() ? new xm.a($$0.d()) : new xm.b($$0));
   }

   public static record a(wx a) implements xm {
      @Override
      public void a(aqo $$0, boolean $$1, wt.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(xn a) implements xm {
      @Override
      public wx a() {
         return this.a.d();
      }

      @Override
      public void a(aqo $$0, boolean $$1, wt.a $$2) {
         xn $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public xn b() {
         return this.a;
      }
   }
}
