import java.util.UUID;

public record vq(UUID a, cfk b) {
   public static vq a(cfk $$0) {
      return new vq(UUID.randomUUID(), $$0);
   }

   public vz.c a(UUID $$0) {
      return new vz($$0, this.a).a(avd.a(this.b.b(), "SHA256withRSA"));
   }

   public vw a() {
      return new vw(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cfk c() {
      return this.b;
   }
}
