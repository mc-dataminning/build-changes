import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ful implements fum {
   public static final String a = "AND";
   private final Iterable<? extends fum> d;

   public ful(Iterable<? extends fum> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dja> getPredicate(djb<cwj, dja> $$0) {
      List<Predicate<dja>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().allMatch($$1xx -> $$1xx.test($$1x));
   }
}
