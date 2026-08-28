public interface xp {
   xa a();

   void a(art var1, boolean var2, ww.a var3);

   static xp a(xq $$0) {
      return (xp)($$0.h() ? new xp.a($$0.d()) : new xp.b($$0));
   }

   public static record a(xa a) implements xp {
      @Override
      public void a(art $$0, boolean $$1, ww.a $$2) {
         $$0.f.a(this.a, $$2);
      }
   }

   public static record b(xq a) implements xp {
      @Override
      public xa a() {
         return this.a.d();
      }

      @Override
      public void a(art $$0, boolean $$1, ww.a $$2) {
         xq $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.f.a($$3, $$2);
         }
      }

      public xq b() {
         return this.a;
      }
   }
}
