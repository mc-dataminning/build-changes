public interface yk {
   xv a();

   void a(asi var1, boolean var2, xr.a var3);

   static yk a(yl $$0) {
      return (yk)($$0.h() ? new yk.a($$0.d()) : new yk.b($$0));
   }

   public static record a(xv a) implements yk {
      @Override
      public void a(asi $$0, boolean $$1, xr.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(yl a) implements yk {
      @Override
      public xv a() {
         return this.a.d();
      }

      @Override
      public void a(asi $$0, boolean $$1, xr.a $$2) {
         yl $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public yl b() {
         return this.a;
      }
   }
}
