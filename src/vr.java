import java.util.UUID;

public record vr(UUID a, cfs b) {
   public static vr a(cfs $$0) {
      return new vr(UUID.randomUUID(), $$0);
   }

   public wa.c a(UUID $$0) {
      return new wa($$0, this.a).a(ave.a(this.b.b(), "SHA256withRSA"));
   }

   public vx a() {
      return new vx(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cfs c() {
      return this.b;
   }
}
