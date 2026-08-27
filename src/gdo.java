import javax.annotation.Nullable;

public class gdo {
   private final gdv a;
   private final eqr b;
   @Nullable
   private eul c;

   public gdo(gdv $$0, eqr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      te $$0 = te.c("tutorial.bundleInsert.title");
      te $$1 = te.c("tutorial.bundleInsert.description");
      this.c = new eul(eul.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.aq();
      }
   }

   public void a(ciw $$0, ciw $$1, cek $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(ciz.qg)) {
            if ($$2 == cek.a) {
               this.a();
            } else if ($$2 == cek.b) {
               this.b();
            }
         } else if ($$0.a(ciz.qg) && !$$1.b() && $$2 == cek.b) {
            this.b();
         }
      }
   }
}
