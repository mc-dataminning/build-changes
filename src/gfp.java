import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gfp implements gfq {
   public static final String a = "AND";
   private final Iterable<? extends gfq> d;

   public gfp(Iterable<? extends gfq> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dsk> getPredicate(dsl<dfh, dsk> $$0) {
      List<Predicate<dsk>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().allMatch($$1xx -> $$1xx.test($$1x));
   }
}
