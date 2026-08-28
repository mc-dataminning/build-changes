import javax.annotation.Nullable;

public class gwb {
   private final gwi a;
   private final fgs b;
   @Nullable
   private fkx c;

   public gwb(gwi $$0, fgs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   private void a() {
      if (this.c != null) {
         this.a.a(this.c);
      }

      wz $$0 = wz.c("tutorial.bundleInsert.title");
      wz $$1 = wz.c("tutorial.bundleInsert.description");
      this.c = new fkx(fkx.a.g, $$0, $$1, true);
      this.a.a(this.c, 160);
   }

   private void b() {
      if (this.c != null) {
         this.a.a(this.c);
         this.c = null;
      }

      if (!this.b.t) {
         this.b.t = true;
         this.b.aw();
      }
   }

   public void a(cuq $$0, cuq $$1, cqd $$2) {
      if (!this.b.t) {
         if (!$$0.e() && $$1.a(cut.qU)) {
            if ($$2 == cqd.a) {
               this.a();
            } else if ($$2 == cqd.b) {
               this.b();
            }
         } else if ($$0.a(cut.qU) && !$$1.e() && $$2 == cqd.b) {
            this.b();
         }
      }
   }
}
