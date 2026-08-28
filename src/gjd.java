import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gjd implements gje {
   public static final String a = "AND";
   private final Iterable<? extends gje> d;

   public gjd(Iterable<? extends gje> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<duo> getPredicate(dup<dhj, duo> $$0) {
      return ad.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
