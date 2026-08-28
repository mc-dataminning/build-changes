import javax.annotation.Nullable;

public class gvu {
   private final gwb a;
   private final fgm b;
   @Nullable
   private fkr c;

   public gvu(gwb $$0, fgm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wy $$0 = wy.c("tutorial.bundleInsert.title");
      wy $$1 = wy.c("tutorial.bundleInsert.description");
      this.c = new fkr(fkr.a.g, $$0, $$1, true);
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
