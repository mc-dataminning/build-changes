import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lf implements lc {
   @Override
   public void a(in.a $$0, Consumer<af> $$1) {
      af $$2 = lc.a("adventure/root");
      lh.a($$2, $$1, Stream.concat(lh.a.stream(), Stream.of(bqb.m, bqb.l)).collect(Collectors.toList()));
   }
}
