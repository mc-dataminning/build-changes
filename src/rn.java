import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class rn {
   private static final int a = 50;

   public static Collection<rm> a(Collection<sm> $$0, aow $$1) {
      Map<String, List<sm>> $$2 = $$0.stream().collect(Collectors.groupingBy(sm::b));
      return $$2.entrySet().stream().flatMap($$1x -> {
         String $$2x = (String)$$1x.getKey();
         Collection<sm> $$3 = (Collection<sm>)$$1x.getValue();
         MutableInt $$4 = new MutableInt();
         return Streams.stream(Iterables.partition($$3, 50)).map($$3x -> a($$3x.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$4));
      }).collect(ImmutableList.toImmutableList());
   }

   public static rs a(sm $$0, int $$1, aow $$2) {
      return new rs($$0, si.a($$1), $$2, sf.a());
   }

   public static rv.b a() {
      return $$0 -> {
         Map<String, List<rs>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            Collection<rs> $$2 = (Collection<rs>)$$0x.getValue();
            MutableInt $$3 = new MutableInt();
            return Streams.stream(Iterables.partition($$2, 50)).map($$2x -> a(ImmutableList.copyOf($$2x), $$1x, $$3));
         }).collect(ImmutableList.toImmutableList());
      };
   }

   private static rm a(List<rs> $$0, String $$1, MutableInt $$2) {
      Consumer<aow> $$3 = ru.c($$1);
      Consumer<aow> $$4 = ru.d($$1);
      return new rm($$1 + ":" + $$2.incrementAndGet(), $$0, $$3, $$4);
   }
}
