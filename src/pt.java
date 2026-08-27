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

public abstract class pt<T> implements lo {
   private static final Logger d = LogUtils.getLogger();
   protected final lq.a e;
   private final CompletableFuture<jc.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<pt.c<T>> i;
   protected final aks<? extends jn<T>> f;
   private final Map<akt, awq> j = Maps.newLinkedHashMap();

   protected pt(lq $$0, aks<? extends jn<T>> $$1, CompletableFuture<jc.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pt.c.empty()));
   }

   protected pt(lq $$0, aks<? extends jn<T>> $$1, CompletableFuture<jc.a> $$2, CompletableFuture<pt.c<T>> $$3) {
      this.e = $$0.a(lq.b.a, awv.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jc.a var1);

   @Override
   public CompletableFuture<?> a(lm $$0) {
      record a<T>(jc.a a, pt.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (pt.c<T>)$$1), ad.f())
         .thenCompose(
            $$1 -> {
               jc.b<T> $$2 = $$1.a.b(this.f);
               Predicate<akt> $$3 = $$1x -> $$2.a(aks.a(this.f, $$1x)).isPresent();
               Predicate<akt> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(awt.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           akt $$5 = (akt)$$4x.getKey();
                           awq $$6 = (awq)$$4x.getValue();
                           List<awr> $$7 = $$6.b();
                           List<awr> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return lo.a($$0, $$1.a, aws.a, new aws($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pt.b<T> b(awt<T> $$0) {
      awq $$1 = this.c($$0);
      return new pt.b<>($$1);
   }

   protected awq c(awt<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> awq.a());
   }

   public CompletableFuture<pt.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<jc.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (jc.a)$$0;
      });
   }

   protected static class b<T> {
      private final awq a;

      protected b(awq $$0) {
         this.a = $$0;
      }

      public final pt.b<T> a(aks<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pt.b<T> a(aks<T>... $$0) {
         for (aks<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pt.b<T> a(List<aks<T>> $$0) {
         for (aks<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pt.b<T> a(akt $$0) {
         this.a.b($$0);
         return this;
      }

      public pt.b<T> b(awt<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pt.b<T> b(akt $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<awt<T>, Optional<awq>> {
      static <T> pt.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(awt<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
