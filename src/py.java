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

public abstract class py<T> implements ma {
   protected final mc.a e;
   private final CompletableFuture<jo.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<py.c<T>> h;
   protected final akp<? extends jz<T>> f;
   private final Map<akq, awq> i = Maps.newLinkedHashMap();

   protected py(mc $$0, akp<? extends jz<T>> $$1, CompletableFuture<jo.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(py.c.empty()));
   }

   protected py(mc $$0, akp<? extends jz<T>> $$1, CompletableFuture<jo.a> $$2, CompletableFuture<py.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jo.a var1);

   @Override
   public CompletableFuture<?> a(ly $$0) {
      record a<T>(jo.a a, py.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (py.c<T>)$$1), ad.g())
         .thenCompose(
            $$1 -> {
               jo.b<T> $$2 = $$1.a.b(this.f);
               Predicate<akq> $$3 = $$1x -> $$2.a(akp.a(this.f, $$1x)).isPresent();
               Predicate<akq> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(awt.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           akq $$5 = (akq)$$4x.getKey();
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
                              return ma.a($$0, $$1.a, aws.a, new aws($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected py.b<T> b(awt<T> $$0) {
      awq $$1 = this.c($$0);
      return new py.b<>($$1);
   }

   protected awq c(awt<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> awq.a());
   }

   public CompletableFuture<py.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jo.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jo.a)$$0;
      });
   }

   protected static class b<T> {
      private final awq a;

      protected b(awq $$0) {
         this.a = $$0;
      }

      public final py.b<T> a(akp<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final py.b<T> a(akp<T>... $$0) {
         for (akp<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final py.b<T> a(List<akp<T>> $$0) {
         for (akp<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public py.b<T> a(akq $$0) {
         this.a.b($$0);
         return this;
      }

      public py.b<T> b(awt<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public py.b<T> b(akq $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<awt<T>, Optional<awq>> {
      static <T> py.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(awt<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
