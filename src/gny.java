import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gny implements gnv {
   public static final String a = "OR";
   private final Iterable<? extends gnv> d;

   public gny(Iterable<? extends gnv> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dww> getPredicate(dwx<djl, dww> $$0) {
      return af.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
