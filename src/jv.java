import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jv {
   private static final Set<ald<? extends jr<?>>> a = akz.c.stream().map(akz.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<uu> $$0, js $$1, Set<auh> $$2, BiConsumer<ald<? extends jr<?>>, List<jv.a>> $$3) {
      akz.c.forEach($$4 -> a($$0, (akz.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<uu> $$0, akz.d<T> $$1, js $$2, Set<auh> $$3, BiConsumer<ald<? extends jr<?>>, List<jv.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<jv.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(jq::a).filter($$3::contains).isPresent();
                        Optional<uu> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           uu $$8 = (uu)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new jv.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<js.d<?>> a(js $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<js.d<?>> a(jl<aln> $$0) {
      return a($$0.c(aln.b));
   }

   public static Stream<js.d<?>> b(jl<aln> $$0) {
      Stream<js.d<?>> $$1 = $$0.a(aln.a).a();
      Stream<js.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(ald<? extends jr<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(ale b, Optional<uu> c) {
      public static final yu<ByteBuf, jv.a> a = yu.a(ale.b, jv.a::a, ys.p.a(ys::a), jv.a::b, jv.a::new);

      public ale a() {
         return this.b;
      }

      public Optional<uu> b() {
         return this.c;
      }
   }
}
