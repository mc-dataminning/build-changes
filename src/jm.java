import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class jm<T> implements jl<T> {
   private int b;
   private final Reference2IntMap<T> c;
   private final List<T> d;

   public jm() {
      this(512);
   }

   public jm(int $$0) {
      this.d = Lists.newArrayListWithExpectedSize($$0);
      this.c = new Reference2IntOpenHashMap($$0);
      this.c.defaultReturnValue(-1);
   }

   public void a(T $$0, int $$1) {
      this.c.put($$0, $$1);

      while (this.d.size() <= $$1) {
         this.d.add(null);
      }

      this.d.set($$1, $$0);
      if (this.b <= $$1) {
         this.b = $$1 + 1;
      }
   }

   public void b(T $$0) {
      this.a($$0, this.b);
   }

   @Override
   public int a(T $$0) {
      return this.c.getInt($$0);
   }

   @Nullable
   @Override
   public final T a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : null;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.d.iterator(), Objects::nonNull);
   }

   public boolean c(int $$0) {
      return this.a($$0) != null;
   }

   @Override
   public int d() {
      return this.c.size();
   }
}
