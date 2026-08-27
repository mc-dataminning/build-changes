import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gea implements gdx {
   public static final String a = "OR";
   private final Iterable<? extends gdx> d;

   public gea(Iterable<? extends gdx> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<drb> getPredicate(drc<ddy, drb> $$0) {
      List<Predicate<drb>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().anyMatch($$1xx -> $$1xx.test($$1x));
   }
}
