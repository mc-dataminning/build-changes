import java.util.UUID;

public record xn(UUID a, csc b) {
   public static xn a(csc $$0) {
      return new xn(UUID.randomUUID(), $$0);
   }

   public xw.c a(UUID $$0) {
      return new xw($$0, this.a).a(bag.a(this.b.b(), "SHA256withRSA"));
   }

   public xt a() {
      return new xt(this.a, this.b.c());
   }

   public UUID b() {
      return this.a;
   }

   public csc c() {
      return this.b;
   }
}
