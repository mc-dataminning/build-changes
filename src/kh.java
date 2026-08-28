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

public final class kh {
   public static final kh a = new kh(Reference2ObjectMaps.emptyMap());
   public static final Codec<kh> b = Codec.dispatchedMap(kh.b.a, kh.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<ki<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<kh.b, ?> $$2 : $$0.entrySet()) {
            kh.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new kh($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<kh.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<ki<?>, Optional<?>> $$2 = (Entry<ki<?>, Optional<?>>)var2.next();
         ki<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new kh.b($$3, false), $$4.get());
            } else {
               $$1.put(new kh.b($$3, true), bas.a);
            }
         }
      }

      return $$1;
   });
   public static final yu<wh, kh> c = new yu<wh, kh>() {
      public kh a(wh $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return kh.a;
         } else {
            int $$3 = $$1 + $$2;
            Reference2ObjectMap<ki<?>, Optional<?>> $$4 = new Reference2ObjectArrayMap(Math.min($$3, 65536));

            for (int $$5 = 0; $$5 < $$1; $$5++) {
               ki<?> $$6 = ki.b.decode($$0);
               Object $$7 = $$6.e().decode($$0);
               $$4.put($$6, Optional.of($$7));
            }

            for (int $$8 = 0; $$8 < $$2; $$8++) {
               ki<?> $$9 = ki.b.decode($$0);
               $$4.put($$9, Optional.empty());
            }

            return new kh($$4);
         }
      }

      public void a(wh $$0, kh $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ki<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ki<?>, Optional<?>>)var5.next();
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
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ki<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ki<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  ki<?> $$7 = (ki<?>)$$5.getKey();
                  ki.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ki<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<ki<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  ki<?> $$9 = (ki<?>)$$8.getKey();
                  ki.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(wh $$0, ki<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<ki<?>, Optional<?>> d;

   kh(Reference2ObjectMap<ki<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static kh.a a() {
      return new kh.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(ki<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<ki<?>, Optional<?>>> b() {
      return this.d.entrySet();
   }

   public int c() {
      return this.d.size();
   }

   public kh a(Predicate<ki<?>> $$0) {
      if (this.d()) {
         return a;
      } else {
         Reference2ObjectMap<ki<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap(this.d);
         $$1.keySet().removeIf($$0);
         return $$1.isEmpty() ? a : new kh($$1);
      }
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public kh.c e() {
      if (this.d()) {
         return kh.c.a;
      } else {
         kg.a $$0 = kg.a();
         Set<ki<?>> $$1 = Sets.newIdentityHashSet();
         this.d.forEach(($$2, $$3) -> {
            if ($$3.isPresent()) {
               $$0.b($$2, $$3.get());
            } else {
               $$1.add($$2);
            }
         });
         return new kh.c($$0.a(), $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof kh $$1 && this.d.equals($$1.d)) {
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

   static String a(Reference2ObjectMap<ki<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<ki<?>, Optional<?>> $$3 = (Entry<ki<?>, Optional<?>>)var3.next();
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
      private final Reference2ObjectMap<ki<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kh.a a(ki<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> kh.a a(ki<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> kh.a a(kl<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public kh a() {
         return this.a.isEmpty() ? kh.a : new kh(this.a);
      }
   }

   static record b(ki<?> b, boolean c) {
      public static final Codec<kh.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         ale $$2 = ale.c($$0);
         ki<?> $$3 = mf.am.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new kh.b($$3, $$1));
         }
      }, $$0 -> {
         ki<?> $$1 = $$0.b();
         ale $$2 = mf.am.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.EMPTY.codec() : this.b.c();
      }
   }

   public static record c(kg b, Set<ki<?>> c) {
      public static final kh.c a = new kh.c(kg.a, Set.of());

      public kg a() {
         return this.b;
      }

      public Set<ki<?>> b() {
         return this.c;
      }
   }
}
