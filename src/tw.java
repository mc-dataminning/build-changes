import java.util.UUID;

public record tw(UUID a, ccc b) {
   public static tw a(ccc $$0) {
      return new tw(UUID.randomUUID(), $$0);
   }

   public uf.c a(UUID $$0) {
      return new uf($$0, this.a).a(asn.a(this.b.b(), "SHA256withRSA"));
   }

   public uc a() {
      return new uc(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public ccc c() {
      return this.b;
   }
}
