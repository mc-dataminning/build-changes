public interface vs {
   vd a();

   void a(ana var1, boolean var2, uz.a var3);

   static vs a(vt $$0) {
      return (vs)($$0.g() ? new vs.a($$0.c()) : new vs.b($$0));
   }

   public static record a(vd a) implements vs {
      @Override
      public void a(ana $$0, boolean $$1, uz.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(vt a) implements vs {
      @Override
      public vd a() {
         return this.a.c();
      }

      @Override
      public void a(ana $$0, boolean $$1, uz.a $$2) {
         vt $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public vt b() {
         return this.a;
      }
   }
}
