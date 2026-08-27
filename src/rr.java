import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class rr {
   private static final int d = 50;
   public static final int a = 5;
   public static final int b = 6;
   public static final int c = 8;

   public static void a(ro $$0, hx $$1, ru $$2) {
      $$2.a($$0);
      $$0.a(new sa($$0, $$2, $$1));
      $$0.b($$1);
   }

   public static Collection<ro> a(Collection<rj> $$0, hx $$1, ddb $$2, and $$3, ru $$4, int $$5) {
      rk $$6 = new rk($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<ro> b(Collection<se> $$0, hx $$1, ddb $$2, and $$3, ru $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<rj> a(Collection<se> $$0) {
      Map<String, List<se>> $$1 = $$0.stream().collect(Collectors.groupingBy(se::e, LinkedHashMap::new, Collectors.toList()));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<and> $$2 = rq.c($$1x);
         Consumer<and> $$3 = rq.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<se> $$5 = (Collection<se>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new rj($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(and $$0, hx $$1, ru $$2, int $$3) {
      $$2.a();
      hx $$4 = $$1.b(-$$3, 0, -$$3);
      hx $$5 = $$1.b($$3, 0, $$3);
      hx.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cwr.pa)).forEach($$1x -> {
         dii $$2x = (dii)$$0.c_($$1x);
         dyx $$3x = sb.b($$2x);
         sb.a($$3x, $$0);
      });
   }

   public static void a(and $$0) {
      adi.a($$0);
   }
}
