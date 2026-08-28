import javax.annotation.Nullable;

public class gur {
   private final guy a;
   private final ffj b;
   @Nullable
   private fjp c;

   public gur(guy $$0, ffj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      xp $$0 = xp.c("tutorial.bundleInsert.title");
      xp $$1 = xp.c("tutorial.bundleInsert.description");
      this.c = new fjp(fjp.a.g, $$0, $$1, true);
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

   public void a(cup $$0, cup $$1, cqc $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cus.qU)) {
            if ($$2 == cqc.a) {
               this.a();
            } else if ($$2 == cqc.b) {
               this.b();
            }
         } else if ($$0.a(cus.qU) && !$$1.e() && $$2 == cqc.b) {
            this.b();
         }
      }
   }
}
