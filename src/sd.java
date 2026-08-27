import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sd {
   private static final int a = 50;

   public static Collection<sc> a(Collection<tc> $$0, aps $$1) {
      Map<String, List<tc>> $$2 = $$0.stream().collect(Collectors.groupingBy(tc::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tc> $$3 = (List<tc>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static si a(tc $$0, int $$1, aps $$2) {
      return new si($$0, sy.a($$1), $$2, sv.a());
   }

   public static sl.b a() {
      return $$0 -> {
         Map<String, List<si>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<si> $$2 = (List<si>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static sc a(List<si> $$0, String $$1, long $$2) {
      Consumer<aps> $$3 = sk.c($$1);
      Consumer<aps> $$4 = sk.d($$1);
      return new sc($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
