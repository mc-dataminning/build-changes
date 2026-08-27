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

public abstract class pc<T> implements ky {
   private static final Logger d = LogUtils.getLogger();
   protected final la.a e;
   private final CompletableFuture<in.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<pc.c<T>> i;
   protected final ajs<? extends iy<T>> f;
   private final Map<ajt, avo> j = Maps.newLinkedHashMap();

   protected pc(la $$0, ajs<? extends iy<T>> $$1, CompletableFuture<in.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pc.c.empty()));
   }

   protected pc(la $$0, ajs<? extends iy<T>> $$1, CompletableFuture<in.a> $$2, CompletableFuture<pc.c<T>> $$3) {
      this.e = $$0.a(la.b.a, avt.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(in.a var1);

   @Override
   public CompletableFuture<?> a(kw $$0) {
      record a<T>(in.a a, pc.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (pc.c<T>)$$1), ac.f())
         .thenCompose(
            $$1 -> {
               in.b<T> $$2 = $$1.a.b(this.f);
               Predicate<ajt> $$3 = $$1x -> $$2.a(ajs.a(this.f, $$1x)).isPresent();
               Predicate<ajt> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(avr.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ajt $$5 = (ajt)$$4x.getKey();
                           avo $$6 = (avo)$$4x.getValue();
                           List<avp> $$7 = $$6.b();
                           List<avp> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return ky.a($$0, $$1.a, avq.a, new avq($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pc.b<T> b(avr<T> $$0) {
      avo $$1 = this.c($$0);
      return new pc.b<>($$1);
   }

   protected avo c(avr<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> avo.a());
   }

   public CompletableFuture<pc.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<in.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (in.a)$$0;
      });
   }

   protected static class b<T> {
      private final avo a;

      protected b(avo $$0) {
         this.a = $$0;
      }

      public final pc.b<T> a(ajs<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pc.b<T> a(ajs<T>... $$0) {
         for (ajs<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pc.b<T> a(List<ajs<T>> $$0) {
         for (ajs<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pc.b<T> a(ajt $$0) {
         this.a.b($$0);
         return this;
      }

      public pc.b<T> b(avr<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pc.b<T> b(ajt $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<avr<T>, Optional<avo>> {
      static <T> pc.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(avr<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
