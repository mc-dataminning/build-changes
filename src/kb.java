import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public final class kb {
   public static final kb a = new kb(Reference2ObjectMaps.emptyMap());
   public static final Codec<kb> b = axu.c(kb.b.a, kb.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<kd<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<kb.b, ?> $$2 : $$0.entrySet()) {
            kb.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new kb($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<kb.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<kd<?>, Optional<?>> $$2 = (Entry<kd<?>, Optional<?>>)var2.next();
         kd<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new kb.b($$3, false), $$4.get());
            } else {
               $$1.put(new kb.b($$3, true), azo.a);
            }
         }
      }

      return $$1;
   });
   public static final zc<wp, kb> c = new zc<wp, kb>() {
      public kb a(wp $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return kb.a;
         } else {
            Reference2ObjectMap<kd<?>, Optional<?>> $$3 = new Reference2ObjectArrayMap($$1 + $$2);

            for (int $$4 = 0; $$4 < $$1; $$4++) {
               kd<?> $$5 = kd.b.decode($$0);
               Object $$6 = $$5.e().decode($$0);
               $$3.put($$5, Optional.of($$6));
            }

            for (int $$7 = 0; $$7 < $$2; $$7++) {
               kd<?> $$8 = kd.b.decode($$0);
               $$3.put($$8, Optional.empty());
            }

            return new kb($$3);
         }
      }

      public void a(wp $$0, kb $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kd<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kd<?>, Optional<?>>)var5.next();
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
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kd<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kd<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  kd<?> $$7 = (kd<?>)$$5.getKey();
                  kd.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kd<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kd<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  kd<?> $$9 = (kd<?>)$$8.getKey();
                  kd.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(wp $$0, kd<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<kd<?>, Optional<?>> d;

   kb(Reference2ObjectMap<kd<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static kb.a a() {
      return new kb.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(kd<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<kd<?>, Optional<?>>> b() {
      return this.d.entrySet();
   }

   public int c() {
      return this.d.size();
   }

   public boolean d() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof kb $$1 && this.d.equals($$1.d)) {
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

   static String a(Reference2ObjectMap<kd<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<kd<?>, Optional<?>> $$3 = (Entry<kd<?>, Optional<?>>)var3.next();
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
      private final Reference2ObjectMap<kd<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> kb.a a(kd<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> kb.a a(kd<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> kb.a a(kg<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public kb a() {
         return new kb(this.a);
      }
   }

   static record b(kd<?> b, boolean c) {
      public static final Codec<kb.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         akt $$2 = akt.a($$0);
         kd<?> $$3 = lh.as.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new kb.b($$3, $$1));
         }
      }, $$0 -> {
         kd<?> $$1 = $$0.b();
         akt $$2 = lh.as.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.unit(azo.a) : this.b.c();
      }
   }
}
