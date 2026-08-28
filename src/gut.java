import javax.annotation.Nullable;

public class gut {
   private final gva a;
   private final ffl b;
   @Nullable
   private fjr c;

   public gut(gva $$0, ffl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      xp $$0 = xp.c("tutorial.bundleInsert.title");
      xp $$1 = xp.c("tutorial.bundleInsert.description");
      this.c = new fjr(fjr.a.g, $$0, $$1, true);
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

   public void a(cur $$0, cur $$1, cqe $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cuu.qU)) {
            if ($$2 == cqe.a) {
               this.a();
            } else if ($$2 == cqe.b) {
               this.b();
            }
         } else if ($$0.a(cuu.qU) && !$$1.e() && $$2 == cqe.b) {
            this.b();
         }
      }
   }
}
