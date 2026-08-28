import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
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

public abstract class pv<T> implements lx {
   private static final Logger d = LogUtils.getLogger();
   protected final lz.a e;
   private final CompletableFuture<jl.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<pv.c<T>> i;
   protected final akj<? extends jw<T>> f;
   private final Map<akk, awh> j = Maps.newLinkedHashMap();

   protected pv(lz $$0, akj<? extends jw<T>> $$1, CompletableFuture<jl.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pv.c.empty()));
   }

   protected pv(lz $$0, akj<? extends jw<T>> $$1, CompletableFuture<jl.a> $$2, CompletableFuture<pv.c<T>> $$3) {
      this.e = $$0.a(lz.b.a, awm.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jl.a var1);

   @Override
   public CompletableFuture<?> a(lv $$0) {
      record a<T>(jl.a a, pv.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (pv.c<T>)$$1), ac.g())
         .thenCompose(
            $$1 -> {
               jl.b<T> $$2 = $$1.a.b(this.f);
               Predicate<akk> $$3 = $$1x -> $$2.a(akj.a(this.f, $$1x)).isPresent();
               Predicate<akk> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(awk.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           akk $$5 = (akk)$$4x.getKey();
                           awh $$6 = (awh)$$4x.getValue();
                           List<awi> $$7 = $$6.b();
                           List<awi> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
                           if (!$$8.isEmpty()) {
                              throw new IllegalArgumentException(
                                 String.format(
                                    Locale.ROOT,
                                    "Couldn't define tag %s as it is missing following references: %s",
                                    $$5,
                                    $$8.stream().map(Objects::toString).collect(Collectors.joining(","))
                                 )
                              );
                           } else {
                              Path $$9 = this.e.a($$5);
                              return lx.a($$0, $$1.a, awj.a, new awj($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pv.b<T> b(awk<T> $$0) {
      awh $$1 = this.c($$0);
      return new pv.b<>($$1);
   }

   protected awh c(awk<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> awh.a());
   }

   public CompletableFuture<pv.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<jl.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (jl.a)$$0;
      });
   }

   protected static class b<T> {
      private final awh a;

      protected b(awh $$0) {
         this.a = $$0;
      }

      public final pv.b<T> a(akj<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pv.b<T> a(akj<T>... $$0) {
         for (akj<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pv.b<T> a(List<akj<T>> $$0) {
         for (akj<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pv.b<T> a(akk $$0) {
         this.a.b($$0);
         return this;
      }

      public pv.b<T> b(awk<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pv.b<T> b(akk $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<awk<T>, Optional<awh>> {
      static <T> pv.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(awk<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
