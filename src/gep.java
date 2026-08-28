import javax.annotation.Nullable;

public final class gep implements AutoCloseable {
   private final ffn a;
   private final ezi b;

   public gep(ffn $$0) {
      this.a = $$0;
      this.b = new ezi(ezf::new);
   }

   public ezk a(eyx $$0, @Nullable String $$1, String $$2) {
      return new ezk(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
