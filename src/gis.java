import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class gis implements gip {
   public static final String a = "OR";
   private final Iterable<? extends gip> d;

   public gis(Iterable<? extends gip> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dua> getPredicate(dub<dgv, dua> $$0) {
      return ad.b(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
