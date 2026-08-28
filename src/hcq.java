public class hcq extends hcw<hfq, git> {
   private final git a;
   private final git b;
   private final hch c;

   public hcq(haf<hfq, git> $$0, gla $$1, hch $$2) {
      super($$0);
      this.c = $$2;
      this.a = new git($$1.a(gld.bH));
      this.b = new git($$1.a(gld.bG));
   }

   public void a(flo $$0, gsa $$1, int $$2, hfq $$3, float $$4, float $$5) {
      czy $$6 = $$3.c;
      dih $$7 = $$6.a(kk.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, czy.k, dig.m, $$2);
      }
   }

   private void a(flo $$0, gsa $$1, hfq $$2, czy $$3, alh<dif> $$4, int $$5) {
      git $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hng.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
