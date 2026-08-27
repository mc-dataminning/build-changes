import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class gqg<T> extends gqh<T> {
   private final List<T> c;
   private final Function<T, Stream<String>> d;
   private gqk<T> e = gqk.a();

   public gqg(Function<T, Stream<String>> $$0, Function<T, Stream<akf>> $$1, List<T> $$2) {
      super($$1, $$2);
      this.c = $$2;
      this.d = $$0;
   }

   @Override
   public void a() {
      super.a();
      this.e = gqk.a(this.c, this.d);
   }

   @Override
   protected List<T> a(String $$0) {
      return this.e.search($$0);
   }

   @Override
   protected List<T> a(String $$0, String $$1) {
      List<T> $$2 = this.b.a($$0);
      List<T> $$3 = this.b.b($$1);
      List<T> $$4 = this.e.search($$1);
      Iterator<T> $$5 = new gqj<T>($$3.iterator(), $$4.iterator(), this.a);
      return ImmutableList.copyOf(new gqi<T>($$2.iterator(), $$5, this.a));
   }
}
