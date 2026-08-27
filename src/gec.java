import javax.annotation.Nullable;

public class gec {
   private final gej a;
   private final eqp b;
   @Nullable
   private eup c;

   public gec(gej $$0, eqp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      tf $$0 = tf.c("tutorial.bundleInsert.title");
      tf $$1 = tf.c("tutorial.bundleInsert.description");
      this.c = new eup(eup.a.g, $$0, $$1, true);
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

   public void a(cix $$0, cix $$1, cel $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cja.qg)) {
            if ($$2 == cel.a) {
               this.a();
            } else if ($$2 == cel.b) {
               this.b();
            }
         } else if ($$0.a(cja.qg) && !$$1.b() && $$2 == cel.b) {
            this.b();
         }
      }
   }
}
