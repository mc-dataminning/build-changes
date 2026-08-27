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

public final class jm {
   public static final jm a = new jm(Reference2ObjectMaps.emptyMap());
   public static final Codec<jm> b = aws.c(jm.b.a, jm.b::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<jo<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<jm.b, ?> $$2 : $$0.entrySet()) {
            jm.b $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new jm($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<jm.b, Object> $$1 = new Reference2ObjectArrayMap($$0.d.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<jo<?>, Optional<?>> $$2 = (Entry<jo<?>, Optional<?>>)var2.next();
         jo<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new jm.b($$3, false), $$4.get());
            } else {
               $$1.put(new jm.b($$3, true), aym.a);
            }
         }
      }

      return $$1;
   });
   public static final ye<vr, jm> c = new ye<vr, jm>() {
      public jm a(vr $$0) {
         int $$1 = $$0.l();
         int $$2 = $$0.l();
         if ($$1 == 0 && $$2 == 0) {
            return jm.a;
         } else {
            Reference2ObjectMap<jo<?>, Optional<?>> $$3 = new Reference2ObjectArrayMap($$1 + $$2);

            for (int $$4 = 0; $$4 < $$1; $$4++) {
               jo<?> $$5 = jo.b.decode($$0);
               Object $$6 = $$5.e().decode($$0);
               $$3.put($$5, Optional.of($$6));
            }

            for (int $$7 = 0; $$7 < $$2; $$7++) {
               jo<?> $$8 = jo.b.decode($$0);
               $$3.put($$8, Optional.empty());
            }

            return new jm($$3);
         }
      }

      public void a(vr $$0, jm $$1) {
         if ($$1.d()) {
            $$0.c(0);
            $$0.c(0);
         } else {
            int $$2 = 0;
            int $$3 = 0;
            ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>>)var5.next();
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
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>>)var5.next();
               Optional<?> $$6 = (Optional<?>)$$5.getValue();
               if ($$6.isPresent()) {
                  jo<?> $$7 = (jo<?>)$$5.getKey();
                  jo.b.encode($$0, $$7);
                  a($$0, $$7, $$6.get());
               }
            }

            var5 = Reference2ObjectMaps.fastIterable($$1.d).iterator();

            while (var5.hasNext()) {
               it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>>)var5.next();
               if (((Optional)$$8.getValue()).isEmpty()) {
                  jo<?> $$9 = (jo<?>)$$8.getKey();
                  jo.b.encode($$0, $$9);
               }
            }
         }
      }

      private static <T> void a(vr $$0, jo<T> $$1, Object $$2) {
         $$1.e().encode($$0, (T)$$2);
      }
   };
   private static final String e = "!";
   final Reference2ObjectMap<jo<?>, Optional<?>> d;

   jm(Reference2ObjectMap<jo<?>, Optional<?>> $$0) {
      this.d = $$0;
   }

   public static jm.a a() {
      return new jm.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(jo<? extends T> $$0) {
      return (Optional<? extends T>)this.d.get($$0);
   }

   public Set<Entry<jo<?>, Optional<?>>> b() {
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
         if ($$0 instanceof jm $$1 && this.d.equals($$1.d)) {
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

   static String a(Reference2ObjectMap<jo<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<jo<?>, Optional<?>> $$3 = (Entry<jo<?>, Optional<?>>)var3.next();
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
      private final Reference2ObjectMap<jo<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> jm.a a(jo<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> jm.a a(jo<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> jm.a a(jr<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public jm a() {
         return new jm(this.a);
      }
   }

   static record b(jo<?> b, boolean c) {
      public static final Codec<jm.b> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         ajt $$2 = ajt.a($$0);
         jo<?> $$3 = kr.at.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new jm.b($$3, $$1));
         }
      }, $$0 -> {
         jo<?> $$1 = $$0.b();
         ajt $$2 = kr.at.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.unit(aym.a) : this.b.c();
      }
   }
}
