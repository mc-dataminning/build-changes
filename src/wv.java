public interface wv {
   wg a();

   void a(apt var1, boolean var2, wc.a var3);

   static wv a(ww $$0) {
      return (wv)($$0.h() ? new wv.a($$0.d()) : new wv.b($$0));
   }

   public static record a(wg a) implements wv {
      @Override
      public void a(apt $$0, boolean $$1, wc.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(ww a) implements wv {
      @Override
      public wg a() {
         return this.a.d();
      }

      @Override
      public void a(apt $$0, boolean $$1, wc.a $$2) {
         ww $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public ww b() {
         return this.a;
      }
   }
}
