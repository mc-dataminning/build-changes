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

public abstract class qi<T> implements mg {
   protected final mi.a e;
   private final CompletableFuture<js.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<qi.c<T>> h;
   protected final ali<? extends kd<T>> f;
   private final Map<alj, axp> i = Maps.newLinkedHashMap();

   protected qi(mi $$0, ali<? extends kd<T>> $$1, CompletableFuture<js.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qi.c.empty()));
   }

   protected qi(mi $$0, ali<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qi.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(js.a var1);

   @Override
   public CompletableFuture<?> a(me $$0) {
      record a<T>(js.a a, qi.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (qi.c<T>)$$1), ae.g())
         .thenCompose(
            $$1 -> {
               js.b<T> $$2 = $$1.a.d(this.f);
               Predicate<alj> $$3 = $$1x -> $$2.a(ali.a(this.f, $$1x)).isPresent();
               Predicate<alj> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axs.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           alj $$5 = (alj)$$4x.getKey();
                           axp $$6 = (axp)$$4x.getValue();
                           List<axq> $$7 = $$6.b();
                           List<axq> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mg.a($$0, $$1.a, axr.a, new axr($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected qi.b<T> b(axs<T> $$0) {
      axp $$1 = this.c($$0);
      return new qi.b<>($$1);
   }

   protected axp c(axs<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axp.a());
   }

   public CompletableFuture<qi.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<js.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (js.a)$$0;
      });
   }

   protected static class b<T> {
      private final axp a;

      protected b(axp $$0) {
         this.a = $$0;
      }

      public final qi.b<T> a(ali<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final qi.b<T> a(ali<T>... $$0) {
         for (ali<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final qi.b<T> a(List<ali<T>> $$0) {
         for (ali<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public qi.b<T> a(alj $$0) {
         this.a.b($$0);
         return this;
      }

      public qi.b<T> b(axs<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public qi.b<T> b(alj $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axs<T>, Optional<axp>> {
      static <T> qi.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axs<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
