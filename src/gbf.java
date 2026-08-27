public class gbf extends gax {
   private final big n;

   public gbf(aot $$0, aov $$1, float $$2, float $$3, big $$4, long $$5) {
      super($$0, $$1, art.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (double)((float)this.n.dp());
      this.g = (double)((float)this.n.dr());
      this.h = (double)((float)this.n.dv());
   }

   @Override
   public boolean s() {
      return !this.n.aS();
   }

   @Override
   public void q() {
      if (this.n.dF()) {
         this.n();
      } else {
         this.f = (double)((float)this.n.dp());
         this.g = (double)((float)this.n.dr());
         this.h = (double)((float)this.n.dv());
      }
   }
}
