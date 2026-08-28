import javax.annotation.Nullable;

public class gvd {
   private final gvk a;
   private final ffx b;
   @Nullable
   private fkd c;

   public gvd(gvk $$0, ffx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wu $$0 = wu.c("tutorial.bundleInsert.title");
      wu $$1 = wu.c("tutorial.bundleInsert.description");
      this.c = new fkd(fkd.a.g, $$0, $$1, true);
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

   public void a(cuc $$0, cuc $$1, cpq $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cuf.qU)) {
            if ($$2 == cpq.a) {
               this.a();
            } else if ($$2 == cpq.b) {
               this.b();
            }
         } else if ($$0.a(cuf.qU) && !$$1.e() && $$2 == cpq.b) {
            this.b();
         }
      }
   }
}
