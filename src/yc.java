import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class yc<T extends uw, B extends ByteBuf> {
   private final up a;
   private final xy b;
   private final List<yc.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private xw d;

   public yc(up $$0, xy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends xx<? super T>> yc<T, B> a(xz<P> $$0, xo<? super B, P> $$1) {
      this.c.add(new yc.a<>($$0, $$1));
      return this;
   }

   public <P extends xv<? super T>, D extends xu<? super T>> yc<T, B> a(xz<P> $$0, Function<Iterable<xx<? super T>>, P> $$1, D $$2) {
      xo<ByteBuf, D> $$3 = xo.a($$2);
      xz<D> $$4 = (xz<D>)$$2.a();
      this.c.add(new yc.a<>($$4, $$3));
      this.d = xw.a($$0, $$1, $$2);
      return this;
   }

   private xo<ByteBuf, xx<? super T>> a(Function<ByteBuf, B> $$0, List<yc.a<T, ?, B>> $$1) {
      yb<ByteBuf, T> $$2 = new yb<>(this.b);

      for (yc.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public uy<T> a(Function<ByteBuf, B> $$0) {
      return new yc.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public uy.a<T, B> a() {
      List<yc.a<T, ?, B>> $$0 = List.copyOf(this.c);
      xw $$1 = this.d;
      return $$2 -> new yc.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends uw> uy<L> a(up $$0, xy $$1, Consumer<yc<L, uq>> $$2) {
      yc<L, uq> $$3 = new yc<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(uq::new);
   }

   public static <T extends vc> uy<T> a(up $$0, Consumer<yc<T, uq>> $$1) {
      return a($$0, xy.a, $$1);
   }

   public static <T extends ul> uy<T> b(up $$0, Consumer<yc<T, uq>> $$1) {
      return a($$0, xy.b, $$1);
   }

   private static <L extends uw, B extends ByteBuf> uy.a<L, B> b(up $$0, xy $$1, Consumer<yc<L, B>> $$2) {
      yc<L, B> $$3 = new yc<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends vc, B extends ByteBuf> uy.a<T, B> c(up $$0, Consumer<yc<T, B>> $$1) {
      return b($$0, xy.a, $$1);
   }

   public static <T extends ul, B extends ByteBuf> uy.a<T, B> d(up $$0, Consumer<yc<T, B>> $$1) {
      return b($$0, xy.b, $$1);
   }

   static record a<T extends uw, P extends xx<? super T>, B extends ByteBuf>(xz<P> a, xo<? super B, P> b) {
      public void a(yb<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         xo<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends uw>(up a, xy b, xo<ByteBuf, xx<? super L>> c, @Nullable xw d) implements uy<L> {
   }
}
