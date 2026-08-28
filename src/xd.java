public interface xd {
   wo a();

   void a(ard var1, boolean var2, wk.a var3);

   static xd a(xe $$0) {
      return (xd)($$0.h() ? new xd.a($$0.d()) : new xd.b($$0));
   }

   public static record a(wo a) implements xd {
      @Override
      public void a(ard $$0, boolean $$1, wk.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xe a) implements xd {
      @Override
      public wo a() {
         return this.a.d();
      }

      @Override
      public void a(ard $$0, boolean $$1, wk.a $$2) {
         xe $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xe b() {
         return this.a;
      }
   }
}
