import java.util.UUID;

public record xa(UUID a, coz b) {
   public static xa a(coz $$0) {
      return new xa(UUID.randomUUID(), $$0);
   }

   public xj.c a(UUID $$0) {
      return new xj($$0, this.a).a(azn.a(this.b.b(), "SHA256withRSA"));
   }

   public xg a() {
      return new xg(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public coz c() {
      return this.b;
   }
}
