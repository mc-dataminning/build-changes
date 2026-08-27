import javax.annotation.Nullable;

public class gjy {
   private final gkf a;
   private final evk b;
   @Nullable
   private ezo c;

   public gjy(gkf $$0, evk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vf $$0 = vf.c("tutorial.bundleInsert.title");
      vf $$1 = vf.c("tutorial.bundleInsert.description");
      this.c = new ezo(ezo.a.g, $$0, $$1, true);
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

   public void a(cmx $$0, cmx $$1, cii $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cna.qR)) {
            if ($$2 == cii.a) {
               this.a();
            } else if ($$2 == cii.b) {
               this.b();
            }
         } else if ($$0.a(cna.qR) && !$$1.b() && $$2 == cii.b) {
            this.b();
         }
      }
   }
}
