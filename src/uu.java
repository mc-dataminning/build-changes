import java.util.stream.Stream;

public record uu(aex a) implements um {
   @Override
   public Stream<qx> getData(dt $$0) {
      qx $$1 = $$0.l().aG().a(this.a);
      return Stream.of($$1);
   }

   @Override
   public String toString() {
      return "storage=" + this.a;
   }
}
