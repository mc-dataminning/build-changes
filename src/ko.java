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

public final class ko {
   public static final ko a = new ko(Reference2ObjectMaps.emptyMap());
   public static final Codec<ko> b = Codec.dispatchedMap(ko.b.a, ko.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<kq<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<ko.b, ?> $$2 : $$0.entrySet()) {
            ko.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new ko($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<ko.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<kq<?>, Optional<?>> $$2 = (Entry<kq<?>, Optional<?>>)var2.next();
         kq<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new ko.b($$3, false), $$4.get());
            } else {
               $$1.put(new ko.b($$3, true), bah.a);
            }
         }
      }

      return $$1;
   });
   public static final zb<wo, ko> c = new zb<wo, ko>() {
      public ko a(wo $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return ko.a;
         } else {
            int $$3 = $$1 + $$2;
            Reference2ObjectMap<kq<?>, Optional<?>> $$4 = new Reference2ObjectArrayMap(Math.min($$3, 65536));

            for (int $$5 = 0; $$5 < $$1; $$5++) {
               kq<?> $$6 = kq.b.decode($$0);
               Object $$7 = $$6.e().decode($$0);
               $$4.put($$6, Optional.of($$7));
            }

            for (int $$8 = 0; $$8 < $$2; $$8++) {
               kq<?> $$9 = kq.b.decode($$0);
               $$4.put($$9, Optional.empty());
            }

            return new ko($$4);
         }
      }

      public void a(wo $$0, ko $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>>)var5.next();
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
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  kq<?> $$7 = (kq<?>)$$5.getKey();
                  kq.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  kq<?> $$9 = (kq<?>)$$8.getKey();
                  kq.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(wo $$0, kq<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<kq<?>, Optional<?>> d;

   ko(Reference2ObjectMap<kq<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static ko.a a() {
      return new ko.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(kq<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<kq<?>, Optional<?>>> b() {
      return this.d.entrySet();
   }

   public int c() {
      return this.d.size();
   }

   public ko a(Predicate<kq<?>> $$0) {
      if (this.d()) {
         return a;
      } else {
         Reference2ObjectMap<kq<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap(this.d);
         $$1.keySet().removeIf($$0);
         return $$1.isEmpty() ? a : new ko($$1);
      }
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   public ko.c e() {
      if (this.d()) {
         return ko.c.a;
      } else {
         kn.a $$0 = kn.a();
         Set<kq<?>> $$1 = Sets.newIdentityHashSet();
         this.d.forEach(($$2, $$3) -> {
            if ($$3.isPresent()) {
               $$0.b($$2, $$3.get());
            } else {
               $$1.add($$2);
            }
         });
         return new ko.c($$0.a(), $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ko $$1 && this.d.equals($$1.d)) {
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

   static String a(Reference2ObjectMap<kq<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<kq<?>, Optional<?>> $$3 = (Entry<kq<?>, Optional<?>>)var3.next();
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
      private final Reference2ObjectMap<kq<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> ko.a a(kq<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> ko.a a(kq<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> ko.a a(kt<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public ko a() {
         return this.a.isEmpty() ? ko.a : new ko(this.a);
      }
   }

   static record b(kq<?> b, boolean c) {
      public static final Codec<ko.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         alb $$2 = alb.c($$0);
         kq<?> $$3 = lu.ap.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new ko.b($$3, $$1));
         }
      }, $$0 -> {
         kq<?> $$1 = $$0.b();
         alb $$2 = lu.ap.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.EMPTY.codec() : this.b.c();
      }
   }

   public static record c(kn b, Set<kq<?>> c) {
      public static final ko.c a = new ko.c(kn.a, Set.of());

      public kn a() {
         return this.b;
      }

      public Set<kq<?>> b() {
         return this.c;
      }
   }
}
