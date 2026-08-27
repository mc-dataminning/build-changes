public interface vk {
   uv a();

   void a(amj var1, boolean var2, ur.a var3);

   static vk a(vl $$0) {
      return (vk)($$0.g() ? new vk.a($$0.c()) : new vk.b($$0));
   }

   public static record a(uv a) implements vk {
      @Override
      public void a(amj $$0, boolean $$1, ur.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(vl a) implements vk {
      @Override
      public uv a() {
         return this.a.c();
      }

      @Override
      public void a(amj $$0, boolean $$1, ur.a $$2) {
         vl $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public vl b() {
         return this.a;
      }
   }
}
