import javax.annotation.Nullable;

public class guq {
   private final gux a;
   private final ffi b;
   @Nullable
   private fjo c;

   public guq(gux $$0, ffi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      xo $$0 = xo.c("tutorial.bundleInsert.title");
      xo $$1 = xo.c("tutorial.bundleInsert.description");
      this.c = new fjo(fjo.a.g, $$0, $$1, true);
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

   public void a(cuo $$0, cuo $$1, cqb $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cur.qU)) {
            if ($$2 == cqb.a) {
               this.a();
            } else if ($$2 == cqb.b) {
               this.b();
            }
         } else if ($$0.a(cur.qU) && !$$1.e() && $$2 == cqb.b) {
            this.b();
         }
      }
   }
}
