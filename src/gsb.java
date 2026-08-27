import javax.annotation.Nullable;

public class gsb {
   private final gsi a;
   private final fcy b;
   @Nullable
   private fhf c;

   public gsb(gsi $$0, fcy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      ws $$0 = ws.c("tutorial.bundleInsert.title");
      ws $$1 = ws.c("tutorial.bundleInsert.description");
      this.c = new fhf(fhf.a.g, $$0, $$1, true);
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

   public void a(csd $$0, csd $$1, cnp $$2) {
      if (!this.b.t) {
         if (!$$0.d() && $$1.a(csg.qU)) {
            if ($$2 == cnp.a) {
               this.a();
            } else if ($$2 == cnp.b) {
               this.b();
            }
         } else if ($$0.a(csg.qU) && !$$1.d() && $$2 == cnp.b) {
            this.b();
         }
      }
   }
}
