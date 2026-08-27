import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gde implements gdb {
   public static final String a = "OR";
   private final Iterable<? extends gdb> d;

   public gde(Iterable<? extends gdb> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dqh> getPredicate(dqi<dde, dqh> $$0) {
      List<Predicate<dqh>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().anyMatch($$1xx -> $$1xx.test($$1x));
   }
}
