import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jb {
   private static final Set<ajb<? extends ix<?>>> a = aix.c.stream().map(aix.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<tv> $$0, iy $$1, BiConsumer<ajb<? extends ix<?>>, List<jb.a>> $$2) {
      aix.c.forEach($$3 -> a($$0, (aix.c<?>)$$3, $$1, $$2));
   }

   private static <T> void a(DynamicOps<tv> $$0, aix.c<T> $$1, iy $$2, BiConsumer<ajb<? extends ix<?>>, List<jb.a>> $$3) {
      $$2.c($$1.a()).ifPresent($$3x -> {
         List<jb.a> $$4 = new ArrayList<>($$3x.b());
         $$3x.h().forEach($$3xx -> {
            tv $$4x = ac.a($$1.b().encodeStart($$0, $$3xx.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$3xx.h() + ": " + $$1xxx));
            $$4.add(new jb.a($$3xx.h().a(), $$4x));
         });
         $$3.accept($$3x.c(), $$4);
      });
   }

   private static Stream<iy.d<?>> a(iy $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<iy.d<?>> a(is<ajl> $$0) {
      return a($$0.c(ajl.b));
   }

   public static Stream<iy.d<?>> b(is<ajl> $$0) {
      Stream<iy.d<?>> $$1 = $$0.a(ajl.a).c();
      Stream<iy.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(ajc b, tv c) {
      public static final xq<ByteBuf, jb.a> a = xq.a(ajc.b, jb.a::a, xo.j, jb.a::b, jb.a::new);

      public ajc a() {
         return this.b;
      }

      public tv b() {
         return this.c;
      }
   }
}
