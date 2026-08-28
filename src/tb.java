import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class tb {
   private static final int a = 50;

   public static Collection<ta> a(Collection<ua> $$0, arp $$1) {
      Map<String, List<ua>> $$2 = $$0.stream().collect(Collectors.groupingBy(ua::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<ua> $$3 = (List<ua>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static tg a(ua $$0, int $$1, arp $$2) {
      return new tg($$0, tw.a($$1), $$2, tt.a());
   }

   public static tj.b a() {
      return a(50);
   }

   public static tj.b a(int $$0) {
      return $$1 -> {
         Map<String, List<tg>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<tg> $$3 = (List<tg>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static ta a(Collection<tg> $$0, String $$1, long $$2) {
      Consumer<arp> $$3 = ti.c($$1);
      Consumer<arp> $$4 = ti.d($$1);
      return new ta($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
