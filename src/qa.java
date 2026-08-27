import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class qa {
   private static final int e = 100;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(px $$0, gw $$1, qd $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new qj($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<px> a(Collection<ps> $$0, gw $$1, czh $$2, akr $$3, qd $$4, int $$5) {
      pt $$6 = new pt($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<px> b(Collection<qo> $$0, gw $$1, czh $$2, akr $$3, qd $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<ps> a(Collection<qo> $$0) {
      Map<String, List<qo>> $$1 = $$0.stream().collect(Collectors.groupingBy(qo::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<akr> $$2 = pz.c($$1x);
         Consumer<akr> $$3 = pz.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<qo> $$5 = (Collection<qo>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 100)).map($$4x -> new ps($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(akr $$0, gw $$1, qd $$2, int $$3) {
      $$2.a();
      gw $$4 = $$1.b(-$$3, 0, -$$3);
      gw $$5 = $$1.b($$3, 0, $$3);
      gw.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(csw.pa)).forEach($$1x -> {
         dei $$2x = (dei)$$0.c_($$1x);
         gw $$3x = $$2x.p();
         dva $$4x = qk.b($$2x);
         qk.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(akr $$0) {
      abc.a($$0);
   }
}
