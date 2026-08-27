import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class je<E> extends AbstractList<E> {
   private final List<E> a;
   @Nullable
   private final E b;

   public static <E> je<E> a() {
      return new je<>(Lists.newArrayList(), null);
   }

   public static <E> je<E> a(int $$0) {
      return new je<>(Lists.newArrayListWithCapacity($$0), null);
   }

   public static <E> je<E> a(int $$0, E $$1) {
      Validate.notNull($$1);
      Object[] $$2 = new Object[$$0];
      Arrays.fill($$2, $$1);
      return new je<>(Arrays.asList((E[])$$2), $$1);
   }

   @SafeVarargs
   public static <E> je<E> a(E $$0, E... $$1) {
      return new je<>(Arrays.asList($$1), $$0);
   }

   protected je(List<E> $$0, @Nullable E $$1) {
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
