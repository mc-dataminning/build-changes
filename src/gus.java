import javax.annotation.Nullable;

public class gus {
   private final guz a;
   private final ffk b;
   @Nullable
   private fjq c;

   public gus(guz $$0, ffk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      xp $$0 = xp.c("tutorial.bundleInsert.title");
      xp $$1 = xp.c("tutorial.bundleInsert.description");
      this.c = new fjq(fjq.a.g, $$0, $$1, true);
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

   public void a(cuq $$0, cuq $$1, cqd $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cut.qU)) {
            if ($$2 == cqd.a) {
               this.a();
            } else if ($$2 == cqd.b) {
               this.b();
            }
         } else if ($$0.a(cut.qU) && !$$1.e() && $$2 == cqd.b) {
            this.b();
         }
      }
   }
}
