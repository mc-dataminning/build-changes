import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class kk {
   public static final kk a = new kk(Reference2ObjectMaps.emptyMap());
   public static final Codec<kk> b = Codec.dispatchedMap(kk.b.a, kk.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<km<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<kk.b, ?> $$2 : $$0.entrySet()) {
            kk.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new kk($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<kk.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<km<?>, Optional<?>> $$2 = (Entry<km<?>, Optional<?>>)var2.next();
         km<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new kk.b($$3, false), $$4.get());
            } else {
               $$1.put(new kk.b($$3, true), azh.a);
            }
         }
      }

      return $$1;
   });
   public static final ys<wf, kk> c = new ys<wf, kk>() {
      public kk a(wf $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return kk.a;
         } else {
            Reference2ObjectMap<km<?>, Optional<?>> $$3 = new Reference2ObjectArrayMap($$1 + $$2);

            for (int $$4 = 0; $$4 < $$1; $$4++) {
               km<?> $$5 = km.b.decode($$0);
               Object $$6 = $$5.e().decode($$0);
               $$3.put($$5, Optional.of($$6));
            }

            for (int $$7 = 0; $$7 < $$2; $$7++) {
               km<?> $$8 = km.b.decode($$0);
               $$3.put($$8, Optional.empty());
            }

            return new kk($$3);
         }
      }

      public void a(wf $$0, kk $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<km<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<km<?>, Optional<?>>)var5.next();
               if (((Optional)$$4.getValue()).isPresent()) {
                  $$2++;
               } else {
                  $$3++;
               }
            }

            $$0.c($$2);
            $$0.c($$3);
            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<km<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<km<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  km<?> $$7 = (km<?>)$$5.getKey();
                  km.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<km<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<km<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  km<?> $$9 = (km<?>)$$8.getKey();
                  km.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(wf $$0, km<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<km<?>, Optional<?>> d;

   kk(Reference2ObjectMap<km<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static kk.a a() {
      return new kk.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(km<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<km<?>, Optional<?>>> b() {
      return this.d.entrySet();
   }

   public int c() {
      return this.d.size();
   }

   public kk a(Predicate<km<?>> $$0) {
      if (this.d()) {
         return a;
      } else {
         Reference2ObjectMap<km<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap(this.d);
         $$1.keySet().removeIf($$0);
         return $$1.isEmpty() ? a : new kk($$1);
      }
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public kk.c e() {
      if (this.d()) {
         return kk.c.a;
      } else {
         kj.a $$0 = kj.a();
         Set<km<?>> $$1 = Sets.newIdentityHashSet();
         this.d.forEach(($$2, $$3) -> {
            if ($$3.isPresent()) {
               $$0.b($$2, $$3.get());
            } else {
               $$1.add($$2);
            }
         });
         return new kk.c($$0.a(), $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof kk $$1 && this.d.equals($$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   @Override
   public String toString() {
      return a(this.d);
   }

   static String a(Reference2ObjectMap<km<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<km<?>, Optional<?>> $$3 = (Entry<km<?>, Optional<?>>)var3.next();
         if ($$2) {
            $$2 = false;
         } else {
            $$1.append(", ");
         }

         Optional<?> $$4 = $$3.getValue();
         if ($$4.isPresent()) {
            $$1.append($$3.getKey());
            $$1.append("=>");
            $$1.append($$4.get());
         } else {
            $$1.append("!");
            $$1.append($$3.getKey());
         }
      }

      $$1.append('}');
      return $$1.toString();
   }

   public static class a {
      private final Reference2ObjectMap<km<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kk.a a(km<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> kk.a a(km<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> kk.a a(kp<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public kk a() {
         return this.a.isEmpty() ? kk.a : new kk(this.a);
      }
   }

   static record b(km<?> b, boolean c) {
      public static final Codec<kk.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         akk $$2 = akk.a($$0);
         km<?> $$3 = lq.aq.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new kk.b($$3, $$1));
         }
      }, $$0 -> {
         km<?> $$1 = $$0.b();
         akk $$2 = lq.aq.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.EMPTY.codec() : this.b.c();
      }
   }

   public static record c(kj b, Set<km<?>> c) {
      public static final kk.c a = new kk.c(kj.a, Set.of());

      public kj a() {
         return this.b;
      }

      public Set<km<?>> b() {
         return this.c;
      }
   }
}
