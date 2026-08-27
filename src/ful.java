import javax.annotation.Nullable;

public final class ful implements AutoCloseable {
   private final evr a;
   private final epm b;

   public ful(evr $$0) {
      this.a = $$0;
      this.b = new epm(epj::new);
   }

   public epo a(epb $$0, @Nullable String $$1, String $$2) {
      return new epo(this.a, this.b, $$0, $$1, $$2);
   }

   @Override
   public void close() {
      this.b.a();
   }
}
