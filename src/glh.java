import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class glh implements gle {
   public static final String a = "OR";
   private final Iterable<? extends gle> d;

   public glh(Iterable<? extends gle> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dvv> getPredicate(dvw<diq, dvv> $$0) {
      return ae.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
