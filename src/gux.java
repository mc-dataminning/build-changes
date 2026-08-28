import javax.annotation.Nullable;

public class gux {
   private final gve a;
   private final ffr b;
   @Nullable
   private fjx c;

   public gux(gve $$0, ffr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wu $$0 = wu.c("tutorial.bundleInsert.title");
      wu $$1 = wu.c("tutorial.bundleInsert.description");
      this.c = new fjx(fjx.a.g, $$0, $$1, true);
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

   public void a(cua $$0, cua $$1, cpn $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cud.qU)) {
            if ($$2 == cpn.a) {
               this.a();
            } else if ($$2 == cpn.b) {
               this.b();
            }
         } else if ($$0.a(cud.qU) && !$$1.e() && $$2 == cpn.b) {
            this.b();
         }
      }
   }
}
