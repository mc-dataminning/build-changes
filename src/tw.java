public interface tw {
   ti a();

   void a(ako var1, boolean var2, te.a var3);

   static tw a(tx $$0) {
      return (tw)($$0.g() ? new tw.a($$0.c()) : new tw.b($$0));
   }

   public static record a(ti a) implements tw {
      @Override
      public void a(ako $$0, boolean $$1, te.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(tx a) implements tw {
      @Override
      public ti a() {
         return this.a.c();
      }

      @Override
      public void a(ako $$0, boolean $$1, te.a $$2) {
         tx $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public tx b() {
         return this.a;
      }
   }
}
