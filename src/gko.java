import javax.annotation.Nullable;

public class gko {
   private final gkv a;
   private final evv b;
   @Nullable
   private fab c;

   public gko(gkv $$0, evv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      vg $$0 = vg.c("tutorial.bundleInsert.title");
      vg $$1 = vg.c("tutorial.bundleInsert.description");
      this.c = new fab(fab.a.g, $$0, $$1, true);
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

   public void a(cng $$0, cng $$1, cir $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cnj.qT)) {
            if ($$2 == cir.a) {
               this.a();
            } else if ($$2 == cir.b) {
               this.b();
            }
         } else if ($$0.a(cnj.qT) && !$$1.b() && $$2 == cir.b) {
            this.b();
         }
      }
   }
}
