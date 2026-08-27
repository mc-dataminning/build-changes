import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kr implements ko {
   @Override
   public void a(ij.b $$0, Consumer<af> $$1) {
      af $$2 = ko.a("adventure/root");
      kt.a($$2, $$1, Stream.concat(kt.a.stream(), Stream.of(blz.l)).collect(Collectors.toList()));
   }
}
