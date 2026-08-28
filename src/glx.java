public class glx extends glz {
   protected glx(gjz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, god $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.5F, 20, 0.1F, false);
   }

   public static class a implements gnl<mb> {
      private final god a;

      public a(god $$0) {
         this.a = $$0;
      }

      public gni a(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new glx($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, 1.0F, this.a);
      }
   }
}
