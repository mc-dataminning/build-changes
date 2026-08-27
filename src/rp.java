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

public class rp {
   private static final int a = 50;

   public static Collection<ro> a(Collection<so> $$0, apa $$1) {
      Map<String, List<so>> $$2 = $$0.stream().collect(Collectors.groupingBy(so::b));
      return $$2.entrySet().stream().flatMap($$1x -> {
         String $$2x = (String)$$1x.getKey();
         Collection<so> $$3 = (Collection<so>)$$1x.getValue();
         MutableInt $$4 = new MutableInt();
         return Streams.stream(Iterables.partition($$3, 50)).map($$3x -> a($$3x.stream().map($$1xxx -> a($$1xxx, 0, $$1)).toList(), $$2x, $$4));
      }).collect(ImmutableList.toImmutableList());
   }

   public static ru a(so $$0, int $$1, apa $$2) {
      return new ru($$0, sk.a($$1), $$2, sh.a());
   }

   public static rx.b a() {
      return $$0 -> {
         Map<String, List<ru>> $$1 = $$0.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0x -> $$0x.u().b()));
         return $$1.entrySet().stream().flatMap($$0x -> {
            String $$1x = (String)$$0x.getKey();
            Collection<ru> $$2 = (Collection<ru>)$$0x.getValue();
            MutableInt $$3 = new MutableInt();
            return Streams.stream(Iterables.partition($$2, 50)).map($$2x -> a(ImmutableList.copyOf($$2x), $$1x, $$3));
         }).collect(ImmutableList.toImmutableList());
      };
   }

   private static ro a(List<ru> $$0, String $$1, MutableInt $$2) {
      Consumer<apa> $$3 = rw.c($$1);
      Consumer<apa> $$4 = rw.d($$1);
      return new ro($$1 + ":" + $$2.incrementAndGet(), $$0, $$3, $$4);
   }
}
