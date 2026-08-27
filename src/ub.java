public interface ub {
   tn a();

   void a(akt var1, boolean var2, tj.a var3);

   static ub a(uc $$0) {
      return (ub)($$0.g() ? new ub.a($$0.c()) : new ub.b($$0));
   }

   public static record a(tn a) implements ub {
      @Override
      public void a(akt $$0, boolean $$1, tj.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(uc a) implements ub {
      @Override
      public tn a() {
         return this.a.c();
      }

      @Override
      public void a(akt $$0, boolean $$1, tj.a $$2) {
         uc $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public uc b() {
         return this.a;
      }
   }
}
