import javax.annotation.Nullable;

public class gqw {
   private final grd a;
   private final fbt b;
   @Nullable
   private fga c;

   public gqw(grd $$0, fbt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wg $$0 = wg.c("tutorial.bundleInsert.title");
      wg $$1 = wg.c("tutorial.bundleInsert.description");
      this.c = new fga(fga.a.g, $$0, $$1, true);
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

   public void a(crj $$0, crj $$1, cmx $$2) {
      if (!this.b.t) {
         if (!$$0.d() && $$1.a(crm.qT)) {
            if ($$2 == cmx.a) {
               this.a();
            } else if ($$2 == cmx.b) {
               this.b();
            }
         } else if ($$0.a(crm.qT) && !$$1.d() && $$2 == cmx.b) {
            this.b();
         }
      }
   }
}
