import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gku implements gkv {
   public static final String a = "AND";
   private final Iterable<? extends gkv> d;

   public gku(Iterable<? extends gkv> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dvo> getPredicate(dvp<dij, dvo> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
