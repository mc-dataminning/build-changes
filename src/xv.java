import java.util.UUID;

public record xv(UUID a, cpq b) {
   public static xv a(cpq $$0) {
      return new xv(UUID.randomUUID(), $$0);
   }

   public ye.c a(UUID $$0) {
      return new ye($$0, this.a).a(bai.a(this.b.b(), "SHA256withRSA"));
   }

   public yb a() {
      return new yb(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cpq c() {
      return this.b;
   }
}
