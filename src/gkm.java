import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class gkm<T> implements gkq<T> {
   protected final Comparator<T> a;
   protected final gkr<T> b;

   public gkm(Function<T, Stream<aiy>> $$0, List<T> $$1) {
      ToIntFunction<T> $$2 = ac.e($$1);
      this.a = Comparator.comparingInt($$2);
      this.b = gkr.a($$1, $$0);
   }

   @Override
   public List<T> search(String $$0) {
      int $$1 = $$0.indexOf(58);
      return $$1 == -1 ? this.a($$0) : this.a($$0.substring(0, $$1).trim(), $$0.substring($$1 + 1).trim());
   }

   protected List<T> a(String $$0) {
      return this.b.b($$0);
   }

   protected List<T> a(String $$0, String $$1) {
      List<T> $$2 = this.b.a($$0);
      List<T> $$3 = this.b.b($$1);
      return ImmutableList.copyOf(new gkn<T>($$2.iterator(), $$3.iterator(), this.a));
   }
}
