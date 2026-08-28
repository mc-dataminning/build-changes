import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class tj {
   private static final int a = 50;

   public static Collection<ti> a(Collection<ui> $$0, arf $$1) {
      Map<String, List<ui>> $$2 = $$0.stream().collect(Collectors.groupingBy(ui::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<ui> $$3 = (List<ui>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static to a(ui $$0, int $$1, arf $$2) {
      return new to($$0, ue.a($$1), $$2, ub.a());
   }

   public static tr.b a() {
      return $$0 -> {
         Map<String, List<to>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<to> $$2 = (List<to>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static ti a(List<to> $$0, String $$1, long $$2) {
      Consumer<arf> $$3 = tq.c($$1);
      Consumer<arf> $$4 = tq.d($$1);
      return new ti($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
