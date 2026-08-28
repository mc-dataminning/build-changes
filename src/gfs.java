public class gfs extends gft<ln> {
   protected gfs(gdh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ln $$7, ghj $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      float $$9 = this.r.i() * 0.4F + 0.6F;
      this.v = this.a($$7.b().x(), $$9);
      this.w = this.a($$7.b().y(), $$9);
      this.x = this.a($$7.b().z(), $$9);
   }

   public static class a implements ggr<ln> {
      private final ghj a;

      public a(ghj $$0) {
         this.a = $$0;
      }

      public ggo a(ln $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfs($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
