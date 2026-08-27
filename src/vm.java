import java.util.UUID;

public record vm(UUID a, cet b) {
   public static vm a(cet $$0) {
      return new vm(UUID.randomUUID(), $$0);
   }

   public vv.c a(UUID $$0) {
      return new vv($$0, this.a).a(aum.a(this.b.b(), "SHA256withRSA"));
   }

   public vs a() {
      return new vs(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cet c() {
      return this.b;
   }
}
