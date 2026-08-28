import javax.annotation.Nullable;

public final class gei implements AutoCloseable {
   private final ffh a;
   private final ezc b;

   public gei(ffh $$0) {
      this.a = $$0;
      this.b = new ezc(eyz::new);
   }

   public eze a(eyr $$0, @Nullable String $$1, String $$2) {
      return new eze(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
