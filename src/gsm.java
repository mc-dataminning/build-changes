import javax.annotation.Nullable;

public class gsm {
   private final gst a;
   private final fdi b;
   @Nullable
   private fhp c;

   public gsm(gst $$0, fdi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wu $$0 = wu.c("tutorial.bundleInsert.title");
      wu $$1 = wu.c("tutorial.bundleInsert.description");
      this.c = new fhp(fhp.a.g, $$0, $$1, true);
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

   public void a(csz $$0, csz $$1, col $$2) {
      if (!this.b.t) {
         if (!$$0.d() && $$1.a(ctc.qU)) {
            if ($$2 == col.a) {
               this.a();
            } else if ($$2 == col.b) {
               this.b();
            }
         } else if ($$0.a(ctc.qU) && !$$1.d() && $$2 == col.b) {
            this.b();
         }
      }
   }
}
