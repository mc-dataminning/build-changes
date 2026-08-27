public interface xh {
   ws a();

   void a(aqf var1, boolean var2, wo.a var3);

   static xh a(xi $$0) {
      return (xh)($$0.h() ? new xh.a($$0.d()) : new xh.b($$0));
   }

   public static record a(ws a) implements xh {
      @Override
      public void a(aqf $$0, boolean $$1, wo.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(xi a) implements xh {
      @Override
      public ws a() {
         return this.a.d();
      }

      @Override
      public void a(aqf $$0, boolean $$1, wo.a $$2) {
         xi $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public xi b() {
         return this.a;
      }
   }
}
