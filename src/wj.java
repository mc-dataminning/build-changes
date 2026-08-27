public interface wj {
   vu a();

   void a(apg var1, boolean var2, vq.a var3);

   static wj a(wk $$0) {
      return (wj)($$0.h() ? new wj.a($$0.d()) : new wj.b($$0));
   }

   public static record a(vu a) implements wj {
      @Override
      public void a(apg $$0, boolean $$1, vq.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(wk a) implements wj {
      @Override
      public vu a() {
         return this.a.d();
      }

      @Override
      public void a(apg $$0, boolean $$1, vq.a $$2) {
         wk $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public wk b() {
         return this.a;
      }
   }
}
