import javax.annotation.Nullable;

public class geo {
   private final gev a;
   private final erb b;
   @Nullable
   private evb c;

   public geo(gev $$0, erb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      tn $$0 = tn.c("tutorial.bundleInsert.title");
      tn $$1 = tn.c("tutorial.bundleInsert.description");
      this.c = new evb(evb.a.g, $$0, $$1, true);
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

   public void a(cjh $$0, cjh $$1, cev $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cjk.qg)) {
            if ($$2 == cev.a) {
               this.a();
            } else if ($$2 == cev.b) {
               this.b();
            }
         } else if ($$0.a(cjk.qg) && !$$1.b() && $$2 == cev.b) {
            this.b();
         }
      }
   }
}
