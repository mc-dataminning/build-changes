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
   public static final sk.a a = ($$0, $$1) -> Stream.of(new sp($$0, dsm.a, $$1, tf.a()));

   public static List<sj> a(Collection<je.c<sq>> $$0, sk.a $$1, aro $$2) {
      Map<je<tk>, List<sp>> $$3 = $$0.stream().flatMap($$2x -> $$1.decorate($$2x, $$2)).collect(Collectors.groupingBy($$0x -> $$0x.v().d()));
      return $$3.entrySet().stream().flatMap($$0x -> {
         je<tk> $$1x = (je<tk>)$$0x.getKey();
         List<sp> $$2x = (List<sp>)$$0x.getValue();
         return Streams.mapWithIndex(Lists.partition($$2x, 50).stream(), ($$1xx, $$2xx) -> a($$1xx, $$1x, (int)$$2xx));
      }).toList();
   }

   public static su.b a() {
      return a(50);
   }

   public static su.b a(int $$0) {
      return $$1 -> {
         Map<je<tk>, List<sp>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().d()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            je<tk> $$2x = (je<tk>)$$1x.getKey();
            List<sp> $$3 = (List<sp>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, (int)$$2xx));
         }).toList();
      };
   }

   public static sj a(Collection<sp> $$0, je<tk> $$1, int $$2) {
      return new sj($$2, $$0, $$1);
   }

   @FunctionalInterface
   public interface a {
      Stream<sp> decorate(je.c<sq> var1, aro var2);
   }
}
