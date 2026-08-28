import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gnv implements gnw {
   public static final String a = "AND";
   private final Iterable<? extends gnw> d;

   public gnv(Iterable<? extends gnw> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dwx> getPredicate(dwy<djm, dwx> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
