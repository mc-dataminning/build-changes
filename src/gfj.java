import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gfj implements gfk {
   public static final String a = "AND";
   private final Iterable<? extends gfk> d;

   public gfj(Iterable<? extends gfk> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dsh> getPredicate(dsi<dff, dsh> $$0) {
      List<Predicate<dsh>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().allMatch($$1xx -> $$1xx.test($$1x));
   }
}
