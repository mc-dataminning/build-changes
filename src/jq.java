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

public final class jq implements jl {
   private final jl b;
   private Reference2ObjectMap<jo<?>, Optional<?>> c;
   private boolean d;

   public jq(jl $$0) {
      this($$0, Reference2ObjectMaps.emptyMap(), true);
   }

   private jq(jl $$0, Reference2ObjectMap<jo<?>, Optional<?>> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static jq a(jl $$0, jm $$1) {
      if (a($$0, $$1.d)) {
         return new jq($$0, $$1.d, true);
      } else {
         jq $$2 = new jq($$0);
         $$2.a($$1);
         return $$2;
      }
   }

   private static boolean a(jl $$0, Reference2ObjectMap<jo<?>, Optional<?>> $$1) {
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$1).iterator();

      while (var2.hasNext()) {
         Entry<jo<?>, Optional<?>> $$2 = (Entry<jo<?>, Optional<?>>)var2.next();
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
   public <T> T a(jo<? extends T> $$0) {
      Optional<? extends T> $$1 = (Optional<? extends T>)this.c.get($$0);
      return (T)($$1 != null ? $$1.orElse(null) : this.b.a($$0));
   }

   @Nullable
   public <T> T b(jo<? super T> $$0, @Nullable T $$1) {
      this.h();
      T $$2 = this.b.a((jo<? extends T>)$$0);
      Optional<T> $$3;
      if (Objects.equals($$1, $$2)) {
         $$3 = (Optional<T>)this.c.remove($$0);
      } else {
         $$3 = (Optional<T>)this.c.put($$0, Optional.ofNullable($$1));
      }

      return $$3 != null ? $$3.orElse($$2) : $$2;
   }

   @Nullable
   public <T> T d(jo<? extends T> $$0) {
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

   public void a(jm $$0) {
      this.h();
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<jo<?>, Optional<?>> $$1 = (Entry<jo<?>, Optional<?>>)var2.next();
         this.a($$1.getKey(), $$1.getValue());
      }
   }

   private void a(jo<?> $$0, Optional<?> $$1) {
      Object $$2 = this.b.a($$0);
      if ($$1.isPresent()) {
         if ($$1.get().equals($$2)) {
            this.c.remove($$0);
         } else {
            this.c.put($$0, $$1);
         }
      } else if ($$2 != null) {
         this.c.put($$0, Optional.empty());
      }
   }

   public void a(jl $$0) {
      for (jr<?> $$1 : $$0) {
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
   public Set<jo<?>> b() {
      if (this.c.isEmpty()) {
         return this.b.b();
      } else {
         Set<jo<?>> $$0 = new ReferenceArraySet(this.b.b());
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.c).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>>)var2.next();
            Optional<?> $$2 = (Optional<?>)$$1.getValue();
            if ($$2.isPresent()) {
               $$0.add((jo<?>)$$1.getKey());
            } else {
               $$0.remove($$1.getKey());
            }
         }

         return $$0;
      }
   }

   @Override
   public Iterator<jr<?>> iterator() {
      if (this.c.isEmpty()) {
         return this.b.iterator();
      } else {
         List<jr<?>> $$0 = new ArrayList<>(this.c.size() + this.b.d());
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.c).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>>)var2.next();
            if (((Optional)$$1.getValue()).isPresent()) {
               $$0.add(jr.a((jo)$$1.getKey(), ((Optional)$$1.getValue()).get()));
            }
         }

         for (jr<?> $$2 : this.b) {
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
         it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<jo<?>, Optional<?>>)var2.next();
         boolean $$2 = ((Optional)$$1.getValue()).isPresent();
         boolean $$3 = this.b.b((jo<?>)$$1.getKey());
         if ($$2 != $$3) {
            $$0 += $$2 ? 1 : -1;
         }
      }

      return $$0;
   }

   public jm f() {
      if (this.c.isEmpty()) {
         return jm.a;
      } else {
         this.d = true;
         return new jm(this.c);
      }
   }

   public jq g() {
      this.d = true;
      return new jq(this.b, this.c, true);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof jq $$1 && this.b.equals($$1.b) && this.c.equals($$1.c)) {
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
      return "{" + this.c().map(jr::toString).collect(Collectors.joining(", ")) + "}";
   }
}
