import javax.annotation.Nullable;

public class gem {
   private final get a;
   private final eqz b;
   @Nullable
   private euz c;

   public gem(get $$0, eqz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      tm $$0 = tm.c("tutorial.bundleInsert.title");
      tm $$1 = tm.c("tutorial.bundleInsert.description");
      this.c = new euz(euz.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.ar();
      }
   }

   public void a(cjf $$0, cjf $$1, cet $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cji.qg)) {
            if ($$2 == cet.a) {
               this.a();
            } else if ($$2 == cet.b) {
               this.b();
            }
         } else if ($$0.a(cji.qg) && !$$1.b() && $$2 == cet.b) {
            this.b();
         }
      }
   }
}
