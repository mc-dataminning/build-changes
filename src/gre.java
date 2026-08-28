import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gre implements grb {
   public static final String a = "OR";
   private final Iterable<? extends grb> d;

   public gre(Iterable<? extends grb> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dzo> getPredicate(dzp<dlu, dzo> $$0) {
      return af.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
