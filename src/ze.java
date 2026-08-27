import java.util.Optional;

public class ze implements ux<wp> {
   private final tf a;
   private final Optional<byte[]> b;
   private final boolean c;

   public ze(tf $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ze(si $$0) {
      this.a = $$0.l();
      this.b = $$0.b(si::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b, si::a);
      $$0.a(this.c);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public tf a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
