import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sg {
   private static final int a = 50;

   public static Collection<sf> a(Collection<tf> $$0, ard $$1) {
      Map<String, List<tf>> $$2 = $$0.stream().collect(Collectors.groupingBy(tf::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tf> $$3 = (List<tf>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static sl a(tf $$0, int $$1, ard $$2) {
      return new sl($$0, tb.a($$1), $$2, sy.a());
   }

   public static so.b a() {
      return a(50);
   }

   public static so.b a(int $$0) {
      return $$1 -> {
         Map<String, List<sl>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<sl> $$3 = (List<sl>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static sf a(Collection<sl> $$0, String $$1, long $$2) {
      Consumer<ard> $$3 = sn.c($$1);
      Consumer<ard> $$4 = sn.d($$1);
      return new sf($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
