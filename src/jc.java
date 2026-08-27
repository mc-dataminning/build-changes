import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jc {
   public static final Set<ajg<? extends iy<?>>> a = ajc.c.stream().map(ajc.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<tx> $$0, iz $$1, Set<arv> $$2, BiConsumer<ajg<? extends iy<?>>, List<jc.a>> $$3) {
      ajc.c.forEach($$4 -> a($$0, (ajc.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<tx> $$0, ajc.c<T> $$1, iz $$2, Set<arv> $$3, BiConsumer<ajg<? extends iy<?>>, List<jc.a>> $$4) {
      $$2.c($$1.a()).ifPresent($$4x -> {
         List<jc.a> $$5 = new ArrayList<>($$4x.b());
         $$4x.h().forEach($$5x -> {
            boolean $$6 = $$4x.c($$5x.h()).flatMap(ix::a).filter($$3::contains).isPresent();
            Optional<tx> $$7;
            if ($$6) {
               $$7 = Optional.empty();
            } else {
               tx $$8 = ac.a($$1.b().encodeStart($$0, $$5x.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
               $$7 = Optional.of($$8);
            }

            $$5.add(new jc.a($$5x.h().a(), $$7));
         });
         $$4.accept($$4x.c(), $$5);
      });
   }

   private static Stream<iz.d<?>> a(iz $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<iz.d<?>> a(is<ajq> $$0) {
      return a($$0.c(ajq.b));
   }

   public static Stream<iz.d<?>> b(is<ajq> $$0) {
      Stream<iz.d<?>> $$1 = $$0.a(ajq.a).c();
      Stream<iz.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(ajh b, Optional<tx> c) {
      public static final xs<ByteBuf, jc.a> a = xs.a(ajh.b, jc.a::a, xq.j.a(xq::a), jc.a::b, jc.a::new);

      public ajh a() {
         return this.b;
      }

      public Optional<tx> b() {
         return this.c;
      }
   }
}
