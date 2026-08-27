import java.util.Optional;

public class zm implements vf<wy> {
   private final tn a;
   private final Optional<byte[]> b;
   private final boolean c;

   public zm(tn $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zm(sq $$0) {
      this.a = $$0.l();
      this.b = $$0.b(sq::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b, sq::a);
      $$0.a(this.c);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public tn a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
