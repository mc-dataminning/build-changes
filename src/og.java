import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public abstract class og<T> implements ki {
   private static final Logger d = LogUtils.getLogger();
   protected final kk.a e;
   private final CompletableFuture<ih.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<og.c<T>> i;
   protected final ags<? extends ir<T>> f;
   private final Map<agt, asd> j = Maps.newLinkedHashMap();

   protected og(kk $$0, ags<? extends ir<T>> $$1, CompletableFuture<ih.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(og.c.empty()));
   }

   protected og(kk $$0, ags<? extends ir<T>> $$1, CompletableFuture<ih.b> $$2, CompletableFuture<og.c<T>> $$3) {
      this.e = $$0.a(kk.b.a, asi.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(ih.b var1);

   @Override
   public CompletableFuture<?> a(kg $$0) {
      record a<T>(ih.b a, og.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (og.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               ih.c<T> $$2 = $$1.a.b(this.f);
               Predicate<agt> $$3 = $$1x -> $$2.a(ags.a(this.f, $$1x)).isPresent();
               Predicate<agt> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(asg.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           agt $$4x = (agt)$$3x.getKey();
                           asd $$5 = (asd)$$3x.getValue();
                           List<ase> $$6 = $$5.b();
                           List<ase> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
                           if (!$$7.isEmpty()) {
                              throw new IllegalArgumentException(
                                 String.format(
                                    Locale.ROOT,
                                    "Couldn't define tag %s as it is missing following references: %s",
                                    $$4x,
                                    $$7.stream().map(Objects::toString).collect(Collectors.joining(","))
                                 )
                              );
                           } else {
                              JsonElement $$8 = (JsonElement)asf.a.encodeStart(JsonOps.INSTANCE, new asf($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return ki.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected og.b<T> b(asg<T> $$0) {
      asd $$1 = this.c($$0);
      return new og.b<>($$1);
   }

   protected asd c(asg<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> asd.a());
   }

   public CompletableFuture<og.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<ih.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (ih.b)$$0;
      });
   }

   protected static class b<T> {
      private final asd a;

      protected b(asd $$0) {
         this.a = $$0;
      }

      public final og.b<T> a(ags<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final og.b<T> a(ags<T>... $$0) {
         for (ags<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public og.b<T> a(agt $$0) {
         this.a.b($$0);
         return this;
      }

      public og.b<T> b(asg<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public og.b<T> b(agt $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<asg<T>, Optional<asd>> {
      static <T> og.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(asg<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
