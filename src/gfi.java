import javax.annotation.Nullable;

public class gfi {
   private final gfp a;
   private final ers b;
   @Nullable
   private evt c;

   public gfi(gfp $$0, ers $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      ui $$0 = ui.c("tutorial.bundleInsert.title");
      ui $$1 = ui.c("tutorial.bundleInsert.description");
      this.c = new evt(evt.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.ar();
      }
   }

   public void a(ckj $$0, ckj $$1, cfx $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(ckm.qg)) {
            if ($$2 == cfx.a) {
               this.a();
            } else if ($$2 == cfx.b) {
               this.b();
            }
         } else if ($$0.a(ckm.qg) && !$$1.b() && $$2 == cfx.b) {
            this.b();
         }
      }
   }
}
