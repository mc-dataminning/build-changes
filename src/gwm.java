import javax.annotation.Nullable;

public class gwm {
   private final gwt a;
   private final fgn b;
   @Nullable
   private fky c;

   public gwm(gwt $$0, fgn $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      xe $$0 = xe.c("tutorial.bundleInsert.title");
      xe $$1 = xe.c("tutorial.bundleInsert.description");
      this.c = new fky(fky.a.g, $$0, $$1, true);
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

   public void a(cuh $$0, cuh $$1, cpo $$2) {
      if (!this.b.t) {
         if (!$$0.d() && $$1.a(cuk.sr)) {
            if ($$2 == cpo.a) {
               this.a();
            } else if ($$2 == cpo.b) {
               this.b();
            }
         } else if ($$0.a(cuk.sr) && !$$1.d() && $$2 == cpo.b) {
            this.b();
         }
      }
   }
}
