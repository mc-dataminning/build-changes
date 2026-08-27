import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class je {
   public static final Set<aju<? extends ja<?>>> a = ajq.c.stream().map(ajq.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<ul> $$0, jb $$1, Set<asl> $$2, BiConsumer<aju<? extends ja<?>>, List<je.a>> $$3) {
      ajq.c.forEach($$4 -> a($$0, (ajq.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<ul> $$0, ajq.c<T> $$1, jb $$2, Set<asl> $$3, BiConsumer<aju<? extends ja<?>>, List<je.a>> $$4) {
      $$2.c($$1.a()).ifPresent($$4x -> {
         List<je.a> $$5 = new ArrayList<>($$4x.b());
         $$4x.h().forEach($$5x -> {
            boolean $$6 = $$4x.c($$5x.h()).flatMap(iz::a).filter($$3::contains).isPresent();
            Optional<ul> $$7;
            if ($$6) {
               $$7 = Optional.empty();
            } else {
               ul $$8 = ac.a($$1.b().encodeStart($$0, $$5x.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
               $$7 = Optional.of($$8);
            }

            $$5.add(new je.a($$5x.h().a(), $$7));
         });
         $$4.accept($$4x.c(), $$5);
      });
   }

   private static Stream<jb.d<?>> a(jb $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<jb.d<?>> a(iu<ake> $$0) {
      return a($$0.c(ake.b));
   }

   public static Stream<jb.d<?>> b(iu<ake> $$0) {
      Stream<jb.d<?>> $$1 = $$0.a(ake.a).c();
      Stream<jb.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(ajv b, Optional<ul> c) {
      public static final yg<ByteBuf, je.a> a = yg.a(ajv.b, je.a::a, ye.l.a(ye::a), je.a::b, je.a::new);

      public ajv a() {
         return this.b;
      }

      public Optional<ul> b() {
         return this.c;
      }
   }
}
