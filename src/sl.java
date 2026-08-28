import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sl {
   private static final int b = 50;
   public static final sl.a a = ($$0, $$1) -> Stream.of(new sr($$0, dty.a, $$1, th.a()));

   public static List<sk> a(Collection<jg.c<ss>> $$0, sl.a $$1, aru $$2) {
      Map<jg<tm>, List<sr>> $$3 = $$0.stream().flatMap($$2x -> $$1.decorate($$2x, $$2)).collect(Collectors.groupingBy($$0x -> $$0x.v().d()));
      return $$3.entrySet().stream().flatMap($$0x -> {
         jg<tm> $$1x = (jg<tm>)$$0x.getKey();
         List<sr> $$2x = (List<sr>)$$0x.getValue();
         return Streams.mapWithIndex(Lists.partition($$2x, 50).stream(), ($$1xx, $$2xx) -> a($$1xx, $$1x, (int)$$2xx));
      }).toList();
   }

   public static sw.b a() {
      return a(50);
   }

   public static sw.b a(int $$0) {
      return $$1 -> {
         Map<jg<tm>, List<sr>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().d()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            jg<tm> $$2x = (jg<tm>)$$1x.getKey();
            List<sr> $$3 = (List<sr>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, (int)$$2xx));
         }).toList();
      };
   }

   public static sk a(Collection<sr> $$0, jg<tm> $$1, int $$2) {
      return new sk($$2, $$0, $$1);
   }

   @FunctionalInterface
   public interface a {
      Stream<sr> decorate(jg.c<ss> var1, aru var2);
   }
}
