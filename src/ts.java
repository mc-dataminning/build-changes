public interface ts {
   te a();

   void a(akj var1, boolean var2, ta.a var3);

   static ts a(tt $$0) {
      return (ts)($$0.g() ? new ts.a($$0.c()) : new ts.b($$0));
   }

   public static record a(te a) implements ts {
      @Override
      public void a(akj $$0, boolean $$1, ta.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(tt a) implements ts {
      @Override
      public te a() {
         return this.a.c();
      }

      @Override
      public void a(akj $$0, boolean $$1, ta.a $$2) {
         tt $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public tt b() {
         return this.a;
      }
   }
}
