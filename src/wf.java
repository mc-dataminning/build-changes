import java.util.UUID;

public record wf(UUID a, ciw b) {
   public static wf a(ciw $$0) {
      return new wf(UUID.randomUUID(), $$0);
   }

   public wo.c a(UUID $$0) {
      return new wo($$0, this.a).a(axj.a(this.b.b(), "SHA256withRSA"));
   }

   public wl a() {
      return new wl(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public ciw c() {
      return this.b;
   }
}
