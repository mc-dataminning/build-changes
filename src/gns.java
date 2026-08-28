import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gns implements gnt {
   public static final String a = "AND";
   private final Iterable<? extends gnt> d;

   public gns(Iterable<? extends gnt> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dwv> getPredicate(dww<djk, dwv> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
