import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class pv {
   private static final int e = 100;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(ps $$0, gv $$1, py $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new qe($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<ps> a(Collection<pn> $$0, gv $$1, cyw $$2, aki $$3, py $$4, int $$5) {
      po $$6 = new po($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<ps> b(Collection<qj> $$0, gv $$1, cyw $$2, aki $$3, py $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<pn> a(Collection<qj> $$0) {
      Map<String, List<qj>> $$1 = $$0.stream().collect(Collectors.groupingBy(qj::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<aki> $$2 = pu.c($$1x);
         Consumer<aki> $$3 = pu.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<qj> $$5 = (Collection<qj>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 100)).map($$4x -> new pn($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(aki $$0, gv $$1, py $$2, int $$3) {
      $$2.a();
      gv $$4 = $$1.b(-$$3, 0, -$$3);
      gv $$5 = $$1.b($$3, 0, $$3);
      gv.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(csl.pa)).forEach($$1x -> {
         ddx $$2x = (ddx)$$0.c_($$1x);
         gv $$3x = $$2x.p();
         dup $$4x = qf.b($$2x);
         qf.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(aki $$0) {
      aau.a($$0);
   }
}
