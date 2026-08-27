import java.util.UUID;

public record ut(UUID a, ccz b) {
   public static ut a(ccz $$0) {
      return new ut(UUID.randomUUID(), $$0);
   }

   public vc.c a(UUID $$0) {
      return new vc($$0, this.a).a(atk.a(this.b.b(), "SHA256withRSA"));
   }

   public uz a() {
      return new uz(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public ccz c() {
      return this.b;
   }
}
