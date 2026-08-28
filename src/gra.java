import javax.annotation.Nullable;

public final class gra implements AutoCloseable {
   private final foz a;
   private final fil b;

   public gra(foz $$0) {
      this.a = $$0;
      this.b = new fil(fii::new);
   }

   public fin a(fia $$0, @Nullable String $$1, String $$2) {
      return new fin(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
