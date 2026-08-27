public interface wx {
   wi a();

   void a(apv var1, boolean var2, we.a var3);

   static wx a(wy $$0) {
      return (wx)($$0.h() ? new wx.a($$0.d()) : new wx.b($$0));
   }

   public static record a(wi a) implements wx {
      @Override
      public void a(apv $$0, boolean $$1, we.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(wy a) implements wx {
      @Override
      public wi a() {
         return this.a.d();
      }

      @Override
      public void a(apv $$0, boolean $$1, we.a $$2) {
         wy $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public wy b() {
         return this.a;
      }
   }
}
