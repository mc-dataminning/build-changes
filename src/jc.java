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
   public static final Set<ajs<? extends iy<?>>> a = ajo.c.stream().map(ajo.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<uj> $$0, iz $$1, Set<asj> $$2, BiConsumer<ajs<? extends iy<?>>, List<jc.a>> $$3) {
      ajo.c.forEach($$4 -> a($$0, (ajo.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<uj> $$0, ajo.c<T> $$1, iz $$2, Set<asj> $$3, BiConsumer<ajs<? extends iy<?>>, List<jc.a>> $$4) {
      $$2.c($$1.a()).ifPresent($$4x -> {
         List<jc.a> $$5 = new ArrayList<>($$4x.b());
         $$4x.h().forEach($$5x -> {
            boolean $$6 = $$4x.c($$5x.h()).flatMap(ix::a).filter($$3::contains).isPresent();
            Optional<uj> $$7;
            if ($$6) {
               $$7 = Optional.empty();
            } else {
               uj $$8 = ac.a($$1.b().encodeStart($$0, $$5x.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
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

   public static Stream<iz.d<?>> a(is<akc> $$0) {
      return a($$0.c(akc.b));
   }

   public static Stream<iz.d<?>> b(is<akc> $$0) {
      Stream<iz.d<?>> $$1 = $$0.a(akc.a).c();
      Stream<iz.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(ajt b, Optional<uj> c) {
      public static final ye<ByteBuf, jc.a> a = ye.a(ajt.b, jc.a::a, yc.l.a(yc::a), jc.a::b, jc.a::new);

      public ajt a() {
         return this.b;
      }

      public Optional<uj> b() {
         return this.c;
      }
   }
}
