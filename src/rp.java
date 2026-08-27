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

public class rp {
   private static final int d = 50;
   public static final int a = 5;
   public static final int b = 6;
   public static final int c = 8;

   public static void a(rm $$0, hx $$1, rs $$2) {
      $$2.a($$0);
      $$0.a(new ry($$0, $$2, $$1));
      $$0.b($$1);
   }

   public static Collection<rm> a(Collection<rh> $$0, hx $$1, dcv $$2, amz $$3, rs $$4, int $$5) {
      ri $$6 = new ri($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<rm> b(Collection<sc> $$0, hx $$1, dcv $$2, amz $$3, rs $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<rh> a(Collection<sc> $$0) {
      Map<String, List<sc>> $$1 = $$0.stream().collect(Collectors.groupingBy(sc::e, LinkedHashMap::new, Collectors.toList()));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<amz> $$2 = ro.c($$1x);
         Consumer<amz> $$3 = ro.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<sc> $$5 = (Collection<sc>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new rh($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(amz $$0, hx $$1, rs $$2, int $$3) {
      $$2.a();
      hx $$4 = $$1.b(-$$3, 0, -$$3);
      hx $$5 = $$1.b($$3, 0, $$3);
      hx.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cwl.pa)).forEach($$1x -> {
         dic $$2x = (dic)$$0.c_($$1x);
         dyr $$3x = rz.b($$2x);
         rz.a($$3x, $$0);
      });
   }

   public static void a(amz $$0) {
      adf.a($$0);
   }
}
