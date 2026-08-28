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

public final class ku {
   public static final ku a = new ku(Reference2ObjectMaps.emptyMap());
   public static final Codec<ku> b = Codec.dispatchedMap(ku.b.a, ku.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<kw<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<ku.b, ?> $$2 : $$0.entrySet()) {
            ku.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new ku($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<ku.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<kw<?>, Optional<?>> $$2 = (Entry<kw<?>, Optional<?>>)var2.next();
         kw<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new ku.b($$3, false), $$4.get());
            } else {
               $$1.put(new ku.b($$3, true), baq.a);
            }
         }
      }

      return $$1;
   });
   public static final yt<wg, ku> c = new yt<wg, ku>() {
      public ku a(wg $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return ku.a;
         } else {
            int $$3 = $$1 + $$2;
            Reference2ObjectMap<kw<?>, Optional<?>> $$4 = new Reference2ObjectArrayMap(Math.min($$3, 65536));

            for (int $$5 = 0; $$5 < $$1; $$5++) {
               kw<?> $$6 = kw.b.decode($$0);
               Object $$7 = $$6.e().decode($$0);
               $$4.put($$6, Optional.of($$7));
            }

            for (int $$8 = 0; $$8 < $$2; $$8++) {
               kw<?> $$9 = kw.b.decode($$0);
               $$4.put($$9, Optional.empty());
            }

            return new ku($$4);
         }
      }

      public void a(wg $$0, ku $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kw<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kw<?>, Optional<?>>)var5.next();
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
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kw<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kw<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  kw<?> $$7 = (kw<?>)$$5.getKey();
                  kw.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kw<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kw<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  kw<?> $$9 = (kw<?>)$$8.getKey();
                  kw.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(wg $$0, kw<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<kw<?>, Optional<?>> d;

   ku(Reference2ObjectMap<kw<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static ku.a a() {
      return new ku.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(kw<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<kw<?>, Optional<?>>> b() {
      return this.d.entrySet();
   }

   public int c() {
      return this.d.size();
   }

   public ku a(Predicate<kw<?>> $$0) {
      if (this.d()) {
         return a;
      } else {
         Reference2ObjectMap<kw<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap(this.d);
         $$1.keySet().removeIf($$0);
         return $$1.isEmpty() ? a : new ku($$1);
      }
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public ku.c e() {
      if (this.d()) {
         return ku.c.a;
      } else {
         kt.a $$0 = kt.a();
         Set<kw<?>> $$1 = Sets.newIdentityHashSet();
         this.d.forEach(($$2, $$3) -> {
            if ($$3.isPresent()) {
               $$0.b($$2, $$3.get());
            } else {
               $$1.add($$2);
            }
         });
         return new ku.c($$0.a(), $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ku $$1 && this.d.equals($$1.d)) {
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

   static String a(Reference2ObjectMap<kw<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<kw<?>, Optional<?>> $$3 = (Entry<kw<?>, Optional<?>>)var3.next();
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
      private final Reference2ObjectMap<kw<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> ku.a a(kw<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> ku.a a(kw<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> ku.a a(kz<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public ku a() {
         return this.a.isEmpty() ? ku.a : new ku(this.a);
      }
   }

   static record b(kw<?> b, boolean c) {
      public static final Codec<ku.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         ald $$2 = ald.c($$0);
         kw<?> $$3 = md.ao.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new ku.b($$3, $$1));
         }
      }, $$0 -> {
         kw<?> $$1 = $$0.b();
         ald $$2 = md.ao.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.EMPTY.codec() : this.b.c();
      }
   }

   public static record c(kt b, Set<kw<?>> c) {
      public static final ku.c a = new ku.c(kt.a, Set.of());

      public kt a() {
         return this.b;
      }

      public Set<kw<?>> b() {
         return this.c;
      }
   }
}
