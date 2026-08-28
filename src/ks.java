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

public final class ks implements kn {
   private final kn c;
   private Reference2ObjectMap<kq<?>, Optional<?>> d;
   private boolean e;

   public ks(kn $$0) {
      this($$0, Reference2ObjectMaps.emptyMap(), true);
   }

   private ks(kn $$0, Reference2ObjectMap<kq<?>, Optional<?>> $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ks a(kn $$0, ko $$1) {
      if (a($$0, $$1.d)) {
         return new ks($$0, $$1.d, true);
      } else {
         ks $$2 = new ks($$0);
         $$2.a($$1);
         return $$2;
      }
   }

   private static boolean a(kn $$0, Reference2ObjectMap<kq<?>, Optional<?>> $$1) {
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$1).iterator();

      while (var2.hasNext()) {
         Entry<kq<?>, Optional<?>> $$2 = (Entry<kq<?>, Optional<?>>)var2.next();
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
   public <T> T a(kq<? extends T> $$0) {
      Optional<? extends T> $$1 = (Optional<? extends T>)this.d.get($$0);
      return (T)($$1 != null ? $$1.orElse(null) : this.c.a($$0));
   }

   @Nullable
   public <T> T b(kq<? super T> $$0, @Nullable T $$1) {
      this.i();
      T $$2 = this.c.a((kq<? extends T>)$$0);
      Optional<T> $$3;
      if (Objects.equals($$1, $$2)) {
         $$3 = (Optional<T>)this.d.remove($$0);
      } else {
         $$3 = (Optional<T>)this.d.put($$0, Optional.ofNullable($$1));
      }

      return $$3 != null ? $$3.orElse($$2) : $$2;
   }

   @Nullable
   public <T> T d(kq<? extends T> $$0) {
      this.i();
      T $$1 = this.c.a($$0);
      Optional<? extends T> $$2;
      if ($$1 != null) {
         $$2 = (Optional<? extends T>)this.d.put($$0, Optional.empty());
      } else {
         $$2 = (Optional<? extends T>)this.d.remove($$0);
      }

      return (T)($$2 != null ? $$2.orElse(null) : $$1);
   }

   public void a(ko $$0) {
      this.i();
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.d).iterator();

      while (var2.hasNext()) {
         Entry<kq<?>, Optional<?>> $$1 = (Entry<kq<?>, Optional<?>>)var2.next();
         this.a($$1.getKey(), $$1.getValue());
      }
   }

   private void a(kq<?> $$0, Optional<?> $$1) {
      Object $$2 = this.c.a($$0);
      if ($$1.isPresent()) {
         if ($$1.get().equals($$2)) {
            this.d.remove($$0);
         } else {
            this.d.put($$0, $$1);
         }
      } else if ($$2 != null) {
         this.d.put($$0, Optional.empty());
      } else {
         this.d.remove($$0);
      }
   }

   public void b(ko $$0) {
      this.i();
      this.d.clear();
      this.d.putAll($$0.d);
   }

   public void f() {
      this.i();
      this.d.clear();
   }

   public void a(kn $$0) {
      for (kt<?> $$1 : $$0) {
         $$1.a(this);
      }
   }

   private void i() {
      if (this.e) {
         this.d = new Reference2ObjectArrayMap(this.d);
         this.e = false;
      }
   }

   @Override
   public Set<kq<?>> b() {
      if (this.d.isEmpty()) {
         return this.c.b();
      } else {
         Set<kq<?>> $$0 = new ReferenceArraySet(this.c.b());
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.d).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>>)var2.next();
            Optional<?> $$2 = (Optional<?>)$$1.getValue();
            if ($$2.isPresent()) {
               $$0.add((kq<?>)$$1.getKey());
            } else {
               $$0.remove($$1.getKey());
            }
         }

         return $$0;
      }
   }

   @Override
   public Iterator<kt<?>> iterator() {
      if (this.d.isEmpty()) {
         return this.c.iterator();
      } else {
         List<kt<?>> $$0 = new ArrayList<>(this.d.size() + this.c.d());
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.d).iterator();

         while (var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>>)var2.next();
            if (((Optional)$$1.getValue()).isPresent()) {
               $$0.add(kt.a((kq)$$1.getKey(), ((Optional)$$1.getValue()).get()));
            }
         }

         for (kt<?> $$2 : this.c) {
            if (!this.d.containsKey($$2.a())) {
               $$0.add($$2);
            }
         }

         return $$0.iterator();
      }
   }

   @Override
   public int d() {
      int $$0 = this.c.d();
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.d).iterator();

      while (var2.hasNext()) {
         it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>> $$1 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kq<?>, Optional<?>>)var2.next();
         boolean $$2 = ((Optional)$$1.getValue()).isPresent();
         boolean $$3 = this.c.b((kq<?>)$$1.getKey());
         if ($$2 != $$3) {
            $$0 += $$2 ? 1 : -1;
         }
      }

      return $$0;
   }

   public ko g() {
      if (this.d.isEmpty()) {
         return ko.a;
      } else {
         this.e = true;
         return new ko(this.d);
      }
   }

   public ks h() {
      this.e = true;
      return new ks(this.c, this.d, true);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ks $$1 && this.c.equals($$1.c) && this.d.equals($$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.c.hashCode() + this.d.hashCode() * 31;
   }

   @Override
   public String toString() {
      return "{" + this.c().map(kt::toString).collect(Collectors.joining(", ")) + "}";
   }
}
