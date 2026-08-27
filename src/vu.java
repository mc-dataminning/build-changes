public interface vu {
   vf a();

   void a(ane var1, boolean var2, vb.a var3);

   static vu a(vv $$0) {
      return (vu)($$0.h() ? new vu.a($$0.d()) : new vu.b($$0));
   }

   public static record a(vf a) implements vu {
      @Override
      public void a(ane $$0, boolean $$1, vb.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(vv a) implements vu {
      @Override
      public vf a() {
         return this.a.d();
      }

      @Override
      public void a(ane $$0, boolean $$1, vb.a $$2) {
         vv $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.c.a($$3, $$2);
         }
      }

      public vv b() {
         return this.a;
      }
   }
}
