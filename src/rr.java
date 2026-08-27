import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class rr {
   private static final int a = 50;

   public static Collection<rq> a(Collection<sq> $$0, apf $$1) {
      Map<String, List<sq>> $$2 = $$0.stream().collect(Collectors.groupingBy(sq::b));
      return $$2.entrySet()
         .stream()
         .flatMap(
            $$1x -> {
               String $$2x = (String)$$1x.getKey();
               List<sq> $$3 = (List<sq>)$$1x.getValue();
               return Streams.mapWithIndex(
                  Lists.partition($$3, 50).stream(), ($$2xx, $$3x) -> a($$2xx.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$3x)
               );
            }
         )
         .toList();
   }

   public static rw a(sq $$0, int $$1, apf $$2) {
      return new rw($$0, sm.a($$1), $$2, sj.a());
   }

   public static rz.b a() {
      return $$0 -> {
         Map<String, List<rw>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            List<rw> $$2 = (List<rw>)$$0x.getValue();
            return Streams.mapWithIndex(Lists.partition($$2, 50).stream(), ($$1xx, $$2x) -> a(List.copyOf($$1xx), $$1x, $$2x));
         }).toList();
      };
   }

   private static rq a(List<rw> $$0, String $$1, long $$2) {
      Consumer<apf> $$3 = ry.c($$1);
      Consumer<apf> $$4 = ry.d($$1);
      return new rq($$1 + ":" + $$2, $$0, $$3, $$4);
   }
}
