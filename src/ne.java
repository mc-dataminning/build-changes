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

public abstract class ne<T> implements jk {
   private static final Logger d = LogUtils.getLogger();
   protected final jm.a e;
   private final CompletableFuture<hi.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<ne.c<T>> i;
   protected final aex<? extends ht<T>> f;
   private final Map<aey, aqg> j = Maps.newLinkedHashMap();

   protected ne(jm $$0, aex<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(ne.c.empty()));
   }

   protected ne(jm $$0, aex<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2, CompletableFuture<ne.c<T>> $$3) {
      this.e = $$0.a(jm.b.a, aql.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(hi.b var1);

   @Override
   public CompletableFuture<?> a(ji $$0) {
      record a<T>(hi.b a, ne.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (ne.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               hi.c<T> $$2 = $$1.a.b(this.f);
               Predicate<aey> $$3 = $$1x -> $$2.a(aex.a(this.f, $$1x)).isPresent();
               Predicate<aey> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(aqj.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           aey $$4x = (aey)$$3x.getKey();
                           aqg $$5 = (aqg)$$3x.getValue();
                           List<aqh> $$6 = $$5.b();
                           List<aqh> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)aqi.a.encodeStart(JsonOps.INSTANCE, new aqi($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return jk.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected ne.b<T> b(aqj<T> $$0) {
      aqg $$1 = this.c($$0);
      return new ne.b<>($$1);
   }

   protected aqg c(aqj<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> aqg.a());
   }

   public CompletableFuture<ne.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<hi.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (hi.b)$$0;
      });
   }

   protected static class b<T> {
      private final aqg a;

      protected b(aqg $$0) {
         this.a = $$0;
      }

      public final ne.b<T> a(aex<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final ne.b<T> a(aex<T>... $$0) {
         for (aex<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public ne.b<T> a(aey $$0) {
         this.a.b($$0);
         return this;
      }

      public ne.b<T> b(aqj<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public ne.b<T> b(aey $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<aqj<T>, Optional<aqg>> {
      static <T> ne.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(aqj<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
