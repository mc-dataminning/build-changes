import java.util.UUID;

public record xj(UUID a, cmx b) {
   public static xj a(cmx $$0) {
      return new xj(UUID.randomUUID(), $$0);
   }

   public xs.c a(UUID $$0) {
      return new xs($$0, this.a).a(azb.a(this.b.b(), "SHA256withRSA"));
   }

   public xp a() {
      return new xp(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cmx c() {
      return this.b;
   }
}
