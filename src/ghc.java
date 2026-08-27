import javax.annotation.Nullable;

public class ghc {
   private final ghj a;
   private final eth b;
   @Nullable
   private exj c;

   public ghc(ghj $$0, eth $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      ur $$0 = ur.c("tutorial.bundleInsert.title");
      ur $$1 = ur.c("tutorial.bundleInsert.description");
      this.c = new exj(exj.a.g, $$0, $$1, true);
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

   public void a(clj $$0, clj $$1, cgu $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(clm.qR)) {
            if ($$2 == cgu.a) {
               this.a();
            } else if ($$2 == cgu.b) {
               this.b();
            }
         } else if ($$0.a(clm.qR) && !$$1.b() && $$2 == cgu.b) {
            this.b();
         }
      }
   }
}
