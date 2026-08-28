import java.util.UUID;

public record xz(UUID a, cmx b) {
   public static xz a(cmx $$0) {
      return new xz(UUID.randomUUID(), $$0);
   }

   public yi.c a(UUID $$0) {
      return new yi($$0, this.a).a(azl.a(this.b.b(), "SHA256withRSA"));
   }

   public yf a() {
      return new yf(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cmx c() {
      return this.b;
   }
}
