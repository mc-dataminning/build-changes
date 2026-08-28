import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gjh implements gje {
   public static final String a = "OR";
   private final Iterable<? extends gje> d;

   public gjh(Iterable<? extends gje> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<duo> getPredicate(dup<dhj, duo> $$0) {
      return ad.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
