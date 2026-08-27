public interface tt {
   tf a();

   void a(akl var1, boolean var2, tb.a var3);

   static tt a(tu $$0) {
      return (tt)($$0.g() ? new tt.a($$0.c()) : new tt.b($$0));
   }

   public static record a(tf a) implements tt {
      @Override
      public void a(akl $$0, boolean $$1, tb.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(tu a) implements tt {
      @Override
      public tf a() {
         return this.a.c();
      }

      @Override
      public void a(akl $$0, boolean $$1, tb.a $$2) {
         tu $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public tu b() {
         return this.a;
      }
   }
}
