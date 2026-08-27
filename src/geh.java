import javax.annotation.Nullable;

public class geh {
   private final geo a;
   private final equ b;
   @Nullable
   private euu c;

   public geh(geo $$0, equ $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      ti $$0 = ti.c("tutorial.bundleInsert.title");
      ti $$1 = ti.c("tutorial.bundleInsert.description");
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

   public void a(cja $$0, cja $$1, ceo $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cjd.qg)) {
            if ($$2 == ceo.a) {
               this.a();
            } else if ($$2 == ceo.b) {
               this.b();
            }
         } else if ($$0.a(cjd.qg) && !$$1.b() && $$2 == ceo.b) {
            this.b();
         }
      }
   }
}
