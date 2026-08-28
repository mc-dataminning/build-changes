import java.util.UUID;

public record xf(UUID a, cmj b) {
   public static xf a(cmj $$0) {
      return new xf(UUID.randomUUID(), $$0);
   }

   public xo.c a(UUID $$0) {
      return new xo($$0, this.a).a(ays.a(this.b.b(), "SHA256withRSA"));
   }

   public xl a() {
      return new xl(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cmj c() {
      return this.b;
   }
}
