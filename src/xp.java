import java.util.UUID;

public record xp(UUID a, cnz b) {
   public static xp a(cnz $$0) {
      return new xp(UUID.randomUUID(), $$0);
   }

   public xy.c a(UUID $$0) {
      return new xy($$0, this.a).a(azt.a(this.b.b(), "SHA256withRSA"));
   }

   public xv a() {
      return new xv(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cnz c() {
      return this.b;
   }
}
