import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sk {
   private static final int b = 50;
   public static final sk.a a = ($$0, $$1) -> Stream.of(new sq($$0, dst.a, $$1, tg.a()));

   public static List<sj> a(Collection<je.c<sr>> $$0, sk.a $$1, arq $$2) {
      Map<je<tl>, List<sq>> $$3 = $$0.stream().flatMap($$2x -> $$1.decorate($$2x, $$2)).collect(Collectors.groupingBy($$0x -> $$0x.v().d()));
      return $$3.entrySet().stream().flatMap($$0x -> {
         je<tl> $$1x = (je<tl>)$$0x.getKey();
         List<sq> $$2x = (List<sq>)$$0x.getValue();
         return Streams.mapWithIndex(Lists.partition($$2x, 50).stream(), ($$1xx, $$2xx) -> a($$1xx, $$1x, (int)$$2xx));
      }).toList();
   }

   public static sv.b a() {
      return a(50);
   }

   public static sv.b a(int $$0) {
      return $$1 -> {
         Map<je<tl>, List<sq>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().d()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            je<tl> $$2x = (je<tl>)$$1x.getKey();
            List<sq> $$3 = (List<sq>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, (int)$$2xx));
         }).toList();
      };
   }

   public static sj a(Collection<sq> $$0, je<tl> $$1, int $$2) {
      return new sj($$2, $$0, $$1);
   }

   @FunctionalInterface
   public interface a {
      Stream<sq> decorate(je.c<sr> var1, arq var2);
   }
}
