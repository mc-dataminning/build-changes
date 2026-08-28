public interface xk {
   wv a();

   void a(aro var1, boolean var2, wr.a var3);

   static xk a(xl $$0) {
      return (xk)($$0.h() ? new xk.a($$0.d()) : new xk.b($$0));
   }

   public static record a(wv a) implements xk {
      @Override
      public void a(aro $$0, boolean $$1, wr.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xl a) implements xk {
      @Override
      public wv a() {
         return this.a.d();
      }

      @Override
      public void a(aro $$0, boolean $$1, wr.a $$2) {
         xl $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xl b() {
         return this.a;
      }
   }
}
