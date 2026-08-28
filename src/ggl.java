import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ggl implements ggm {
   public static final String a = "AND";
   private final Iterable<? extends ggm> d;

   public ggl(Iterable<? extends ggm> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dtc> getPredicate(dtd<dfy, dtc> $$0) {
      List<Predicate<dtc>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().allMatch($$1xx -> $$1xx.test($$1x));
   }
}
