import javax.annotation.Nullable;

public class ggp {
   private final ggw a;
   private final esv b;
   @Nullable
   private eww c;

   public ggp(ggw $$0, esv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      ur $$0 = ur.c("tutorial.bundleInsert.title");
      ur $$1 = ur.c("tutorial.bundleInsert.description");
      this.c = new eww(eww.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.as();
      }
   }

   public void a(clb $$0, clb $$1, cgm $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cle.qg)) {
            if ($$2 == cgm.a) {
               this.a();
            } else if ($$2 == cgm.b) {
               this.b();
            }
         } else if ($$0.a(cle.qg) && !$$1.b() && $$2 == cgm.b) {
            this.b();
         }
      }
   }
}
