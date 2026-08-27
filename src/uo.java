import java.util.stream.Stream;

public record uo(aer a) implements ug {
   @Override
   public Stream<qr> getData(dr $$0) {
      qr $$1 = $$0.l().aG().a(this.a);
      return Stream.of($$1);
   }

   @Override
   public String toString() {
      return "storage=" + this.a;
   }
}
