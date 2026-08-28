import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class td {
   private static final int a = 50;

   public static Collection<tc> a(Collection<uc> $$0, arq $$1) {
      Map<String, List<uc>> $$2 = $$0.stream().collect(Collectors.groupingBy(uc::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<uc> $$3 = (List<uc>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static ti a(uc $$0, int $$1, arq $$2) {
      return new ti($$0, ty.a($$1), $$2, tv.a());
   }

   public static tl.b a() {
      return a(50);
   }

   public static tl.b a(int $$0) {
      return $$1 -> {
         Map<String, List<ti>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<ti> $$3 = (List<ti>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static tc a(Collection<ti> $$0, String $$1, long $$2) {
      Consumer<arq> $$3 = tk.c($$1);
      Consumer<arq> $$4 = tk.d($$1);
      return new tc($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
