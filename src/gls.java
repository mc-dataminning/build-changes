import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class gls<T> implements glw<T> {
   protected final Comparator<T> a;
   protected final glx<T> b;

   public gls(Function<T, Stream<ajc>> $$0, List<T> $$1) {
      ToIntFunction<T> $$2 = ac.g($$1);
      this.a = Comparator.comparingInt($$2);
      this.b = glx.a($$1, $$0);
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
      return ImmutableList.copyOf(new glt<T>($$2.iterator(), $$3.iterator(), this.a));
   }
}
