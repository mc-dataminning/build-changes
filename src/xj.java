import java.util.Optional;

public class xj implements uo<ur> {
   private final sw a;
   private final Optional<byte[]> b;
   private final boolean c;

   public xj(sw $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public xj(sf $$0) {
      this.a = $$0.l();
      this.b = $$0.b(sf::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sf::a);
      $$0.writeBoolean(this.c);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public sw a() {
      return this.a;
   }

   public Optional<byte[]> c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
