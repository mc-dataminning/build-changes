import javax.annotation.Nullable;

public class gjn {
   private final gju a;
   private final eve b;
   @Nullable
   private ezi c;

   public gjn(gju $$0, eve $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vd $$0 = vd.c("tutorial.bundleInsert.title");
      vd $$1 = vd.c("tutorial.bundleInsert.description");
      this.c = new ezi(ezi.a.g, $$0, $$1, true);
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

   public void a(cmr $$0, cmr $$1, cic $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cmu.qR)) {
            if ($$2 == cic.a) {
               this.a();
            } else if ($$2 == cic.b) {
               this.b();
            }
         } else if ($$0.a(cmu.qR) && !$$1.b() && $$2 == cic.b) {
            this.b();
         }
      }
   }
}
