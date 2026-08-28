import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ke {
   private static final Set<ala<? extends ka<?>>> a = akw.c.stream().map(akw.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vc> $$0, kb $$1, Set<atz> $$2, BiConsumer<ala<? extends ka<?>>, List<ke.a>> $$3) {
      akw.c.forEach($$4 -> a($$0, (akw.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vc> $$0, akw.d<T> $$1, kb $$2, Set<atz> $$3, BiConsumer<ala<? extends ka<?>>, List<ke.a>> $$4) {
      $$2.c($$1.a())
         .ifPresent(
            $$4x -> {
               List<ke.a> $$5 = new ArrayList<>($$4x.c());
               $$4x.i()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.c($$5x.h()).flatMap(jz::a).filter($$3::contains).isPresent();
                        Optional<vc> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vc $$8 = (vc)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new ke.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.d(), $$5);
            }
         );
   }

   private static Stream<kb.d<?>> a(kb $$0) {
      return $$0.e().filter($$0x -> a($$0x.a()));
   }

   public static Stream<kb.d<?>> a(ju<alk> $$0) {
      return a($$0.c(alk.b));
   }

   public static Stream<kb.d<?>> b(ju<alk> $$0) {
      Stream<kb.d<?>> $$1 = $$0.a(alk.a).e();
      Stream<kb.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(ala<? extends ka<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(alb b, Optional<vc> c) {
      public static final zb<ByteBuf, ke.a> a = zb.a(alb.b, ke.a::a, yz.m.a(yz::a), ke.a::b, ke.a::new);

      public alb a() {
         return this.b;
      }

      public Optional<vc> b() {
         return this.c;
      }
   }
}
