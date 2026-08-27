import java.util.UUID;

public record xi(UUID a, cly b) {
   public static xi a(cly $$0) {
      return new xi(UUID.randomUUID(), $$0);
   }

   public xr.c a(UUID $$0) {
      return new xr($$0, this.a).a(ayq.a(this.b.b(), "SHA256withRSA"));
   }

   public xo a() {
      return new xo(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cly c() {
      return this.b;
   }
}
