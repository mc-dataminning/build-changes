import javax.annotation.Nullable;

public class gom {
   private final got a;
   private final ezk b;
   @Nullable
   private fdr c;

   public gom(got $$0, ezk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vu $$0 = vu.c("tutorial.bundleInsert.title");
      vu $$1 = vu.c("tutorial.bundleInsert.description");
      this.c = new fdr(fdr.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.at();
      }
   }

   public void a(cqk $$0, cqk $$1, clw $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cqn.qT)) {
            if ($$2 == clw.a) {
               this.a();
            } else if ($$2 == clw.b) {
               this.b();
            }
         } else if ($$0.a(cqn.qT) && !$$1.b() && $$2 == clw.b) {
            this.b();
         }
      }
   }
}
