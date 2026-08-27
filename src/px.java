import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class px {
   private static final int e = 100;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(pu $$0, gw $$1, qa $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new qg($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<pu> a(Collection<pp> $$0, gw $$1, czc $$2, akn $$3, qa $$4, int $$5) {
      pq $$6 = new pq($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<pu> b(Collection<ql> $$0, gw $$1, czc $$2, akn $$3, qa $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<pp> a(Collection<ql> $$0) {
      Map<String, List<ql>> $$1 = $$0.stream().collect(Collectors.groupingBy(ql::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<akn> $$2 = pw.c($$1x);
         Consumer<akn> $$3 = pw.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<ql> $$5 = (Collection<ql>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 100)).map($$4x -> new pp($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(akn $$0, gw $$1, qa $$2, int $$3) {
      $$2.a();
      gw $$4 = $$1.b(-$$3, 0, -$$3);
      gw $$5 = $$1.b($$3, 0, $$3);
      gw.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(csr.pa)).forEach($$1x -> {
         ded $$2x = (ded)$$0.c_($$1x);
         gw $$3x = $$2x.p();
         duv $$4x = qh.b($$2x);
         qh.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(akn $$0) {
      aay.a($$0);
   }
}
