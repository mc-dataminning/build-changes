import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sp {
   private static final int a = 50;

   public static Collection<so> a(Collection<to> $$0, aqe $$1) {
      Map<String, List<to>> $$2 = $$0.stream().collect(Collectors.groupingBy(to::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<to> $$3 = (List<to>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static su a(to $$0, int $$1, aqe $$2) {
      return new su($$0, tk.a($$1), $$2, th.a());
   }

   public static sx.b a() {
      return $$0 -> {
         Map<String, List<su>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<su> $$2 = (List<su>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static so a(List<su> $$0, String $$1, long $$2) {
      Consumer<aqe> $$3 = sw.c($$1);
      Consumer<aqe> $$4 = sw.d($$1);
      return new so($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
