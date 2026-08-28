import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class hfm<T> extends hfn<T> {
   private final hfr<T> c;

   public hfm(Function<T, Stream<String>> $$0, Function<T, Stream<alz>> $$1, List<T> $$2) {
      super($$1, $$2);
      this.c = hfr.plainText($$2, $$0);
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
      Iterator<T> $$5 = new hfp<T>($$3.iterator(), $$4.iterator(), this.a);
      return ImmutableList.copyOf(new hfo<T>($$2.iterator(), $$5, this.a));
   }
}
