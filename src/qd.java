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

public abstract class qd<T> implements lw {
   private static final Logger d = LogUtils.getLogger();
   protected final ly.a e;
   private final CompletableFuture<jk.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<qd.c<T>> i;
   protected final ala<? extends jv<T>> f;
   private final Map<alb, awy> j = Maps.newLinkedHashMap();

   protected qd(ly $$0, ala<? extends jv<T>> $$1, CompletableFuture<jk.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qd.c.empty()));
   }

   protected qd(ly $$0, ala<? extends jv<T>> $$1, CompletableFuture<jk.a> $$2, CompletableFuture<qd.c<T>> $$3) {
      this.e = $$0.a(ly.b.a, axd.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jk.a var1);

   @Override
   public CompletableFuture<?> a(lu $$0) {
      record a<T>(jk.a a, qd.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (qd.c<T>)$$1), ac.g())
         .thenCompose(
            $$1 -> {
               jk.b<T> $$2 = $$1.a.b(this.f);
               Predicate<alb> $$3 = $$1x -> $$2.a(ala.a(this.f, $$1x)).isPresent();
               Predicate<alb> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(axb.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           alb $$5 = (alb)$$4x.getKey();
                           awy $$6 = (awy)$$4x.getValue();
                           List<awz> $$7 = $$6.b();
                           List<awz> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return lw.a($$0, $$1.a, axa.a, new axa($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected qd.b<T> b(axb<T> $$0) {
      awy $$1 = this.c($$0);
      return new qd.b<>($$1);
   }

   protected awy c(axb<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> awy.a());
   }

   public CompletableFuture<qd.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<jk.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (jk.a)$$0;
      });
   }

   protected static class b<T> {
      private final awy a;

      protected b(awy $$0) {
         this.a = $$0;
      }

      public final qd.b<T> a(ala<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final qd.b<T> a(ala<T>... $$0) {
         for (ala<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final qd.b<T> a(List<ala<T>> $$0) {
         for (ala<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public qd.b<T> a(alb $$0) {
         this.a.b($$0);
         return this;
      }

      public qd.b<T> b(axb<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public qd.b<T> b(alb $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axb<T>, Optional<awy>> {
      static <T> qd.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axb<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
