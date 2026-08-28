import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gff implements gfc {
   public static final String a = "OR";
   private final Iterable<? extends gfc> d;

   public gff(Iterable<? extends gfc> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dsd> getPredicate(dse<dfa, dsd> $$0) {
      List<Predicate<dsd>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().anyMatch($$1xx -> $$1xx.test($$1x));
   }
}
