import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sz {
   private static final int a = 50;

   public static Collection<sy> a(Collection<ty> $$0, arm $$1) {
      Map<String, List<ty>> $$2 = $$0.stream().collect(Collectors.groupingBy(ty::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<ty> $$3 = (List<ty>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static te a(ty $$0, int $$1, arm $$2) {
      return new te($$0, tu.a($$1), $$2, tr.a());
   }

   public static th.b a() {
      return a(50);
   }

   public static th.b a(int $$0) {
      return $$1 -> {
         Map<String, List<te>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.u().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<te> $$3 = (List<te>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static sy a(Collection<te> $$0, String $$1, long $$2) {
      Consumer<arm> $$3 = tg.c($$1);
      Consumer<arm> $$4 = tg.d($$1);
      return new sy($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
