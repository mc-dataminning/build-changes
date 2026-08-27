public interface tz {
   tl a();

   void a(akr var1, boolean var2, th.a var3);

   static tz a(ua $$0) {
      return (tz)($$0.g() ? new tz.a($$0.c()) : new tz.b($$0));
   }

   public static record a(tl a) implements tz {
      @Override
      public void a(akr $$0, boolean $$1, th.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(ua a) implements tz {
      @Override
      public tl a() {
         return this.a.c();
      }

      @Override
      public void a(akr $$0, boolean $$1, th.a $$2) {
         ua $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public ua b() {
         return this.a;
      }
   }
}
