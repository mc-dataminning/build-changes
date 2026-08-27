import javax.annotation.Nullable;

public class gqe {
   private static final int a = 100;
   private final axt b = axt.a();
   private final fby c;
   @Nullable
   private gpf d;
   private int e = 100;

   public gqe(fby $$0) {
      this.c = $$0;
   }

   public void a() {
      aul $$0 = this.c.al();
      if (this.d != null) {
         if (!$$0.a().a().a().equals(this.d.a()) && $$0.d()) {
            this.c.ak().b(this.d);
            this.e = axm.a(this.b, 0, $$0.b() / 2);
         }

         if (!this.c.ak().c(this.d)) {
            this.d = null;
            this.e = Math.min(this.e, axm.a(this.b, $$0.b(), $$0.c()));
         }
      }

      this.e = Math.min(this.e, $$0.c());
      if (this.d == null && this.e-- <= 0) {
         this.a($$0);
      }
   }

   public void a(aul $$0) {
      this.d = gpa.a($$0.a().a());
      if (this.d.b() != gqj.a) {
         this.c.ak().a(this.d);
      }

      this.e = Integer.MAX_VALUE;
   }

   public void b(aul $$0) {
      if (this.c($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ak().b(this.d);
         this.d = null;
      }

      this.e += 100;
   }

   public boolean c(aul $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
