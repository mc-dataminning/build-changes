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

public class rn {
   private static final int d = 50;
   public static final int a = 5;
   public static final int b = 6;
   public static final int c = 8;

   public static void a(rk $$0, hv $$1, rq $$2) {
      $$2.a($$0);
      $$0.a(new rw($$0, $$2, $$1));
      $$0.b($$1);
   }

   public static Collection<rk> a(Collection<rf> $$0, hv $$1, dcl $$2, amp $$3, rq $$4, int $$5) {
      rg $$6 = new rg($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<rk> b(Collection<sa> $$0, hv $$1, dcl $$2, amp $$3, rq $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<rf> a(Collection<sa> $$0) {
      Map<String, List<sa>> $$1 = $$0.stream().collect(Collectors.groupingBy(sa::e, LinkedHashMap::new, Collectors.toList()));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<amp> $$2 = rm.c($$1x);
         Consumer<amp> $$3 = rm.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<sa> $$5 = (Collection<sa>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new rf($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(amp $$0, hv $$1, rq $$2, int $$3) {
      $$2.a();
      hv $$4 = $$1.b(-$$3, 0, -$$3);
      hv $$5 = $$1.b($$3, 0, $$3);
      hv.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cwb.pa)).forEach($$1x -> {
         dhr $$2x = (dhr)$$0.c_($$1x);
         dyg $$3x = rx.b($$2x);
         rx.a($$3x, $$0);
      });
   }

   public static void a(amp $$0) {
      acv.a($$0);
   }
}
