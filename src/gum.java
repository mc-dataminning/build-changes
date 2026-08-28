import javax.annotation.Nullable;

public class gum {
   private final gut a;
   private final ffe b;
   @Nullable
   private fjk c;

   public gum(gut $$0, ffe $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      xl $$0 = xl.c("tutorial.bundleInsert.title");
      xl $$1 = xl.c("tutorial.bundleInsert.description");
      this.c = new fjk(fjk.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.av();
      }
   }

   public void a(cuk $$0, cuk $$1, cpx $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cun.qU)) {
            if ($$2 == cpx.a) {
               this.a();
            } else if ($$2 == cpx.b) {
               this.b();
            }
         } else if ($$0.a(cun.qU) && !$$1.e() && $$2 == cpx.b) {
            this.b();
         }
      }
   }
}
