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

public class rs {
   private static final int d = 50;
   public static final int a = 5;
   public static final int b = 6;
   public static final int c = 8;

   public static void a(rp $$0, hx $$1, rv $$2) {
      $$2.a($$0);
      $$0.a(new sb($$0, $$2, $$1));
      $$0.b($$1);
   }

   public static Collection<rp> a(Collection<rk> $$0, hx $$1, ddk $$2, ane $$3, rv $$4, int $$5) {
      rl $$6 = new rl($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<rp> b(Collection<sf> $$0, hx $$1, ddk $$2, ane $$3, rv $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<rk> a(Collection<sf> $$0) {
      Map<String, List<sf>> $$1 = $$0.stream().collect(Collectors.groupingBy(sf::e, LinkedHashMap::new, Collectors.toList()));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<ane> $$2 = rr.c($$1x);
         Consumer<ane> $$3 = rr.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<sf> $$5 = (Collection<sf>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new rk($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(ane $$0, hx $$1, rv $$2, int $$3) {
      $$2.a();
      hx $$4 = $$1.b(-$$3, 0, -$$3);
      hx $$5 = $$1.b($$3, 0, $$3);
      hx.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cxa.pa)).forEach($$1x -> {
         dir $$2x = (dir)$$0.c_($$1x);
         dzg $$3x = sc.b($$2x);
         sc.a($$3x, $$0);
      });
   }

   public static void a(ane $$0) {
      adj.a($$0);
   }
}
