public interface ya {
   xl a();

   void a(arc var1, boolean var2, xh.a var3);

   static ya a(yb $$0) {
      return (ya)($$0.h() ? new ya.a($$0.d()) : new ya.b($$0));
   }

   public static record a(xl a) implements ya {
      @Override
      public void a(arc $$0, boolean $$1, xh.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(yb a) implements ya {
      @Override
      public xl a() {
         return this.a.d();
      }

      @Override
      public void a(arc $$0, boolean $$1, xh.a $$2) {
         yb $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public yb b() {
         return this.a;
      }
   }
}
