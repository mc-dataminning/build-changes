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

public abstract class pn<T> implements mi {
   protected final mk.a e;
   private final CompletableFuture<jt.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<pn.c<T>> h;
   protected final akt<? extends ke<T>> f;
   private final Map<aku, axc> i = Maps.newLinkedHashMap();

   protected pn(mk $$0, akt<? extends ke<T>> $$1, CompletableFuture<jt.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pn.c.empty()));
   }

   protected pn(mk $$0, akt<? extends ke<T>> $$1, CompletableFuture<jt.a> $$2, CompletableFuture<pn.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jt.a var1);

   @Override
   public CompletableFuture<?> a(mg $$0) {
      record a<T>(jt.a a, pn.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (pn.c<T>)$$1), af.g())
         .thenCompose(
            $$1 -> {
               jt.b<T> $$2 = $$1.a.d(this.f);
               Predicate<aku> $$3 = $$1x -> $$2.a(akt.a(this.f, $$1x)).isPresent();
               Predicate<aku> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axf.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           aku $$5 = (aku)$$4x.getKey();
                           axc $$6 = (axc)$$4x.getValue();
                           List<axd> $$7 = $$6.b();
                           List<axd> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mi.a($$0, $$1.a, axe.a, new axe($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pn.b<T> b(axf<T> $$0) {
      axc $$1 = this.c($$0);
      return new pn.b<>($$1);
   }

   protected axc c(axf<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axc.a());
   }

   public CompletableFuture<pn.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jt.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jt.a)$$0;
      });
   }

   protected static class b<T> {
      private final axc a;

      protected b(axc $$0) {
         this.a = $$0;
      }

      public final pn.b<T> a(akt<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pn.b<T> a(akt<T>... $$0) {
         for (akt<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pn.b<T> a(List<akt<T>> $$0) {
         for (akt<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pn.b<T> a(aku $$0) {
         this.a.b($$0);
         return this;
      }

      public pn.b<T> b(axf<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pn.b<T> b(aku $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axf<T>, Optional<axc>> {
      static <T> pn.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axf<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
