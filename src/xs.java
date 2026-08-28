import java.util.UUID;

public record xs(UUID a, coj b) {
   public static xs a(coj $$0) {
      return new xs(UUID.randomUUID(), $$0);
   }

   public yb.c a(UUID $$0) {
      return new yb($$0, this.a).a(azx.a(this.b.b(), "SHA256withRSA"));
   }

   public xy a() {
      return new xy(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public coj c() {
      return this.b;
   }
}
