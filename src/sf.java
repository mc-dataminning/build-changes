import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sf {
   private static final int a = 50;

   public static Collection<se> a(Collection<te> $$0, apu $$1) {
      Map<String, List<te>> $$2 = $$0.stream().collect(Collectors.groupingBy(te::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<te> $$3 = (List<te>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static sk a(te $$0, int $$1, apu $$2) {
      return new sk($$0, ta.a($$1), $$2, sx.a());
   }

   public static sn.b a() {
      return $$0 -> {
         Map<String, List<sk>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<sk> $$2 = (List<sk>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static se a(List<sk> $$0, String $$1, long $$2) {
      Consumer<apu> $$3 = sm.c($$1);
      Consumer<apu> $$4 = sm.d($$1);
      return new se($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
