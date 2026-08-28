public interface xy {
   xj a();

   void a(arq var1, boolean var2, xf.a var3);

   static xy a(xz $$0) {
      return (xy)($$0.h() ? new xy.a($$0.d()) : new xy.b($$0));
   }

   public static record a(xj a) implements xy {
      @Override
      public void a(arq $$0, boolean $$1, xf.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xz a) implements xy {
      @Override
      public xj a() {
         return this.a.d();
      }

      @Override
      public void a(arq $$0, boolean $$1, xf.a $$2) {
         xz $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xz b() {
         return this.a;
      }
   }
}
