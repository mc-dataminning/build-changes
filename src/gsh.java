public class gsh implements grp<dyi> {
   private final grl<dyi> a;
   private final grs<dyi> b;

   public gsh(grq.a $$0) {
      this.a = new grl<>($$0);
      this.b = new grs<>($$0);
   }

   public void a(dyi $$0, float $$1, fiq $$2, gpd $$3, int $$4, int $$5) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public boolean a(dyi $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aQ_() {
      return Math.max(this.a.aQ_(), this.b.aQ_());
   }

   public boolean a(dyi $$0, fdw $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
