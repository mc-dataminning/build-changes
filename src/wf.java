public interface wf {
   vq a();

   void a(aox var1, boolean var2, vm.a var3);

   static wf a(wg $$0) {
      return (wf)($$0.h() ? new wf.a($$0.d()) : new wf.b($$0));
   }

   public static record a(vq a) implements wf {
      @Override
      public void a(aox $$0, boolean $$1, vm.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(wg a) implements wf {
      @Override
      public vq a() {
         return this.a.d();
      }

      @Override
      public void a(aox $$0, boolean $$1, vm.a $$2) {
         wg $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public wg b() {
         return this.a;
      }
   }
}
