import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kj {
   private static final Set<alc<? extends kf<?>>> a = aky.c.stream().map(aky.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<ut> $$0, kg $$1, Set<aug> $$2, BiConsumer<alc<? extends kf<?>>, List<kj.a>> $$3) {
      aky.c.forEach($$4 -> a($$0, (aky.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<ut> $$0, aky.d<T> $$1, kg $$2, Set<aug> $$3, BiConsumer<alc<? extends kf<?>>, List<kj.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<kj.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(ke::a).filter($$3::contains).isPresent();
                        Optional<ut> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           ut $$8 = (ut)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new kj.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<kg.d<?>> a(kg $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<kg.d<?>> a(jz<alm> $$0) {
      return a($$0.c(alm.b));
   }

   public static Stream<kg.d<?>> b(jz<alm> $$0) {
      Stream<kg.d<?>> $$1 = $$0.a(alm.a).a();
      Stream<kg.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(alc<? extends kf<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(ald b, Optional<ut> c) {
      public static final yt<ByteBuf, kj.a> a = yt.a(ald.b, kj.a::a, yr.p.a(yr::a), kj.a::b, kj.a::new);

      public ald a() {
         return this.b;
      }

      public Optional<ut> b() {
         return this.c;
      }
   }
}
