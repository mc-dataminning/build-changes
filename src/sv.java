import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sv {
   private static final int a = 50;

   public static Collection<su> a(Collection<tu> $$0, arh $$1) {
      Map<String, List<tu>> $$2 = $$0.stream().collect(Collectors.groupingBy(tu::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tu> $$3 = (List<tu>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static ta a(tu $$0, int $$1, arh $$2) {
      return new ta($$0, tq.a($$1), $$2, tn.a());
   }

   public static td.b a() {
      return a(50);
   }

   public static td.b a(int $$0) {
      return $$1 -> {
         Map<String, List<ta>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.u().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<ta> $$3 = (List<ta>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static su a(Collection<ta> $$0, String $$1, long $$2) {
      Consumer<arh> $$3 = tc.c($$1);
      Consumer<arh> $$4 = tc.d($$1);
      return new su($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
