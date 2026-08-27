import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ghs<T> extends ght<T> {
   private final List<T> c;
   private final Function<T, Stream<String>> d;
   private ghw<T> e = ghw.a();

   public ghs(Function<T, Stream<String>> $$0, Function<T, Stream<ahd>> $$1, List<T> $$2) {
      super($$1, $$2);
      this.c = $$2;
      this.d = $$0;
   }

   @Override
   public void a() {
      super.a();
      this.e = ghw.a(this.c, this.d);
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
      Iterator<T> $$5 = new ghv<T>($$3.iterator(), $$4.iterator(), this.a);
      return ImmutableList.copyOf(new ghu<T>($$2.iterator(), $$5, this.a));
   }
}
