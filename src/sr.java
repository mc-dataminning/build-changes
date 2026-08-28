import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sr {
   private static final int a = 50;

   public static Collection<sq> a(Collection<tq> $$0, aqt $$1) {
      Map<String, List<tq>> $$2 = $$0.stream().collect(Collectors.groupingBy(tq::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tq> $$3 = (List<tq>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static sw a(tq $$0, int $$1, aqt $$2) {
      return new sw($$0, tm.a($$1), $$2, tj.a());
   }

   public static sz.b a() {
      return $$0 -> {
         Map<String, List<sw>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<sw> $$2 = (List<sw>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static sq a(List<sw> $$0, String $$1, long $$2) {
      Consumer<aqt> $$3 = sy.c($$1);
      Consumer<aqt> $$4 = sy.d($$1);
      return new sq($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
