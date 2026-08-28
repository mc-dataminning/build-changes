import java.util.UUID;

public record xr(UUID a, csl b) {
   public static xr a(csl $$0) {
      return new xr(UUID.randomUUID(), $$0);
   }

   public ya.c a(UUID $$0) {
      return new ya($$0, this.a).a(bap.a(this.b.b(), "SHA256withRSA"));
   }

   public xx a() {
      return new xx(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public csl c() {
      return this.b;
   }
}
