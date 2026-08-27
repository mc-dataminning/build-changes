import java.util.UUID;

public record vg(UUID a, ceb b) {
   public static vg a(ceb $$0) {
      return new vg(UUID.randomUUID(), $$0);
   }

   public vp.c a(UUID $$0) {
      return new vp($$0, this.a).a(aud.a(this.b.b(), "SHA256withRSA"));
   }

   public vm a() {
      return new vm(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public ceb c() {
      return this.b;
   }
}
