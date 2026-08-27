import java.util.stream.Stream;

public record uu(aew a) implements um {
   @Override
   public Stream<qw> getData(dt $$0) {
      qw $$1 = $$0.l().aG().a(this.a);
      return Stream.of($$1);
   }

   @Override
   public String toString() {
      return "storage=" + this.a;
   }
}
