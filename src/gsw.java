public class gsw implements gse<dys> {
   private final gsa<dys> a;
   private final gsh<dys> b;

   public gsw(gsf.a $$0) {
      this.a = new gsa<>($$0);
      this.b = new gsh<>($$0);
   }

   public void a(dys $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public boolean a(dys $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aQ_() {
      return Math.max(this.a.aQ_(), this.b.aQ_());
   }

   public boolean a(dys $$0, fei $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
