import com.google.common.collect.Streams;
import java.util.function.Predicate;

public class grp implements grq {
   public static final String a = "AND";
   private final Iterable<? extends grq> d;

   public grp(Iterable<? extends grq> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dzz> getPredicate(eaa<dma, dzz> $$0) {
      return af.a(Streams.stream(this.d).map($$1 -> $$1.getPredicate($$0)).toList());
   }
}
