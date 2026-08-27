import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public final class js implements jn {
   private final jn b;
   private Reference2ObjectMap<jq<?>, Optional<?>> c;
   private boolean d;

   public js(jn $$0) {
      this($$0, Reference2ObjectMaps.emptyMap(), true);
   }

   private js(jn $$0, Reference2ObjectMap<jq<?>, Optional<?>> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static js a(jn $$0, jo $$1) {
      if (a($$0, $$1.d)) {
         return new js($$0, $$1.d, true);
      } else {
         js $$2 = new js($$0);
         $$2.a($$1);
         return $$2;
      }
   }

   private static boolean a(jn $$0, Reference2ObjectMap<jq<?>, Optional<?>> $$1) {
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$1).iterator();

      while (var2.hasNext()) {
         Entry<jq<?>, Optional<?>> $$2 = (Entry<jq<?>, Optional<?>>)var2.next();
         Object $$3 = $$0.a($$2.getKey());
         Optional<?> $$4 = $$2.getValue();
         if ($$4.isPresent() && $$4.get().equals($$3)) {
            return false;
         }

         if ($$4.isEmpty() && $$3 == null) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public <T> T a(jq<? extends T> $$0) {
      Optional<? extends T> $$1 = (Optional<? extends T>)this.c.get($$0);
      return (T)($$1 != null ? $$1.orElse(null) : this.b.a($$0));
   }

   @Nullable
   public <T> T b(jq<? super T> $$0, @Nullable T $$1) {
      this.h();
      T $$2 = this.b.a((jq<? extends T>)$$0);
      Optional<T> $$3;
      if (Objects.equals($$1, $$2)) {
         $$3 = (Optional<T>)this.c.remove($$0);
      } else {
         $$3 = (Optional<T>)this.c.put($$0, Optional.ofNullable($$1));
      }

      return $$3 != null ? $$3.orElse($$2) : $$2;
   }

   @Nullable
   public <T> T d(jq<? extends T> $$0) {
      this.h();
      T $$1 = this.b.a($$0);
      Optional<? extends T> $$2;
      if ($$1 != null) {
         $$2 = (Optional<? extends T>)this.c.put($$0, Optional.empty());
      } else {
         $$2 = (Optional<? extends T>)this.c.remove($$0);
      }

      return (T)($$2 != null ? $$2.orElse(null) : $$1);
   }

   public void a(jo $$0) {
      this.h();
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<jq<?>, Optional<?>> $$1 = (Entry<jq<?>, Optional<?>>)var2.next();
         this.a($$1.getKey(), $$1.getValue());
      }
   }

   private void a(jq<?> $$0, Optional<?> $$1) {
      Object $$2 = this.b.a($$0);
      if ($$1.isPresent()) {
         if ($$1.get().equals($$2)) {
            this.c.remove($$0);
         } else {
            this.c.put($$0, $$1);
         }
      } else if ($$2 != null) {
         this.c.put($$0, Optional.empty());
      } else {
         this.c.remove($$0);
      }
   }

   public void a(jn $$0) {
      for (jt<?> $$1 : $$0) {
         $$1.a(this);
      }
   }

   private void h() {
      if (this.d) {
         this.c = new Reference2ObjectArrayMap(this.c);
         this.d = false;
      }
   }

   @Override
   public Set<jq<?>> b() {
      if (this.c.isEmpty()) {
         return this.b.b();
      } else {
         Set<jq<?>> $$0 = new ReferenceArraySet(this.b.b());
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.c).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jq<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jq<?>, Optional<?>>)var2.next();
            Optional<?> $$2 = (Optional<?>)$$1.getValue();
            if ($$2.isPresent()) {
               $$0.add((jq<?>)$$1.getKey());
            } else {
               $$0.remove($$1.getKey());
            }
         }

         return $$0;
      }
   }

   @Override
   public Iterator<jt<?>> iterator() {
      if (this.c.isEmpty()) {
         return this.b.iterator();
      } else {
         List<jt<?>> $$0 = new ArrayList<>(this.c.size() + this.b.d());
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.c).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jq<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jq<?>, Optional<?>>)var2.next();
            if (((Optional)$$1.getValue()).isPresent()) {
               $$0.add(jt.a((jq)$$1.getKey(), ((Optional)$$1.getValue()).get()));
            }
         }

         for (jt<?> $$2 : this.b) {
            if (!this.c.containsKey($$2.a())) {
               $$0.add($$2);
            }
         }

         return $$0.iterator();
      }
   }

   @Override
   public int d() {
      int $$0 = this.b.d();
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.c).iterator();

      while (var2.hasNext()) {
         it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jq<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jq<?>, Optional<?>>)var2.next();
         boolean $$2 = ((Optional)$$1.getValue()).isPresent();
         boolean $$3 = this.b.b((jq<?>)$$1.getKey());
         if ($$2 != $$3) {
            $$0 += $$2 ? 1 : -1;
         }
      }

      return $$0;
   }

   public jo f() {
      if (this.c.isEmpty()) {
         return jo.a;
      } else {
         this.d = true;
         return new jo(this.c);
      }
   }

   public js g() {
      this.d = true;
      return new js(this.b, this.c, true);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof js $$1 && this.b.equals($$1.b) && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode() + this.c.hashCode() * 31;
   }

   @Override
   public String toString() {
      return "{" + this.c().map(jt::toString).collect(Collectors.joining(", ")) + "}";
   }
}
