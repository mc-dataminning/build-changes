import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ss {
   private static final int a = 50;

   public static Collection<sr> a(Collection<tr> $$0, aqu $$1) {
      Map<String, List<tr>> $$2 = $$0.stream().collect(Collectors.groupingBy(tr::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<tr> $$3 = (List<tr>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static sx a(tr $$0, int $$1, aqu $$2) {
      return new sx($$0, tn.a($$1), $$2, tk.a());
   }

   public static ta.b a() {
      return a(50);
   }

   public static ta.b a(int $$0) {
      return $$1 -> {
         Map<String, List<sx>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.u().b()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            String $$2x = (String)$$1x.getKey();
            List<sx> $$3 = (List<sx>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, $$2xx));
         }).toList();
      };
   }

   public static sr a(Collection<sx> $$0, String $$1, long $$2) {
      Consumer<aqu> $$3 = sz.c($$1);
      Consumer<aqu> $$4 = sz.d($$1);
      return new sr($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
