import javax.annotation.Nullable;

public class gka {
   private final gkh a;
   private final evm b;
   @Nullable
   private ezq c;

   public gka(gkh $$0, evm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vf $$0 = vf.c("tutorial.bundleInsert.title");
      vf $$1 = vf.c("tutorial.bundleInsert.description");
      this.c = new ezq(ezq.a.g, $$0, $$1, true);
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

   public void a(cmy $$0, cmy $$1, cij $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cnb.qR)) {
            if ($$2 == cij.a) {
               this.a();
            } else if ($$2 == cij.b) {
               this.b();
            }
         } else if ($$0.a(cnb.qR) && !$$1.b() && $$2 == cij.b) {
            this.b();
         }
      }
   }
}
