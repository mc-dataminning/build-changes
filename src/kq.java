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

public final class kq {
   public static final kq a = new kq(Reference2ObjectMaps.emptyMap());
   public static final Codec<kq> b = Codec.dispatchedMap(kq.b.a, kq.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<ks<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<kq.b, ?> $$2 : $$0.entrySet()) {
            kq.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new kq($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<kq.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<ks<?>, Optional<?>> $$2 = (Entry<ks<?>, Optional<?>>)var2.next();
         ks<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new kq.b($$3, false), $$4.get());
            } else {
               $$1.put(new kq.b($$3, true), bao.a);
            }
         }
      }

      return $$1;
   });
   public static final zf<ws, kq> c = new zf<ws, kq>() {
      public kq a(ws $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return kq.a;
         } else {
            int $$3 = $$1 + $$2;
            Reference2ObjectMap<ks<?>, Optional<?>> $$4 = new Reference2ObjectArrayMap(Math.min($$3, 65536));

            for (int $$5 = 0; $$5 < $$1; $$5++) {
               ks<?> $$6 = ks.b.decode($$0);
               Object $$7 = $$6.e().decode($$0);
               $$4.put($$6, Optional.of($$7));
            }

            for (int $$8 = 0; $$8 < $$2; $$8++) {
               ks<?> $$9 = ks.b.decode($$0);
               $$4.put($$9, Optional.empty());
            }

            return new kq($$4);
         }
      }

      public void a(ws $$0, kq $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ks<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ks<?>, Optional<?>>)var5.next();
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
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ks<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ks<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  ks<?> $$7 = (ks<?>)$$5.getKey();
                  ks.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ks<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ks<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  ks<?> $$9 = (ks<?>)$$8.getKey();
                  ks.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(ws $$0, ks<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<ks<?>, Optional<?>> d;

   kq(Reference2ObjectMap<ks<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static kq.a a() {
      return new kq.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(ks<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<ks<?>, Optional<?>>> b() {
      return this.d.entrySet();
   }

   public int c() {
      return this.d.size();
   }

   public kq a(Predicate<ks<?>> $$0) {
      if (this.d()) {
         return a;
      } else {
         Reference2ObjectMap<ks<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap(this.d);
         $$1.keySet().removeIf($$0);
         return $$1.isEmpty() ? a : new kq($$1);
      }
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public kq.c e() {
      if (this.d()) {
         return kq.c.a;
      } else {
         kp.a $$0 = kp.a();
         Set<ks<?>> $$1 = Sets.newIdentityHashSet();
         this.d.forEach(($$2, $$3) -> {
            if ($$3.isPresent()) {
               $$0.b($$2, $$3.get());
            } else {
               $$1.add($$2);
            }
         });
         return new kq.c($$0.a(), $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof kq $$1 && this.d.equals($$1.d)) {
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

   static String a(Reference2ObjectMap<ks<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<ks<?>, Optional<?>> $$3 = (Entry<ks<?>, Optional<?>>)var3.next();
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
      private final Reference2ObjectMap<ks<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kq.a a(ks<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> kq.a a(ks<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> kq.a a(kv<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public kq a() {
         return this.a.isEmpty() ? kq.a : new kq(this.a);
      }
   }

   static record b(ks<?> b, boolean c) {
      public static final Codec<kq.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         alh $$2 = alh.c($$0);
         ks<?> $$3 = lx.ao.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new kq.b($$3, $$1));
         }
      }, $$0 -> {
         ks<?> $$1 = $$0.b();
         alh $$2 = lx.ao.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.EMPTY.codec() : this.b.c();
      }
   }

   public static record c(kp b, Set<ks<?>> c) {
      public static final kq.c a = new kq.c(kp.a, Set.of());

      public kp a() {
         return this.b;
      }

      public Set<ks<?>> b() {
         return this.c;
      }
   }
}
