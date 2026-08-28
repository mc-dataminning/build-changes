import java.util.UUID;

public record xg(UUID a, cqk b) {
   public static xg a(cqk $$0) {
      return new xg(UUID.randomUUID(), $$0);
   }

   public xp.c a(UUID $$0) {
      return new xp($$0, this.a).a(azy.a(this.b.b(), "SHA256withRSA"));
   }

   public xm a() {
      return new xm(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cqk c() {
      return this.b;
   }
}
