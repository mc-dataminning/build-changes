import com.google.common.collect.Maps;
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

public abstract class pq<T> implements mm {
   protected final mo.a e;
   private final CompletableFuture<jg.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<pq.c<T>> h;
   protected final alf<? extends jr<T>> f;
   private final Map<alg, axo> i = Maps.newLinkedHashMap();

   protected pq(mo $$0, alf<? extends jr<T>> $$1, CompletableFuture<jg.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pq.c.empty()));
   }

   protected pq(mo $$0, alf<? extends jr<T>> $$1, CompletableFuture<jg.a> $$2, CompletableFuture<pq.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jg.a var1);

   @Override
   public CompletableFuture<?> a(mk $$0) {
      record a<T>(jg.a a, pq.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (pq.c<T>)$$1), af.h())
         .thenCompose(
            $$1 -> {
               jg.b<T> $$2 = $$1.a.e(this.f);
               Predicate<alg> $$3 = $$1x -> $$2.a(alf.a(this.f, $$1x)).isPresent();
               Predicate<alg> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axr.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           alg $$5 = (alg)$$4x.getKey();
                           axo $$6 = (axo)$$4x.getValue();
                           List<axp> $$7 = $$6.b();
                           List<axp> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mm.a($$0, $$1.a, axq.a, new axq($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pq.b<T> b(axr<T> $$0) {
      axo $$1 = this.c($$0);
      return new pq.b<>($$1);
   }

   protected axo c(axr<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axo.a());
   }

   public CompletableFuture<pq.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jg.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jg.a)$$0;
      });
   }

   protected static class b<T> {
      private final axo a;

      protected b(axo $$0) {
         this.a = $$0;
      }

      public final pq.b<T> a(alf<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pq.b<T> a(alf<T>... $$0) {
         for (alf<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pq.b<T> a(List<alf<T>> $$0) {
         for (alf<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pq.b<T> a(alg $$0) {
         this.a.b($$0);
         return this;
      }

      public pq.b<T> b(axr<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pq.b<T> b(alg $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axr<T>, Optional<axo>> {
      static <T> pq.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axr<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
