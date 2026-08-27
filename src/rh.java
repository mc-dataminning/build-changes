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

public class rh {
   private static final int d = 50;
   public static final int a = 5;
   public static final int b = 6;
   public static final int c = 8;

   public static void a(re $$0, hx $$1, rk $$2) {
      $$2.a($$0);
      $$0.a(new rq($$0, $$2, $$1));
      $$0.b($$1);
   }

   public static Collection<re> a(Collection<qz> $$0, hx $$1, dbr $$2, ami $$3, rk $$4, int $$5) {
      ra $$6 = new ra($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<re> b(Collection<ru> $$0, hx $$1, dbr $$2, ami $$3, rk $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<qz> a(Collection<ru> $$0) {
      Map<String, List<ru>> $$1 = $$0.stream().collect(Collectors.groupingBy(ru::e, LinkedHashMap::new, Collectors.toList()));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<ami> $$2 = rg.c($$1x);
         Consumer<ami> $$3 = rg.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<ru> $$5 = (Collection<ru>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new qz($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(ami $$0, hx $$1, rk $$2, int $$3) {
      $$2.a();
      hx $$4 = $$1.b(-$$3, 0, -$$3);
      hx $$5 = $$1.b($$3, 0, $$3);
      hx.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cvh.pa)).forEach($$1x -> {
         dgw $$2x = (dgw)$$0.c_($$1x);
         dxe $$3x = rr.b($$2x);
         rr.a($$3x, $$0);
      });
   }

   public static void a(ami $$0) {
      aco.a($$0);
   }
}
