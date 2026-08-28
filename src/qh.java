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

public abstract class qh<T> implements mf {
   protected final mh.a e;
   private final CompletableFuture<js.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<qh.c<T>> h;
   protected final alh<? extends kd<T>> f;
   private final Map<ali, axn> i = Maps.newLinkedHashMap();

   protected qh(mh $$0, alh<? extends kd<T>> $$1, CompletableFuture<js.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qh.c.empty()));
   }

   protected qh(mh $$0, alh<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qh.c<T>> $$3) {
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
   public CompletableFuture<?> a(md $$0) {
      record a<T>(js.a a, qh.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (qh.c<T>)$$1), ae.g())
         .thenCompose(
            $$1 -> {
               js.b<T> $$2 = $$1.a.d(this.f);
               Predicate<ali> $$3 = $$1x -> $$2.a(alh.a(this.f, $$1x)).isPresent();
               Predicate<ali> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axq.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ali $$5 = (ali)$$4x.getKey();
                           axn $$6 = (axn)$$4x.getValue();
                           List<axo> $$7 = $$6.b();
                           List<axo> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mf.a($$0, $$1.a, axp.a, new axp($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected qh.b<T> b(axq<T> $$0) {
      axn $$1 = this.c($$0);
      return new qh.b<>($$1);
   }

   protected axn c(axq<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axn.a());
   }

   public CompletableFuture<qh.c<T>> c() {
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
      private final axn a;

      protected b(axn $$0) {
         this.a = $$0;
      }

      public final qh.b<T> a(alh<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final qh.b<T> a(alh<T>... $$0) {
         for (alh<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final qh.b<T> a(List<alh<T>> $$0) {
         for (alh<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public qh.b<T> a(ali $$0) {
         this.a.b($$0);
         return this;
      }

      public qh.b<T> b(axq<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public qh.b<T> b(ali $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axq<T>, Optional<axn>> {
      static <T> qh.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axq<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
