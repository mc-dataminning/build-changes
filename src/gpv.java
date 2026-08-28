import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gpv implements gpw {
   public static final String a = "AND";
   private final Iterable<? extends gpw> d;

   public gpv(Iterable<? extends gpw> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dym> getPredicate(dyn<dku, dym> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
