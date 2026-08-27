public interface vg {
   ur a();

   void a(amb var1, boolean var2, un.a var3);

   static vg a(vh $$0) {
      return (vg)($$0.g() ? new vg.a($$0.c()) : new vg.b($$0));
   }

   public static record a(ur a) implements vg {
      @Override
      public void a(amb $$0, boolean $$1, un.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(vh a) implements vg {
      @Override
      public ur a() {
         return this.a.c();
      }

      @Override
      public void a(amb $$0, boolean $$1, un.a $$2) {
         vh $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public vh b() {
         return this.a;
      }
   }
}
