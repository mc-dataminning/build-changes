import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class qw {
   private static final int e = 50;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(qt $$0, ht $$1, qz $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new rf($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<qt> a(Collection<qo> $$0, ht $$1, dal $$2, alq $$3, qz $$4, int $$5) {
      qp $$6 = new qp($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<qt> b(Collection<rk> $$0, ht $$1, dal $$2, alq $$3, qz $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<qo> a(Collection<rk> $$0) {
      Map<String, List<rk>> $$1 = $$0.stream().collect(Collectors.groupingBy(rk::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<alq> $$2 = qv.c($$1x);
         Consumer<alq> $$3 = qv.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<rk> $$5 = (Collection<rk>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 50)).map($$4x -> new qo($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(alq $$0, ht $$1, qz $$2, int $$3) {
      $$2.a();
      ht $$4 = $$1.b(-$$3, 0, -$$3);
      ht $$5 = $$1.b($$3, 0, $$3);
      ht.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cuc.pa)).forEach($$1x -> {
         dfk $$2x = (dfk)$$0.c_($$1x);
         ht $$3x = $$2x.p();
         dvs $$4x = rg.b($$2x);
         rg.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(alq $$0) {
      abz.a($$0);
   }
}
