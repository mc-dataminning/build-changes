import java.util.stream.Stream;

public record uf(acq a) implements tx {
   @Override
   public Stream<qr> getData(ds $$0) {
      qr $$1 = $$0.l().aG().a(this.a);
      return Stream.of($$1);
   }

   @Override
   public String toString() {
      return "storage=" + this.a;
   }
}
