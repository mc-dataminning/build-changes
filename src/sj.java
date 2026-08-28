import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sj {
   private static final int b = 50;
   public static final sj.a a = ($$0, $$1) -> Stream.of(new so($$0, drm.a, $$1, te.a()));

   public static List<si> a(Collection<js.c<sp>> $$0, sj.a $$1, arn $$2) {
      Map<js<tj>, List<so>> $$3 = $$0.stream().flatMap($$2x -> $$1.decorate($$2x, $$2)).collect(Collectors.groupingBy($$0x -> $$0x.v().d()));
      return $$3.entrySet().stream().flatMap($$0x -> {
         js<tj> $$1x = (js<tj>)$$0x.getKey();
         List<so> $$2x = (List<so>)$$0x.getValue();
         return Streams.mapWithIndex(Lists.partition($$2x, 50).stream(), ($$1xx, $$2xx) -> a($$1xx, $$1x, (int)$$2xx));
      }).toList();
   }

   public static st.b a() {
      return a(50);
   }

   public static st.b a(int $$0) {
      return $$1 -> {
         Map<js<tj>, List<so>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().d()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            js<tj> $$2x = (js<tj>)$$1x.getKey();
            List<so> $$3 = (List<so>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, (int)$$2xx));
         }).toList();
      };
   }

   public static si a(Collection<so> $$0, js<tj> $$1, int $$2) {
      return new si($$2, $$0, $$1);
   }

   @FunctionalInterface
   public interface a {
      Stream<so> decorate(js.c<sp> var1, arn var2);
   }
}
