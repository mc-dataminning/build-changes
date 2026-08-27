import javax.annotation.Nullable;

public class gei {
   private final gep a;
   private final eqt b;
   @Nullable
   private euu c;

   public gei(gep $$0, eqt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      tl $$0 = tl.c("tutorial.bundleInsert.title");
      tl $$1 = tl.c("tutorial.bundleInsert.description");
      this.c = new euu(euu.a.g, $$0, $$1, true);
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

   public void a(cjl $$0, cjl $$1, cez $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cjo.qg)) {
            if ($$2 == cez.a) {
               this.a();
            } else if ($$2 == cez.b) {
               this.b();
            }
         } else if ($$0.a(cjo.qg) && !$$1.b() && $$2 == cez.b) {
            this.b();
         }
      }
   }
}
