import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class hit<T> extends hiu<T> {
   private final hiy<T> c;

   public hit(Function<T, Stream<String>> $$0, Function<T, Stream<akv>> $$1, List<T> $$2) {
      super($$1, $$2);
      this.c = hiy.plainText($$2, $$0);
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
      Iterator<T> $$5 = new hiw<T>($$3.iterator(), $$4.iterator(), this.a);
      return ImmutableList.copyOf(new hiv<T>($$2.iterator(), $$5, this.a));
   }
}
