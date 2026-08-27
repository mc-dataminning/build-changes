import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class iz {
   private static final Set<aix<? extends iv<?>>> a = ait.c.stream().map(ait.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<tt> $$0, iw $$1, BiConsumer<aix<? extends iv<?>>, List<iz.a>> $$2) {
      ait.c.forEach($$3 -> a($$0, (ait.c<?>)$$3, $$1, $$2));
   }

   private static <T> void a(DynamicOps<tt> $$0, ait.c<T> $$1, iw $$2, BiConsumer<aix<? extends iv<?>>, List<iz.a>> $$3) {
      $$2.c($$1.a()).ifPresent($$3x -> {
         List<iz.a> $$4 = new ArrayList<>($$3x.b());
         $$3x.h().forEach($$3xx -> {
            tt $$4x = ac.a($$1.b().encodeStart($$0, $$3xx.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$3xx.h() + ": " + $$1xxx));
            $$4.add(new iz.a($$3xx.h().a(), $$4x));
         });
         $$3.accept($$3x.c(), $$4);
      });
   }

   private static Stream<iw.d<?>> a(iw $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<iw.d<?>> a(iq<ajh> $$0) {
      return a($$0.c(ajh.b));
   }

   public static Stream<iw.d<?>> b(iq<ajh> $$0) {
      Stream<iw.d<?>> $$1 = $$0.a(ajh.a).c();
      Stream<iw.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(aiy b, tt c) {
      public static final xo<ByteBuf, iz.a> a = xo.a(aiy.b, iz.a::a, xm.i, iz.a::b, iz.a::new);

      public aiy a() {
         return this.b;
      }

      public tt b() {
         return this.c;
      }
   }
}
