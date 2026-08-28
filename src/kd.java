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
   public static final Set<akp<? extends jz<?>>> a = akl.c.stream().map(akl.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<ux> $$0, ka $$1, Set<atk> $$2, BiConsumer<akp<? extends jz<?>>, List<kd.a>> $$3) {
      akl.c.forEach($$4 -> a($$0, (akl.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<ux> $$0, akl.c<T> $$1, ka $$2, Set<atk> $$3, BiConsumer<akp<? extends jz<?>>, List<kd.a>> $$4) {
      $$2.c($$1.a())
         .ifPresent(
            $$4x -> {
               List<kd.a> $$5 = new ArrayList<>($$4x.c());
               $$4x.i()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.c($$5x.h()).flatMap(jy::a).filter($$3::contains).isPresent();
                        Optional<ux> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           ux $$8 = (ux)$$1.b()
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

   public static Stream<ka.d<?>> a(jt<akz> $$0) {
      return a($$0.c(akz.b));
   }

   public static Stream<ka.d<?>> b(jt<akz> $$0) {
      Stream<ka.d<?>> $$1 = $$0.a(akz.a).c();
      Stream<ka.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(akq b, Optional<ux> c) {
      public static final yw<ByteBuf, kd.a> a = yw.a(akq.b, kd.a::a, yu.m.a(yu::a), kd.a::b, kd.a::new);

      public akq a() {
         return this.b;
      }

      public Optional<ux> b() {
         return this.c;
      }
   }
}
