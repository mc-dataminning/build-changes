import java.util.UUID;

public record vo(UUID a, cfd b) {
   public static vo a(cfd $$0) {
      return new vo(UUID.randomUUID(), $$0);
   }

   public vx.c a(UUID $$0) {
      return new vx($$0, this.a).a(auw.a(this.b.b(), "SHA256withRSA"));
   }

   public vu a() {
      return new vu(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cfd c() {
      return this.b;
   }
}
