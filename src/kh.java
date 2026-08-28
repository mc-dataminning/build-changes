import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kh {
   private static final Set<ali<? extends kd<?>>> a = ale.c.stream().map(ale.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vi> $$0, ke $$1, Set<auj> $$2, BiConsumer<ali<? extends kd<?>>, List<kh.a>> $$3) {
      ale.c.forEach($$4 -> a($$0, (ale.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vi> $$0, ale.d<T> $$1, ke $$2, Set<auj> $$3, BiConsumer<ali<? extends kd<?>>, List<kh.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<kh.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(kc::a).filter($$3::contains).isPresent();
                        Optional<vi> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vi $$8 = (vi)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new kh.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<ke.d<?>> a(ke $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<ke.d<?>> a(jx<als> $$0) {
      return a($$0.c(als.b));
   }

   public static Stream<ke.d<?>> b(jx<als> $$0) {
      Stream<ke.d<?>> $$1 = $$0.a(als.a).a();
      Stream<ke.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(ali<? extends kd<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(alj b, Optional<vi> c) {
      public static final zh<ByteBuf, kh.a> a = zh.a(alj.b, kh.a::a, zf.o.a(zf::a), kh.a::b, kh.a::new);

      public alj a() {
         return this.b;
      }

      public Optional<vi> b() {
         return this.c;
      }
   }
}
