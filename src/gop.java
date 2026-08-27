import javax.annotation.Nullable;

public class gop {
   private final gow a;
   private final ezm b;
   @Nullable
   private fdt c;

   public gop(gow $$0, ezm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vu $$0 = vu.c("tutorial.bundleInsert.title");
      vu $$1 = vu.c("tutorial.bundleInsert.description");
      this.c = new fdt(fdt.a.g, $$0, $$1, true);
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

   public void a(cqm $$0, cqm $$1, cly $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cqp.qT)) {
            if ($$2 == cly.a) {
               this.a();
            } else if ($$2 == cly.b) {
               this.b();
            }
         } else if ($$0.a(cqp.qT) && !$$1.b() && $$2 == cly.b) {
            this.b();
         }
      }
   }
}
