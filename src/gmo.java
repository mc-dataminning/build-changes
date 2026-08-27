import javax.annotation.Nullable;

public class gmo {
   private final gmv a;
   private final exs b;
   @Nullable
   private fbz c;

   public gmo(gmv $$0, exs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vq $$0 = vq.c("tutorial.bundleInsert.title");
      vq $$1 = vq.c("tutorial.bundleInsert.description");
      this.c = new fbz(fbz.a.g, $$0, $$1, true);
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

   public void a(cpd $$0, cpd $$1, ckn $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cpg.qT)) {
            if ($$2 == ckn.a) {
               this.a();
            } else if ($$2 == ckn.b) {
               this.b();
            }
         } else if ($$0.a(cpg.qT) && !$$1.b() && $$2 == ckn.b) {
            this.b();
         }
      }
   }
}
