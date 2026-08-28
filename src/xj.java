import java.util.UUID;

public record xj(UUID a, crm b) {
   public static xj a(crm $$0) {
      return new xj(UUID.randomUUID(), $$0);
   }

   public xs.c a(UUID $$0) {
      return new xs($$0, this.a).a(bac.a(this.b.b(), "SHA256withRSA"));
   }

   public xp a() {
      return new xp(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public crm c() {
      return this.b;
   }
}
