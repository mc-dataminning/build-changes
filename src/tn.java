import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class tn {
   private static final int a = 50;

   public static Collection<tm> a(Collection<um> $$0, ash $$1) {
      Map<String, List<um>> $$2 = $$0.stream().collect(Collectors.groupingBy(um::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<um> $$3 = (List<um>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static ts a(um $$0, int $$1, ash $$2) {
      return new ts($$0, ui.a($$1), $$2, uf.a());
   }

   public static tv.b a() {
      return a(50);
   }

   public static tv.b a(int $$0) {
      return $$1 -> {
         Map<String, List<ts>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<ts> $$3 = (List<ts>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static tm a(Collection<ts> $$0, String $$1, long $$2) {
      Consumer<ash> $$3 = tu.c($$1);
      Consumer<ash> $$4 = tu.d($$1);
      return new tm($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
