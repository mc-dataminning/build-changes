import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class pz {
   private static final int e = 100;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(pw $$0, gw $$1, qc $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new qi($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<pw> a(Collection<pr> $$0, gw $$1, czn $$2, akt $$3, qc $$4, int $$5) {
      ps $$6 = new ps($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<pw> b(Collection<qn> $$0, gw $$1, czn $$2, akt $$3, qc $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<pr> a(Collection<qn> $$0) {
      Map<String, List<qn>> $$1 = $$0.stream().collect(Collectors.groupingBy(qn::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<akt> $$2 = py.c($$1x);
         Consumer<akt> $$3 = py.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<qn> $$5 = (Collection<qn>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 100)).map($$4x -> new pr($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(akt $$0, gw $$1, qc $$2, int $$3) {
      $$2.a();
      gw $$4 = $$1.b(-$$3, 0, -$$3);
      gw $$5 = $$1.b($$3, 0, $$3);
      gw.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cte.pa)).forEach($$1x -> {
         dem $$2x = (dem)$$0.c_($$1x);
         gw $$3x = $$2x.p();
         duu $$4x = qj.b($$2x);
         qj.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(akt $$0) {
      abc.a($$0);
   }
}
