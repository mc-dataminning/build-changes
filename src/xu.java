import java.util.UUID;

public record xu(UUID a, cow b) {
   public static xu a(cow $$0) {
      return new xu(UUID.randomUUID(), $$0);
   }

   public yd.c a(UUID $$0) {
      return new yd($$0, this.a).a(baa.a(this.b.b(), "SHA256withRSA"));
   }

   public ya a() {
      return new ya(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cow c() {
      return this.b;
   }
}
