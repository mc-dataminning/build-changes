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

public abstract class my<T> implements ji {
   private static final Logger d = LogUtils.getLogger();
   protected final jk.a e;
   private final CompletableFuture<hg.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<my.c<T>> i;
   protected final aeq<? extends hr<T>> f;
   private final Map<aer, apx> j = Maps.newLinkedHashMap();

   protected my(jk $$0, aeq<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(my.c.empty()));
   }

   protected my(jk $$0, aeq<? extends hr<T>> $$1, CompletableFuture<hg.b> $$2, CompletableFuture<my.c<T>> $$3) {
      this.e = $$0.a(jk.b.a, aqc.a($$1));
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
      record a<T>(hg.b a, my.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (my.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               hg.c<T> $$2 = $$1.a.b(this.f);
               Predicate<aer> $$3 = $$1x -> $$2.a(aeq.a(this.f, $$1x)).isPresent();
               Predicate<aer> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(aqa.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           aer $$4x = (aer)$$3x.getKey();
                           apx $$5 = (apx)$$3x.getValue();
                           List<apy> $$6 = $$5.b();
                           List<apy> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)apz.a.encodeStart(JsonOps.INSTANCE, new apz($$6, false)).getOrThrow(false, d::error);
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

   protected my.b<T> b(aqa<T> $$0) {
      apx $$1 = this.c($$0);
      return new my.b<>($$1);
   }

   protected apx c(aqa<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> apx.a());
   }

   public CompletableFuture<my.c<T>> c() {
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
      private final apx a;

      protected b(apx $$0) {
         this.a = $$0;
      }

      public final my.b<T> a(aeq<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final my.b<T> a(aeq<T>... $$0) {
         for (aeq<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public my.b<T> a(aer $$0) {
         this.a.b($$0);
         return this;
      }

      public my.b<T> b(aqa<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public my.b<T> b(aer $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<aqa<T>, Optional<apx>> {
      static <T> my.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(aqa<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
