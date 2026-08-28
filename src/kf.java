import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kf {
   private static final Set<ald<? extends kb<?>>> a = akz.c.stream().map(akz.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vd> $$0, kc $$1, Set<auc> $$2, BiConsumer<ald<? extends kb<?>>, List<kf.a>> $$3) {
      akz.c.forEach($$4 -> a($$0, (akz.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vd> $$0, akz.d<T> $$1, kc $$2, Set<auc> $$3, BiConsumer<ald<? extends kb<?>>, List<kf.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<kf.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(ka::a).filter($$3::contains).isPresent();
                        Optional<vd> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vd $$8 = (vd)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new kf.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<kc.d<?>> a(kc $$0) {
      return $$0.d().filter($$0x -> a($$0x.a()));
   }

   public static Stream<kc.d<?>> a(jv<aln> $$0) {
      return a($$0.c(aln.b));
   }

   public static Stream<kc.d<?>> b(jv<aln> $$0) {
      Stream<kc.d<?>> $$1 = $$0.a(aln.a).d();
      Stream<kc.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(ald<? extends kb<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(ale b, Optional<vd> c) {
      public static final zc<ByteBuf, kf.a> a = zc.a(ale.b, kf.a::a, za.n.a(za::a), kf.a::b, kf.a::new);

      public ale a() {
         return this.b;
      }

      public Optional<vd> b() {
         return this.c;
      }
   }
}
