import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gdw implements gdx {
   public static final String a = "AND";
   private final Iterable<? extends gdx> d;

   public gdw(Iterable<? extends gdx> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<drb> getPredicate(drc<ddy, drb> $$0) {
      List<Predicate<drb>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().allMatch($$1xx -> $$1xx.test($$1x));
   }
}
