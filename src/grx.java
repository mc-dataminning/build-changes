import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class grx implements gry {
   public static final String a = "AND";
   private final Iterable<? extends gry> d;

   public grx(Iterable<? extends gry> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<eah> getPredicate(eai<dmf, eah> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
