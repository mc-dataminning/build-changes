import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kg {
   private static final Set<alg<? extends kc<?>>> a = alc.c.stream().map(alc.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vg> $$0, kd $$1, Set<aug> $$2, BiConsumer<alg<? extends kc<?>>, List<kg.a>> $$3) {
      alc.c.forEach($$4 -> a($$0, (alc.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vg> $$0, alc.d<T> $$1, kd $$2, Set<aug> $$3, BiConsumer<alg<? extends kc<?>>, List<kg.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<kg.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(kb::a).filter($$3::contains).isPresent();
                        Optional<vg> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vg $$8 = (vg)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new kg.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<kd.d<?>> a(kd $$0) {
      return $$0.d().filter($$0x -> a($$0x.a()));
   }

   public static Stream<kd.d<?>> a(jw<alq> $$0) {
      return a($$0.c(alq.b));
   }

   public static Stream<kd.d<?>> b(jw<alq> $$0) {
      Stream<kd.d<?>> $$1 = $$0.a(alq.a).d();
      Stream<kd.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(alg<? extends kc<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(alh b, Optional<vg> c) {
      public static final zf<ByteBuf, kg.a> a = zf.a(alh.b, kg.a::a, zd.n.a(zd::a), kg.a::b, kg.a::new);

      public alh a() {
         return this.b;
      }

      public Optional<vg> b() {
         return this.c;
      }
   }
}
