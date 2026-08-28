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

public abstract class pv<T> implements lx {
   protected final lz.a e;
   private final CompletableFuture<jl.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<pv.c<T>> h;
   protected final akj<? extends jw<T>> f;
   private final Map<akk, awj> i = Maps.newLinkedHashMap();

   protected pv(lz $$0, akj<? extends jw<T>> $$1, CompletableFuture<jl.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pv.c.empty()));
   }

   protected pv(lz $$0, akj<? extends jw<T>> $$1, CompletableFuture<jl.a> $$2, CompletableFuture<pv.c<T>> $$3) {
      this.e = $$0.a(lz.b.a, awo.a($$1));
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
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
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (pv.c<T>)$$1), ac.g())
         .thenCompose(
            $$1 -> {
               jl.b<T> $$2 = $$1.a.b(this.f);
               Predicate<akk> $$3 = $$1x -> $$2.a(akj.a(this.f, $$1x)).isPresent();
               Predicate<akk> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(awm.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           akk $$5 = (akk)$$4x.getKey();
                           awj $$6 = (awj)$$4x.getValue();
                           List<awk> $$7 = $$6.b();
                           List<awk> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return lx.a($$0, $$1.a, awl.a, new awl($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pv.b<T> b(awm<T> $$0) {
      awj $$1 = this.c($$0);
      return new pv.b<>($$1);
   }

   protected awj c(awm<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> awj.a());
   }

   public CompletableFuture<pv.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jl.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jl.a)$$0;
      });
   }

   protected static class b<T> {
      private final awj a;

      protected b(awj $$0) {
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

      public pv.b<T> b(awm<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pv.b<T> b(akk $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<awm<T>, Optional<awj>> {
      static <T> pv.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(awm<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
