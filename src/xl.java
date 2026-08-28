public interface xl {
   ww a();

   void a(arp var1, boolean var2, ws.a var3);

   static xl a(xm $$0) {
      return (xl)($$0.h() ? new xl.a($$0.d()) : new xl.b($$0));
   }

   public static record a(ww a) implements xl {
      @Override
      public void a(arp $$0, boolean $$1, ws.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xm a) implements xl {
      @Override
      public ww a() {
         return this.a.d();
      }

      @Override
      public void a(arp $$0, boolean $$1, ws.a $$2) {
         xm $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xm b() {
         return this.a;
      }
   }
}
