import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class qb {
   private static final int e = 100;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(py $$0, gw $$1, qe $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new qk($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<py> a(Collection<pt> $$0, gw $$1, czh $$2, akr $$3, qe $$4, int $$5) {
      pu $$6 = new pu($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<py> b(Collection<qp> $$0, gw $$1, czh $$2, akr $$3, qe $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<pt> a(Collection<qp> $$0) {
      Map<String, List<qp>> $$1 = $$0.stream().collect(Collectors.groupingBy(qp::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<akr> $$2 = qa.c($$1x);
         Consumer<akr> $$3 = qa.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<qp> $$5 = (Collection<qp>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 100)).map($$4x -> new pt($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(akr $$0, gw $$1, qe $$2, int $$3) {
      $$2.a();
      gw $$4 = $$1.b(-$$3, 0, -$$3);
      gw $$5 = $$1.b($$3, 0, $$3);
      gw.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(csw.pa)).forEach($$1x -> {
         dei $$2x = (dei)$$0.c_($$1x);
         gw $$3x = $$2x.p();
         dva $$4x = ql.b($$2x);
         ql.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(akr $$0) {
      abc.a($$0);
   }
}
