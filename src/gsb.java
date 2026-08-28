import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gsb implements gry {
   public static final String a = "OR";
   private final Iterable<? extends gry> d;

   public gsb(Iterable<? extends gry> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<eah> getPredicate(eai<dmf, eah> $$0) {
      return af.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
