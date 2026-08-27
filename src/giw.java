import javax.annotation.Nullable;

public class giw {
   private final gjd a;
   private final euo b;
   @Nullable
   private eyr c;

   public giw(gjd $$0, euo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vb $$0 = vb.c("tutorial.bundleInsert.title");
      vb $$1 = vb.c("tutorial.bundleInsert.description");
      this.c = new eyr(eyr.a.g, $$0, $$1, true);
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

   public void a(cmh $$0, cmh $$1, chs $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cmk.qR)) {
            if ($$2 == chs.a) {
               this.a();
            } else if ($$2 == chs.b) {
               this.b();
            }
         } else if ($$0.a(cmk.qR) && !$$1.b() && $$2 == chs.b) {
            this.b();
         }
      }
   }
}
