import javax.annotation.Nullable;

public class fzy {
   private final gaf a;
   private final enr b;
   @Nullable
   private eri c;

   public fzy(gaf $$0, enr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      sw $$0 = sw.c("tutorial.bundleInsert.title");
      sw $$1 = sw.c("tutorial.bundleInsert.description");
      this.c = new eri(eri.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.aq();
      }
   }

   public void a(cfz $$0, cfz $$1, cbn $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cgc.qg)) {
            if ($$2 == cbn.a) {
               this.a();
            } else if ($$2 == cbn.b) {
               this.b();
            }
         } else if ($$0.a(cgc.qg) && !$$1.b() && $$2 == cbn.b) {
            this.b();
         }
      }
   }
}
