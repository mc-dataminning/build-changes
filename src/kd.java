import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kd {
   public static final Set<akq<? extends jz<?>>> a = akm.c.stream().map(akm.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<uy> $$0, ka $$1, Set<atl> $$2, BiConsumer<akq<? extends jz<?>>, List<kd.a>> $$3) {
      akm.c.forEach($$4 -> a($$0, (akm.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<uy> $$0, akm.c<T> $$1, ka $$2, Set<atl> $$3, BiConsumer<akq<? extends jz<?>>, List<kd.a>> $$4) {
      $$2.c($$1.a())
         .ifPresent(
            $$4x -> {
               List<kd.a> $$5 = new ArrayList<>($$4x.c());
               $$4x.i()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.c($$5x.h()).flatMap(jy::a).filter($$3::contains).isPresent();
                        Optional<uy> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           uy $$8 = (uy)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new kd.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.d(), $$5);
            }
         );
   }

   private static Stream<ka.d<?>> a(ka $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<ka.d<?>> a(jt<ala> $$0) {
      return a($$0.c(ala.b));
   }

   public static Stream<ka.d<?>> b(jt<ala> $$0) {
      Stream<ka.d<?>> $$1 = $$0.a(ala.a).c();
      Stream<ka.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(akr b, Optional<uy> c) {
      public static final yx<ByteBuf, kd.a> a = yx.a(akr.b, kd.a::a, yv.m.a(yv::a), kd.a::b, kd.a::new);

      public akr a() {
         return this.b;
      }

      public Optional<uy> b() {
         return this.c;
      }
   }
}
