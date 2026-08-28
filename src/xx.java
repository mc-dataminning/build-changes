public interface xx {
   xi a();

   void a(aro var1, boolean var2, xe.a var3);

   static xx a(xy $$0) {
      return (xx)($$0.h() ? new xx.a($$0.d()) : new xx.b($$0));
   }

   public static record a(xi a) implements xx {
      @Override
      public void a(aro $$0, boolean $$1, xe.a $$2) {
         $$0.g.a(this.a, $$2);
      }
   }

   public static record b(xy a) implements xx {
      @Override
      public xi a() {
         return this.a.d();
      }

      @Override
      public void a(aro $$0, boolean $$1, xe.a $$2) {
         xy $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.g.a($$3, $$2);
         }
      }

      public xy b() {
         return this.a;
      }
   }
}
