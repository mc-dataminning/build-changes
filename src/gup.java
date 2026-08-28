import javax.annotation.Nullable;

public class gup {
   private final guw a;
   private final ffh b;
   @Nullable
   private fjn c;

   public gup(guw $$0, ffh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      xo $$0 = xo.c("tutorial.bundleInsert.title");
      xo $$1 = xo.c("tutorial.bundleInsert.description");
      this.c = new fjn(fjn.a.g, $$0, $$1, true);
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

   public void a(cun $$0, cun $$1, cqa $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cuq.qU)) {
            if ($$2 == cqa.a) {
               this.a();
            } else if ($$2 == cqa.b) {
               this.b();
            }
         } else if ($$0.a(cuq.qU) && !$$1.e() && $$2 == cqa.b) {
            this.b();
         }
      }
   }
}
