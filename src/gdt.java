import javax.annotation.Nullable;

public class gdt {
   private final gea a;
   private final eqq b;
   @Nullable
   private eup c;

   public gdt(gea $$0, eqq $$1) {
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
         this.b.aq();
      }
   }

   public void a(ciy $$0, ciy $$1, cem $$2) {
      if (!this.b.t) {
         if (!$$0.b() && $$1.a(cjb.qg)) {
            if ($$2 == cem.a) {
               this.a();
            } else if ($$2 == cem.b) {
               this.b();
            }
         } else if ($$0.a(cjb.qg) && !$$1.b() && $$2 == cem.b) {
            this.b();
         }
      }
   }
}
