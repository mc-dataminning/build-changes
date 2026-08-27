import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jo {
   public static final Set<akm<? extends jk<?>>> a = aki.c.stream().map(aki.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<va> $$0, jl $$1, Set<ate> $$2, BiConsumer<akm<? extends jk<?>>, List<jo.a>> $$3) {
      aki.c.forEach($$4 -> a($$0, (aki.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<va> $$0, aki.c<T> $$1, jl $$2, Set<ate> $$3, BiConsumer<akm<? extends jk<?>>, List<jo.a>> $$4) {
      $$2.c($$1.a())
         .ifPresent(
            $$4x -> {
               List<jo.a> $$5 = new ArrayList<>($$4x.b());
               $$4x.h()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.c($$5x.h()).flatMap(jj::a).filter($$3::contains).isPresent();
                        Optional<va> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           va $$8 = (va)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new jo.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.c(), $$5);
            }
         );
   }

   private static Stream<jl.d<?>> a(jl $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<jl.d<?>> a(je<akw> $$0) {
      return a($$0.c(akw.b));
   }

   public static Stream<jl.d<?>> b(je<akw> $$0) {
      Stream<jl.d<?>> $$1 = $$0.a(akw.a).c();
      Stream<jl.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(akn b, Optional<va> c) {
      public static final yv<ByteBuf, jo.a> a = yv.a(akn.b, jo.a::a, yt.l.a(yt::a), jo.a::b, jo.a::new);

      public akn a() {
         return this.b;
      }

      public Optional<va> b() {
         return this.c;
      }
   }
}
