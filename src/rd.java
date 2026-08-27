import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class rd {
   private static final int d = 50;
   public static final int a = 5;
   public static final int b = 6;
   public static final int c = 8;

   public static void a(ra $$0, ht $$1, rg $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new rm($$0, $$2, $$1));
      $$0.b($$1);
   }

   public static Collection<ra> a(Collection<qv> $$0, ht $$1, dbm $$2, ame $$3, rg $$4, int $$5) {
      qw $$6 = new qw($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<ra> b(Collection<rq> $$0, ht $$1, dbm $$2, ame $$3, rg $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<qv> a(Collection<rq> $$0) {
      Map<String, List<rq>> $$1 = $$0.stream().collect(Collectors.groupingBy(rq::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<ame> $$2 = rc.c($$1x);
         Consumer<ame> $$3 = rc.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<rq> $$5 = (Collection<rq>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new qv($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(ame $$0, ht $$1, rg $$2, int $$3) {
      $$2.a();
      ht $$4 = $$1.b(-$$3, 0, -$$3);
      ht $$5 = $$1.b($$3, 0, $$3);
      ht.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cvc.pa)).forEach($$1x -> {
         dgr $$2x = (dgr)$$0.c_($$1x);
         dwz $$3x = rn.b($$2x);
         rn.a($$3x, $$0);
      });
   }

   public static void a(ame $$0) {
      ack.a($$0);
   }
}
