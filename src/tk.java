public interface tk {
   sw a();

   void a(aig var1, boolean var2, ss.a var3);

   static tk a(tl $$0) {
      return (tk)($$0.g() ? new tk.a($$0.c()) : new tk.b($$0));
   }

   public static record a(sw a) implements tk {
      @Override
      public void a(aig $$0, boolean $$1, ss.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(tl a) implements tk {
      @Override
      public sw a() {
         return this.a.c();
      }

      @Override
      public void a(aig $$0, boolean $$1, ss.a $$2) {
         tl $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public tl b() {
         return this.a;
      }
   }
}
