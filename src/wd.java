import java.util.UUID;

public record wd(UUID a, cic b) {
   public static wd a(cic $$0) {
      return new wd(UUID.randomUUID(), $$0);
   }

   public wm.c a(UUID $$0) {
      return new wm($$0, this.a).a(awz.a(this.b.b(), "SHA256withRSA"));
   }

   public wj a() {
      return new wj(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public cic c() {
      return this.b;
   }
}
