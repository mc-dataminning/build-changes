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

public abstract class pr<T> implements ll {
   private static final Logger d = LogUtils.getLogger();
   protected final ln.a e;
   private final CompletableFuture<iz.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<pr.c<T>> i;
   protected final akm<? extends jk<T>> f;
   private final Map<akn, awj> j = Maps.newLinkedHashMap();

   protected pr(ln $$0, akm<? extends jk<T>> $$1, CompletableFuture<iz.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pr.c.empty()));
   }

   protected pr(ln $$0, akm<? extends jk<T>> $$1, CompletableFuture<iz.a> $$2, CompletableFuture<pr.c<T>> $$3) {
      this.e = $$0.a(ln.b.a, awo.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(iz.a var1);

   @Override
   public CompletableFuture<?> a(lj $$0) {
      record a<T>(iz.a a, pr.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (pr.c<T>)$$1), ac.g())
         .thenCompose(
            $$1 -> {
               iz.b<T> $$2 = $$1.a.b(this.f);
               Predicate<akn> $$3 = $$1x -> $$2.a(akm.a(this.f, $$1x)).isPresent();
               Predicate<akn> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(awm.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           akn $$5 = (akn)$$4x.getKey();
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
                              return ll.a($$0, $$1.a, awl.a, new awl($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pr.b<T> b(awm<T> $$0) {
      awj $$1 = this.c($$0);
      return new pr.b<>($$1);
   }

   protected awj c(awm<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> awj.a());
   }

   public CompletableFuture<pr.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<iz.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (iz.a)$$0;
      });
   }

   protected static class b<T> {
      private final awj a;

      protected b(awj $$0) {
         this.a = $$0;
      }

      public final pr.b<T> a(akm<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pr.b<T> a(akm<T>... $$0) {
         for (akm<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pr.b<T> a(List<akm<T>> $$0) {
         for (akm<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pr.b<T> a(akn $$0) {
         this.a.b($$0);
         return this;
      }

      public pr.b<T> b(awm<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pr.b<T> b(akn $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<awm<T>, Optional<awj>> {
      static <T> pr.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(awm<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
