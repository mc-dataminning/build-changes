import java.util.UUID;

public record wb(UUID a, chj b) {
   public static wb a(chj $$0) {
      return new wb(UUID.randomUUID(), $$0);
   }

   public wk.c a(UUID $$0) {
      return new wk($$0, this.a).a(awv.a(this.b.b(), "SHA256withRSA"));
   }

   public wh a() {
      return new wh(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public chj c() {
      return this.b;
   }
}
