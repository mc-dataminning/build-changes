import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ti {
   private static final int a = 50;

   public static Collection<th> a(Collection<uh> $$0, are $$1) {
      Map<String, List<uh>> $$2 = $$0.stream().collect(Collectors.groupingBy(uh::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<uh> $$3 = (List<uh>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static tn a(uh $$0, int $$1, are $$2) {
      return new tn($$0, ud.a($$1), $$2, ua.a());
   }

   public static tq.b a() {
      return $$0 -> {
         Map<String, List<tn>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<tn> $$2 = (List<tn>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static th a(List<tn> $$0, String $$1, long $$2) {
      Consumer<are> $$3 = tp.c($$1);
      Consumer<are> $$4 = tp.d($$1);
      return new th($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
