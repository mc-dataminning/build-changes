import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class il<E> extends AbstractList<E> {
   private final List<E> a;
   @Nullable
   private final E b;

   public static <E> il<E> a() {
      return new il<>(Lists.newArrayList(), null);
   }

   public static <E> il<E> a(int $$0) {
      return new il<>(Lists.newArrayListWithCapacity($$0), null);
   }

   public static <E> il<E> a(int $$0, E $$1) {
      Validate.notNull($$1);
      Object[] $$2 = new Object[$$0];
      Arrays.fill($$2, $$1);
      return new il<>(Arrays.asList((E[])$$2), $$1);
   }

   @SafeVarargs
   public static <E> il<E> a(E $$0, E... $$1) {
      return new il<>(Arrays.asList($$1), $$0);
   }

   protected il(List<E> $$0, @Nullable E $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nonnull
   @Override
   public E get(int $$0) {
      return this.a.get($$0);
   }

   @Override
   public E set(int $$0, E $$1) {
      Validate.notNull($$1);
      return this.a.set($$0, $$1);
   }

   @Override
   public void add(int $$0, E $$1) {
      Validate.notNull($$1);
      this.a.add($$0, $$1);
   }

   @Override
   public E remove(int $$0) {
      return this.a.remove($$0);
   }

   @Override
   public int size() {
      return this.a.size();
   }

   @Override
   public void clear() {
      if (this.b == null) {
         super.clear();
      } else {
         for (int $$0 = 0; $$0 < this.size(); $$0++) {
            this.set($$0, this.b);
         }
      }
   }
}
