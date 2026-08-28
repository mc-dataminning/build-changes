import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gld implements gle {
   public static final String a = "AND";
   private final Iterable<? extends gle> d;

   public gld(Iterable<? extends gle> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dvv> getPredicate(dvw<diq, dvv> $$0) {
      return ae.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
