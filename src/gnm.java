import javax.annotation.Nullable;

public class gnm {
   private final gnt a;
   private final eyo b;
   @Nullable
   private fcv c;

   public gnm(gnt $$0, eyo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vs $$0 = vs.c("tutorial.bundleInsert.title");
      vs $$1 = vs.c("tutorial.bundleInsert.description");
      this.c = new fcv(fcv.a.g, $$0, $$1, true);
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

   public void a(cpq $$0, cpq $$1, clc $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cpt.qT)) {
            if ($$2 == clc.a) {
               this.a();
            } else if ($$2 == clc.b) {
               this.b();
            }
         } else if ($$0.a(cpt.qT) && !$$1.b() && $$2 == clc.b) {
            this.b();
         }
      }
   }
}
