public interface ux {
   ui a();

   void a(alr var1, boolean var2, ue.a var3);

   static ux a(uy $$0) {
      return (ux)($$0.g() ? new ux.a($$0.c()) : new ux.b($$0));
   }

   public static record a(ui a) implements ux {
      @Override
      public void a(alr $$0, boolean $$1, ue.a $$2) {
         $$0.c.a(this.a, $$2);
      }
   }

   public static record b(uy a) implements ux {
      @Override
      public ui a() {
         return this.a.c();
      }

      @Override
      public void a(alr $$0, boolean $$1, ue.a $$2) {
         uy $$3 = this.a.a($$1);
         if (!$$3.i()) {
            $$0.c.a($$3, $$2);
         }
      }

      public uy b() {
         return this.a;
      }
   }
}
