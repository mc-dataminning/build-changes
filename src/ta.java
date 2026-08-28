import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ta {
   private static final int a = 50;

   public static Collection<sz> a(Collection<tz> $$0, arn $$1) {
      Map<String, List<tz>> $$2 = $$0.stream().collect(Collectors.groupingBy(tz::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tz> $$3 = (List<tz>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static tf a(tz $$0, int $$1, arn $$2) {
      return new tf($$0, tv.a($$1), $$2, ts.a());
   }

   public static ti.b a() {
      return a(50);
   }

   public static ti.b a(int $$0) {
      return $$1 -> {
         Map<String, List<tf>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.u().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<tf> $$3 = (List<tf>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static sz a(Collection<tf> $$0, String $$1, long $$2) {
      Consumer<arn> $$3 = th.c($$1);
      Consumer<arn> $$4 = th.d($$1);
      return new sz($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
