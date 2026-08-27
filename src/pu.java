import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class pu {
   private static final int e = 100;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(pr $$0, gu $$1, px $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new qd($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<pr> a(Collection<pm> $$0, gu $$1, cyx $$2, akk $$3, px $$4, int $$5) {
      pn $$6 = new pn($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<pr> b(Collection<qi> $$0, gu $$1, cyx $$2, akk $$3, px $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<pm> a(Collection<qi> $$0) {
      Map<String, List<qi>> $$1 = $$0.stream().collect(Collectors.groupingBy(qi::e));
      return $$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<akk> $$2 = pt.c($$1x);
         Consumer<akk> $$3 = pt.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<qi> $$5 = (Collection<qi>)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 100)).map($$4x -> new pm($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(akk $$0, gu $$1, px $$2, int $$3) {
      $$2.a();
      gu $$4 = $$1.b(-$$3, 0, -$$3);
      gu $$5 = $$1.b($$3, 0, $$3);
      gu.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(csm.pa)).forEach($$1x -> {
         ddy $$2x = (ddy)$$0.c_($$1x);
         gu $$3x = $$2x.p();
         duq $$4x = qe.b($$2x);
         qe.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(akk $$0) {
      aav.a($$0);
   }
}
