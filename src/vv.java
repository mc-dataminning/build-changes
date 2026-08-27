public interface vv {
   vg a();

   void a(anf var1, boolean var2, vc.a var3);

   static vv a(vw $$0) {
      return (vv)($$0.h() ? new vv.a($$0.d()) : new vv.b($$0));
   }

   public static record a(vg a) implements vv {
      @Override
      public void a(anf $$0, boolean $$1, vc.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(vw a) implements vv {
      @Override
      public vg a() {
         return this.a.d();
      }

      @Override
      public void a(anf $$0, boolean $$1, vc.a $$2) {
         vw $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public vw b() {
         return this.a;
      }
   }
}
