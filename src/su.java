import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class su {
   private static final int a = 50;

   public static Collection<st> a(Collection<tt> $$0, aqn $$1) {
      Map<String, List<tt>> $$2 = $$0.stream().collect(Collectors.groupingBy(tt::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tt> $$3 = (List<tt>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static sz a(tt $$0, int $$1, aqn $$2) {
      return new sz($$0, tp.a($$1), $$2, tm.a());
   }

   public static tc.b a() {
      return $$0 -> {
         Map<String, List<sz>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<sz> $$2 = (List<sz>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static st a(List<sz> $$0, String $$1, long $$2) {
      Consumer<aqn> $$3 = tb.c($$1);
      Consumer<aqn> $$4 = tb.d($$1);
      return new st($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
