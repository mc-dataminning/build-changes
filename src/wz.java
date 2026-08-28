import java.util.UUID;

public record wz(UUID a, cox b) {
   public static wz a(cox $$0) {
      return new wz(UUID.randomUUID(), $$0);
   }

   public xi.c a(UUID $$0) {
      return new xi($$0, this.a).a(azm.a(this.b.b(), "SHA256withRSA"));
   }

   public xf a() {
      return new xf(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cox c() {
      return this.b;
   }
}
