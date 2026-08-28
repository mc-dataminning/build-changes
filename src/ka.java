import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ka {
   public static final Set<akj<? extends jw<?>>> a = akf.c.stream().map(akf.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<uu> $$0, jx $$1, Set<atb> $$2, BiConsumer<akj<? extends jw<?>>, List<ka.a>> $$3) {
      akf.c.forEach($$4 -> a($$0, (akf.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<uu> $$0, akf.c<T> $$1, jx $$2, Set<atb> $$3, BiConsumer<akj<? extends jw<?>>, List<ka.a>> $$4) {
      $$2.c($$1.a())
         .ifPresent(
            $$4x -> {
               List<ka.a> $$5 = new ArrayList<>($$4x.c());
               $$4x.i()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.c($$5x.h()).flatMap(jv::a).filter($$3::contains).isPresent();
                        Optional<uu> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           uu $$8 = (uu)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new ka.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.d(), $$5);
            }
         );
   }

   private static Stream<jx.d<?>> a(jx $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<jx.d<?>> a(jq<akt> $$0) {
      return a($$0.c(akt.b));
   }

   public static Stream<jx.d<?>> b(jq<akt> $$0) {
      Stream<jx.d<?>> $$1 = $$0.a(akt.a).c();
      Stream<jx.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(akk b, Optional<uu> c) {
      public static final ys<ByteBuf, ka.a> a = ys.a(akk.b, ka.a::a, yq.m.a(yq::a), ka.a::b, ka.a::new);

      public akk a() {
         return this.b;
      }

      public Optional<uu> b() {
         return this.c;
      }
   }
}
