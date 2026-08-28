import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ki {
   private static final Set<akt<? extends ke<?>>> a = akp.c.stream().map(akp.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<un> $$0, kf $$1, Set<atw> $$2, BiConsumer<akt<? extends ke<?>>, List<ki.a>> $$3) {
      akp.c.forEach($$4 -> a($$0, (akp.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<un> $$0, akp.d<T> $$1, kf $$2, Set<atw> $$3, BiConsumer<akt<? extends ke<?>>, List<ki.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<ki.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(kd::a).filter($$3::contains).isPresent();
                        Optional<un> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           un $$8 = (un)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new ki.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<kf.d<?>> a(kf $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<kf.d<?>> a(jy<ald> $$0) {
      return a($$0.c(ald.b));
   }

   public static Stream<kf.d<?>> b(jy<ald> $$0) {
      Stream<kf.d<?>> $$1 = $$0.a(ald.a).a();
      Stream<kf.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(akt<? extends ke<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(aku b, Optional<un> c) {
      public static final ym<ByteBuf, ki.a> a = ym.a(aku.b, ki.a::a, yk.p.a(yk::a), ki.a::b, ki.a::new);

      public aku a() {
         return this.b;
      }

      public Optional<un> b() {
         return this.c;
      }
   }
}
