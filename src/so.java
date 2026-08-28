import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class so {
   private static final int a = 50;

   public static Collection<sn> a(Collection<tn> $$0, aqm $$1) {
      Map<String, List<tn>> $$2 = $$0.stream().collect(Collectors.groupingBy(tn::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tn> $$3 = (List<tn>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static st a(tn $$0, int $$1, aqm $$2) {
      return new st($$0, tj.a($$1), $$2, tg.a());
   }

   public static sw.b a() {
      return $$0 -> {
         Map<String, List<st>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<st> $$2 = (List<st>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static sn a(List<st> $$0, String $$1, long $$2) {
      Consumer<aqm> $$3 = sv.c($$1);
      Consumer<aqm> $$4 = sv.d($$1);
      return new sn($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
