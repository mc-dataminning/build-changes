public class gav extends gaw<le> {
   protected gav(fyj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, le $$7, gcm $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      float $$9 = this.r.i() * 0.4F + 0.6F;
      this.v = this.a($$7.b().x(), $$9);
      this.w = this.a($$7.b().y(), $$9);
      this.x = this.a($$7.b().z(), $$9);
   }

   public static class a implements gbu<le> {
      private final gcm a;

      public a(gcm $$0) {
         this.a = $$0;
      }

      public gbr a(le $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gav($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
