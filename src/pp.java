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

public abstract class pp<T> implements mk {
   protected final mm.a e;
   private final CompletableFuture<ju.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<pp.c<T>> h;
   protected final alc<? extends kf<T>> f;
   private final Map<ald, axm> i = Maps.newLinkedHashMap();

   protected pp(mm $$0, alc<? extends kf<T>> $$1, CompletableFuture<ju.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pp.c.empty()));
   }

   protected pp(mm $$0, alc<? extends kf<T>> $$1, CompletableFuture<ju.a> $$2, CompletableFuture<pp.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(ju.a var1);

   @Override
   public CompletableFuture<?> a(mi $$0) {
      record a<T>(ju.a a, pp.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (pp.c<T>)$$1), af.h())
         .thenCompose(
            $$1 -> {
               ju.b<T> $$2 = $$1.a.e(this.f);
               Predicate<ald> $$3 = $$1x -> $$2.a(alc.a(this.f, $$1x)).isPresent();
               Predicate<ald> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axp.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ald $$5 = (ald)$$4x.getKey();
                           axm $$6 = (axm)$$4x.getValue();
                           List<axn> $$7 = $$6.b();
                           List<axn> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mk.a($$0, $$1.a, axo.a, new axo($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pp.b<T> b(axp<T> $$0) {
      axm $$1 = this.c($$0);
      return new pp.b<>($$1);
   }

   protected axm c(axp<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axm.a());
   }

   public CompletableFuture<pp.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<ju.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (ju.a)$$0;
      });
   }

   protected static class b<T> {
      private final axm a;

      protected b(axm $$0) {
         this.a = $$0;
      }

      public final pp.b<T> a(alc<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pp.b<T> a(alc<T>... $$0) {
         for (alc<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pp.b<T> a(List<alc<T>> $$0) {
         for (alc<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pp.b<T> a(ald $$0) {
         this.a.b($$0);
         return this;
      }

      public pp.b<T> b(axp<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pp.b<T> b(ald $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axp<T>, Optional<axm>> {
      static <T> pp.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axp<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
