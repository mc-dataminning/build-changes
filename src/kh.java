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
   private static final Set<aly<? extends kd<?>>> a = alu.c.stream().map(alu.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vu> $$0, ke $$1, Set<avc> $$2, BiConsumer<aly<? extends kd<?>>, List<kh.a>> $$3) {
      alu.c.forEach($$4 -> a($$0, (alu.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vu> $$0, alu.d<T> $$1, ke $$2, Set<avc> $$3, BiConsumer<aly<? extends kd<?>>, List<kh.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<kh.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(kc::a).filter($$3::contains).isPresent();
                        Optional<vu> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vu $$8 = (vu)$$1.b()
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

   public static Stream<ke.d<?>> a(jx<ami> $$0) {
      return a($$0.c(ami.b));
   }

   public static Stream<ke.d<?>> b(jx<ami> $$0) {
      Stream<ke.d<?>> $$1 = $$0.a(ami.a).a();
      Stream<ke.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(aly<? extends kd<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(alz b, Optional<vu> c) {
      public static final zt<ByteBuf, kh.a> a = zt.a(alz.b, kh.a::a, zr.p.a(zr::a), kh.a::b, kh.a::new);

      public alz a() {
         return this.b;
      }

      public Optional<vu> b() {
         return this.c;
      }
   }
}
