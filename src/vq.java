public interface vq {
   vb a();

   void a(amq var1, boolean var2, ux.a var3);

   static vq a(vr $$0) {
      return (vq)($$0.g() ? new vq.a($$0.c()) : new vq.b($$0));
   }

   public static record a(vb a) implements vq {
      @Override
      public void a(amq $$0, boolean $$1, ux.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(vr a) implements vq {
      @Override
      public vb a() {
         return this.a.c();
      }

      @Override
      public void a(amq $$0, boolean $$1, ux.a $$2) {
         vr $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public vr b() {
         return this.a;
      }
   }
}
