import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ys<T extends vm, B extends ByteBuf> {
   private final vf a;
   private final yo b;
   private final List<ys.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private ym d;

   public ys(vf $$0, yo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends yn<? super T>> ys<T, B> a(yp<P> $$0, ye<? super B, P> $$1) {
      this.c.add(new ys.a<>($$0, $$1));
      return this;
   }

   public <P extends yl<? super T>, D extends yk<? super T>> ys<T, B> a(yp<P> $$0, Function<Iterable<yn<? super T>>, P> $$1, D $$2) {
      ye<ByteBuf, D> $$3 = ye.a($$2);
      yp<D> $$4 = (yp<D>)$$2.a();
      this.c.add(new ys.a<>($$4, $$3));
      this.d = ym.a($$0, $$1, $$2);
      return this;
   }

   private ye<ByteBuf, yn<? super T>> a(Function<ByteBuf, B> $$0, List<ys.a<T, ?, B>> $$1) {
      yr<ByteBuf, T> $$2 = new yr<>(this.b);

      for (ys.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public vo<T> a(Function<ByteBuf, B> $$0) {
      return new ys.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public vo.a<T, B> a() {
      List<ys.a<T, ?, B>> $$0 = List.copyOf(this.c);
      ym $$1 = this.d;
      return $$2 -> new ys.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends vm> vo<L> a(vf $$0, yo $$1, Consumer<ys<L, vg>> $$2) {
      ys<L, vg> $$3 = new ys<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(vg::new);
   }

   public static <T extends vs> vo<T> a(vf $$0, Consumer<ys<T, vg>> $$1) {
      return a($$0, yo.a, $$1);
   }

   public static <T extends vb> vo<T> b(vf $$0, Consumer<ys<T, vg>> $$1) {
      return a($$0, yo.b, $$1);
   }

   private static <L extends vm, B extends ByteBuf> vo.a<L, B> b(vf $$0, yo $$1, Consumer<ys<L, B>> $$2) {
      ys<L, B> $$3 = new ys<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends vs, B extends ByteBuf> vo.a<T, B> c(vf $$0, Consumer<ys<T, B>> $$1) {
      return b($$0, yo.a, $$1);
   }

   public static <T extends vb, B extends ByteBuf> vo.a<T, B> d(vf $$0, Consumer<ys<T, B>> $$1) {
      return b($$0, yo.b, $$1);
   }

   static record a<T extends vm, P extends yn<? super T>, B extends ByteBuf>(yp<P> a, ye<? super B, P> b) {
      public void a(yr<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         ye<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends vm>(vf a, yo b, ye<ByteBuf, yn<? super L>> c, @Nullable ym d) implements vo<L> {
   }
}
