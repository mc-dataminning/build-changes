import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jn {
   public static final Set<akg<? extends jj<?>>> a = akc.c.stream().map(akc.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<ux> $$0, jk $$1, Set<asy> $$2, BiConsumer<akg<? extends jj<?>>, List<jn.a>> $$3) {
      akc.c.forEach($$4 -> a($$0, (akc.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<ux> $$0, akc.c<T> $$1, jk $$2, Set<asy> $$3, BiConsumer<akg<? extends jj<?>>, List<jn.a>> $$4) {
      $$2.c($$1.a()).ifPresent($$4x -> {
         List<jn.a> $$5 = new ArrayList<>($$4x.b());
         $$4x.h().forEach($$5x -> {
            boolean $$6 = $$4x.c($$5x.h()).flatMap(ji::a).filter($$3::contains).isPresent();
            Optional<ux> $$7;
            if ($$6) {
               $$7 = Optional.empty();
            } else {
               ux $$8 = ac.a($$1.b().encodeStart($$0, $$5x.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
               $$7 = Optional.of($$8);
            }

            $$5.add(new jn.a($$5x.h().a(), $$7));
         });
         $$4.accept($$4x.c(), $$5);
      });
   }

   private static Stream<jk.d<?>> a(jk $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<jk.d<?>> a(jd<akq> $$0) {
      return a($$0.c(akq.b));
   }

   public static Stream<jk.d<?>> b(jd<akq> $$0) {
      Stream<jk.d<?>> $$1 = $$0.a(akq.a).c();
      Stream<jk.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(akh b, Optional<ux> c) {
      public static final ys<ByteBuf, jn.a> a = ys.a(akh.b, jn.a::a, yq.l.a(yq::a), jn.a::b, jn.a::new);

      public akh a() {
         return this.b;
      }

      public Optional<ux> b() {
         return this.c;
      }
   }
}
