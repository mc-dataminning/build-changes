import java.util.stream.Stream;

public record un(aep a) implements uf {
   @Override
   public Stream<qs> getData(ds $$0) {
      qs $$1 = $$0.l().aG().a(this.a);
      return Stream.of($$1);
   }

   @Override
   public String toString() {
      return "storage=" + this.a;
   }
}
