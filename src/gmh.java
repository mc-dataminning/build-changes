import javax.annotation.Nullable;

public class gmh {
   private final gmo a;
   private final exl b;
   @Nullable
   private fbs c;

   public gmh(gmo $$0, exl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vq $$0 = vq.c("tutorial.bundleInsert.title");
      vq $$1 = vq.c("tutorial.bundleInsert.description");
      this.c = new fbs(fbs.a.g, $$0, $$1, true);
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

   public void a(coz $$0, coz $$1, ckj $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cpc.qT)) {
            if ($$2 == ckj.a) {
               this.a();
            } else if ($$2 == ckj.b) {
               this.b();
            }
         } else if ($$0.a(cpc.qT) && !$$1.b() && $$2 == ckj.b) {
            this.b();
         }
      }
   }
}
