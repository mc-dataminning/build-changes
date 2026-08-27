import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class rc {
   private static final int e = 50;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(qz $$0, ht $$1, rf $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new rl($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<qz> a(Collection<qu> $$0, ht $$1, dbf $$2, ama $$3, rf $$4, int $$5) {
      qv $$6 = new qv($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<qz> b(Collection<rq> $$0, ht $$1, dbf $$2, ama $$3, rf $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<qu> a(Collection<rq> $$0) {
      Map<String, List<rq>> $$1 = $$0.stream().collect(Collectors.groupingBy(rq::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<ama> $$2 = rb.c($$1x);
         Consumer<ama> $$3 = rb.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<rq> $$5 = (Collection<rq>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new qu($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(ama $$0, ht $$1, rf $$2, int $$3) {
      $$2.a();
      ht $$4 = $$1.b(-$$3, 0, -$$3);
      ht $$5 = $$1.b($$3, 0, $$3);
      ht.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cuv.pa)).forEach($$1x -> {
         dgf $$2x = (dgf)$$0.c_($$1x);
         ht $$3x = $$2x.p();
         dwn $$4x = rm.b($$2x);
         rm.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(ama $$0) {
      aci.a($$0);
   }
}
