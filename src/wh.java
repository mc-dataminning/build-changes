public interface wh {
   vs a();

   void a(apb var1, boolean var2, vo.a var3);

   static wh a(wi $$0) {
      return (wh)($$0.h() ? new wh.a($$0.d()) : new wh.b($$0));
   }

   public static record a(vs a) implements wh {
      @Override
      public void a(apb $$0, boolean $$1, vo.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(wi a) implements wh {
      @Override
      public vs a() {
         return this.a.d();
      }

      @Override
      public void a(apb $$0, boolean $$1, vo.a $$2) {
         wi $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public wi b() {
         return this.a;
      }
   }
}
