import javax.annotation.Nullable;

public class grf {
   private final grm a;
   private final fcc b;
   @Nullable
   private fgj c;

   public grf(grm $$0, fcc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wi $$0 = wi.c("tutorial.bundleInsert.title");
      wi $$1 = wi.c("tutorial.bundleInsert.description");
      this.c = new fgj(fgj.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.av();
      }
   }

   public void a(crs $$0, crs $$1, cne $$2) {
      if (!this.b.t) {
         if (!$$0.d() && $$1.a(crv.qT)) {
            if ($$2 == cne.a) {
               this.a();
            } else if ($$2 == cne.b) {
               this.b();
            }
         } else if ($$0.a(crv.qT) && !$$1.d() && $$2 == cne.b) {
            this.b();
         }
      }
   }
}
