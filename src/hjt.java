import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class hjt<T> extends hju<T> {
   private final hjy<T> c;

   public hjt(Function<T, Stream<String>> $$0, Function<T, Stream<aku>> $$1, List<T> $$2) {
      super($$1, $$2);
      this.c = hjy.plainText($$2, $$0);
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
      Iterator<T> $$5 = new hjw<T>($$3.iterator(), $$4.iterator(), this.a);
      return ImmutableList.copyOf(new hjv<T>($$2.iterator(), $$5, this.a));
   }
}
