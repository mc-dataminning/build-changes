import javax.annotation.Nullable;

public class gvf {
   private final gvm a;
   private final fga b;
   @Nullable
   private fkf c;

   public gvf(gvm $$0, fga $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wu $$0 = wu.c("tutorial.bundleInsert.title");
      wu $$1 = wu.c("tutorial.bundleInsert.description");
      this.c = new fkf(fkf.a.g, $$0, $$1, true);
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

   public void a(cud $$0, cud $$1, cpr $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cug.qU)) {
            if ($$2 == cpr.a) {
               this.a();
            } else if ($$2 == cpr.b) {
               this.b();
            }
         } else if ($$0.a(cug.qU) && !$$1.e() && $$2 == cpr.b) {
            this.b();
         }
      }
   }
}
