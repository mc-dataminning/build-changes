import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnu implements gnv {
   public static final String a = "AND";
   private final Iterable<? extends gnv> d;

   public gnu(Iterable<? extends gnv> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dww> getPredicate(dwx<djl, dww> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
