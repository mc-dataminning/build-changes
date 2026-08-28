import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class tc {
   private static final int a = 50;

   public static Collection<tb> a(Collection<ub> $$0, arx $$1) {
      Map<String, List<ub>> $$2 = $$0.stream().collect(Collectors.groupingBy(ub::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<ub> $$3 = (List<ub>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static th a(ub $$0, int $$1, arx $$2) {
      return new th($$0, tx.a($$1), $$2, tu.a());
   }

   public static tk.b a() {
      return a(50);
   }

   public static tk.b a(int $$0) {
      return $$1 -> {
         Map<String, List<th>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<th> $$3 = (List<th>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static tb a(Collection<th> $$0, String $$1, long $$2) {
      Consumer<arx> $$3 = tj.c($$1);
      Consumer<arx> $$4 = tj.d($$1);
      return new tb($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
