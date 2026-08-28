public interface xw {
   xh a();

   void a(arn var1, boolean var2, xd.a var3);

   static xw a(xx $$0) {
      return (xw)($$0.h() ? new xw.a($$0.d()) : new xw.b($$0));
   }

   public static record a(xh a) implements xw {
      @Override
      public void a(arn $$0, boolean $$1, xd.a $$2) {
         $$0.d.a(this.a, $$2);
      }
   }

   public static record b(xx a) implements xw {
      @Override
      public xh a() {
         return this.a.d();
      }

      @Override
      public void a(arn $$0, boolean $$1, xd.a $$2) {
         xx $$3 = this.a.a($$1);
         if (!$$3.j()) {
            $$0.d.a($$3, $$2);
         }
      }

      public xx b() {
         return this.a;
      }
   }
}
