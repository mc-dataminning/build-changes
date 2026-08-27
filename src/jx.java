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

public final class jx {
   public static final jx a = new jx(Reference2ObjectMaps.emptyMap());
   public static final Codec<jx> b = axh.c(jx.b.a, jx.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<jz<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<jx.b, ?> $$2 : $$0.entrySet()) {
            jx.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new jx($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<jx.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<jz<?>, Optional<?>> $$2 = (Entry<jz<?>, Optional<?>>)var2.next();
         jz<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new jx.b($$3, false), $$4.get());
            } else {
               $$1.put(new jx.b($$3, true), azb.a);
            }
         }
      }

      return $$1;
   });
   public static final ys<wf, jx> c = new ys<wf, jx>() {
      public jx a(wf $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return jx.a;
         } else {
            Reference2ObjectMap<jz<?>, Optional<?>> $$3 = new Reference2ObjectArrayMap($$1 + $$2);

            for (int $$4 = 0; $$4 < $$1; $$4++) {
               jz<?> $$5 = jz.b.decode($$0);
               Object $$6 = $$5.e().decode($$0);
               $$3.put($$5, Optional.of($$6));
            }

            for (int $$7 = 0; $$7 < $$2; $$7++) {
               jz<?> $$8 = jz.b.decode($$0);
               $$3.put($$8, Optional.empty());
            }

            return new jx($$3);
         }
      }

      public void a(wf $$0, jx $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jz<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jz<?>, Optional<?>>)var5.next();
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
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jz<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jz<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  jz<?> $$7 = (jz<?>)$$5.getKey();
                  jz.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jz<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jz<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  jz<?> $$9 = (jz<?>)$$8.getKey();
                  jz.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(wf $$0, jz<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<jz<?>, Optional<?>> d;

   jx(Reference2ObjectMap<jz<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static jx.a a() {
      return new jx.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(jz<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<jz<?>, Optional<?>>> b() {
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
         if ($$0 instanceof jx $$1 && this.d.equals($$1.d)) {
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

   static String a(Reference2ObjectMap<jz<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<jz<?>, Optional<?>> $$3 = (Entry<jz<?>, Optional<?>>)var3.next();
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
      private final Reference2ObjectMap<jz<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> jx.a a(jz<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> jx.a a(jz<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> jx.a a(kc<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public jx a() {
         return new jx(this.a);
      }
   }

   static record b(jz<?> b, boolean c) {
      public static final Codec<jx.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         akh $$2 = akh.a($$0);
         jz<?> $$3 = ld.as.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new jx.b($$3, $$1));
         }
      }, $$0 -> {
         jz<?> $$1 = $$0.b();
         akh $$2 = ld.as.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.unit(azb.a) : this.b.c();
      }
   }
}
