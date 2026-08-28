import java.util.UUID;

public record xh(UUID a, cqu b) {
   public static xh a(cqu $$0) {
      return new xh(UUID.randomUUID(), $$0);
   }

   public xq.c a(UUID $$0) {
      return new xq($$0, this.a).a(baa.a(this.b.b(), "SHA256withRSA"));
   }

   public xn a() {
      return new xn(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cqu c() {
      return this.b;
   }
}
