import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sw {
   private static final int a = 50;

   public static Collection<sv> a(Collection<tv> $$0, arj $$1) {
      Map<String, List<tv>> $$2 = $$0.stream().collect(Collectors.groupingBy(tv::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tv> $$3 = (List<tv>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static tb a(tv $$0, int $$1, arj $$2) {
      return new tb($$0, tr.a($$1), $$2, to.a());
   }

   public static te.b a() {
      return a(50);
   }

   public static te.b a(int $$0) {
      return $$1 -> {
         Map<String, List<tb>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.u().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<tb> $$3 = (List<tb>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static sv a(Collection<tb> $$0, String $$1, long $$2) {
      Consumer<arj> $$3 = td.c($$1);
      Consumer<arj> $$4 = td.d($$1);
      return new sv($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
