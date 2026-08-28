import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class hbu<T> extends hbv<T> {
   private final hbz<T> c;

   public hbu(Function<T, Stream<String>> $$0, Function<T, Stream<alh>> $$1, List<T> $$2) {
      super($$1, $$2);
      this.c = hbz.plainText($$2, $$0);
   }

   @Override
   protected List<T> a(String $$0) {
      return this.c.search($$0);
   }

   @Override
   protected List<T> a(String $$0, String $$1) {
      List<T> $$2 = this.b.a($$0);
      List<T> $$3 = this.b.b($$1);
      List<T> $$4 = this.c.search($$1);
      Iterator<T> $$5 = new hbx<T>($$3.iterator(), $$4.iterator(), this.a);
      return ImmutableList.copyOf(new hbw<T>($$2.iterator(), $$5, this.a));
   }
}
