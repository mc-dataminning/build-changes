import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gky implements gkv {
   public static final String a = "OR";
   private final Iterable<? extends gkv> d;

   public gky(Iterable<? extends gkv> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dvo> getPredicate(dvp<dij, dvo> $$0) {
      return ae.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
