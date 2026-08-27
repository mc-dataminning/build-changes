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

public abstract class mz<T> implements jj {
   private static final Logger d = LogUtils.getLogger();
   protected final jl.a e;
   private final CompletableFuture<hh.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<mz.c<T>> i;
   protected final aeo<? extends hs<T>> f;
   private final Map<aep, apv> j = Maps.newLinkedHashMap();

   protected mz(jl $$0, aeo<? extends hs<T>> $$1, CompletableFuture<hh.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(mz.c.empty()));
   }

   protected mz(jl $$0, aeo<? extends hs<T>> $$1, CompletableFuture<hh.b> $$2, CompletableFuture<mz.c<T>> $$3) {
      this.e = $$0.a(jl.b.a, aqa.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(hh.b var1);

   @Override
   public CompletableFuture<?> a(jh $$0) {
      record a<T>(hh.b a, mz.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (mz.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               hh.c<T> $$2 = $$1.a.b(this.f);
               Predicate<aep> $$3 = $$1x -> $$2.a(aeo.a(this.f, $$1x)).isPresent();
               Predicate<aep> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(apy.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           aep $$4x = (aep)$$3x.getKey();
                           apv $$5 = (apv)$$3x.getValue();
                           List<apw> $$6 = $$5.b();
                           List<apw> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)apx.a.encodeStart(JsonOps.INSTANCE, new apx($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return jj.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected mz.b<T> b(apy<T> $$0) {
      apv $$1 = this.c($$0);
      return new mz.b<>($$1);
   }

   protected apv c(apy<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> apv.a());
   }

   public CompletableFuture<mz.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<hh.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (hh.b)$$0;
      });
   }

   protected static class b<T> {
      private final apv a;

      protected b(apv $$0) {
         this.a = $$0;
      }

      public final mz.b<T> a(aeo<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final mz.b<T> a(aeo<T>... $$0) {
         for (aeo<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public mz.b<T> a(aep $$0) {
         this.a.b($$0);
         return this;
      }

      public mz.b<T> b(apy<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public mz.b<T> b(aep $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<apy<T>, Optional<apv>> {
      static <T> mz.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(apy<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
