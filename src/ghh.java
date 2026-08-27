import javax.annotation.Nullable;

public class ghh {
   private final gho a;
   private final etm b;
   @Nullable
   private exo c;

   public ghh(gho $$0, etm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      uv $$0 = uv.c("tutorial.bundleInsert.title");
      uv $$1 = uv.c("tutorial.bundleInsert.description");
      this.c = new exo(exo.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.as();
      }
   }

   public void a(clo $$0, clo $$1, cgz $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(clr.qR)) {
            if ($$2 == cgz.a) {
               this.a();
            } else if ($$2 == cgz.b) {
               this.b();
            }
         } else if ($$0.a(clr.qR) && !$$1.b() && $$2 == cgz.b) {
            this.b();
         }
      }
   }
}
