public class ghp extends gha {
   ghp(gdh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ghj $$7) {
      super($$0, $$1, $$2, $$3, $$7, 1.25F);
      this.B = 0.6F;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.D *= 0.75F;
      this.t = 60 + this.r.a(12);
      this.b($$7);
      if (this.r.a(4) == 0) {
         this.a(0.6F + this.r.i() * 0.2F, 0.6F + this.r.i() * 0.3F, this.r.i() * 0.2F);
      } else {
         this.a(0.1F + this.r.i() * 0.2F, 0.4F + this.r.i() * 0.3F, this.r.i() * 0.2F);
      }
   }

   public static class a implements ggr<lw> {
      private final ghj a;

      public a(ghj $$0) {
         this.a = $$0;
      }

      public ggo a(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghp($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
