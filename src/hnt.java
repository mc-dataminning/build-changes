import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class hnt<T> extends hnu<T> {
   private final hny<T> c;

   public hnt(Function<T, Stream<String>> $$0, Function<T, Stream<alg>> $$1, List<T> $$2) {
      super($$1, $$2);
      this.c = hny.plainText($$2, $$0);
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
      Iterator<T> $$5 = new hnw<T>($$3.iterator(), $$4.iterator(), this.a);
      return ImmutableList.copyOf(new hnv<T>($$2.iterator(), $$5, this.a));
   }
}
