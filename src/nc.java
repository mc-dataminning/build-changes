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

public abstract class nc<T> implements ji {
   private static final Logger d = LogUtils.getLogger();
   protected final jk.a e;
   private final CompletableFuture<hg.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<nc.c<T>> i;
   protected final aev<? extends hq<T>> f;
   private final Map<aew, aqe> j = Maps.newLinkedHashMap();

   protected nc(jk $$0, aev<? extends hq<T>> $$1, CompletableFuture<hg.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(nc.c.empty()));
   }

   protected nc(jk $$0, aev<? extends hq<T>> $$1, CompletableFuture<hg.b> $$2, CompletableFuture<nc.c<T>> $$3) {
      this.e = $$0.a(jk.b.a, aqj.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(hg.b var1);

   @Override
   public CompletableFuture<?> a(jg $$0) {
      record a<T>(hg.b a, nc.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (nc.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               hg.c<T> $$2 = $$1.a.b(this.f);
               Predicate<aew> $$3 = $$1x -> $$2.a(aev.a(this.f, $$1x)).isPresent();
               Predicate<aew> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(aqh.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           aew $$4x = (aew)$$3x.getKey();
                           aqe $$5 = (aqe)$$3x.getValue();
                           List<aqf> $$6 = $$5.b();
                           List<aqf> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)aqg.a.encodeStart(JsonOps.INSTANCE, new aqg($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return ji.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected nc.b<T> b(aqh<T> $$0) {
      aqe $$1 = this.c($$0);
      return new nc.b<>($$1);
   }

   protected aqe c(aqh<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> aqe.a());
   }

   public CompletableFuture<nc.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<hg.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (hg.b)$$0;
      });
   }

   protected static class b<T> {
      private final aqe a;

      protected b(aqe $$0) {
         this.a = $$0;
      }

      public final nc.b<T> a(aev<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final nc.b<T> a(aev<T>... $$0) {
         for (aev<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public nc.b<T> a(aew $$0) {
         this.a.b($$0);
         return this;
      }

      public nc.b<T> b(aqh<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public nc.b<T> b(aew $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<aqh<T>, Optional<aqe>> {
      static <T> nc.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(aqh<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
