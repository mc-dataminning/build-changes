import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ggw implements ggt {
   public static final String a = "OR";
   private final Iterable<? extends ggt> d;

   public ggw(Iterable<? extends ggt> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dtc> getPredicate(dtd<dfc, dtc> $$0) {
      List<Predicate<dtc>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().anyMatch($$1xx -> $$1xx.test($$1x));
   }
}
