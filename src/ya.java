import java.util.UUID;

public record ya(UUID a, cmz b) {
   public static ya a(cmz $$0) {
      return new ya(UUID.randomUUID(), $$0);
   }

   public yj.c a(UUID $$0) {
      return new yj($$0, this.a).a(azn.a(this.b.b(), "SHA256withRSA"));
   }

   public yg a() {
      return new yg(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cmz c() {
      return this.b;
   }
}
