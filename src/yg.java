import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class yg<T extends va, B extends ByteBuf> {
   private final ut a;
   private final yc b;
   private final List<yg.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private ya d;

   public yg(ut $$0, yc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends yb<? super T>> yg<T, B> a(yd<P> $$0, xs<? super B, P> $$1) {
      this.c.add(new yg.a<>($$0, $$1));
      return this;
   }

   public <P extends xz<? super T>, D extends xy<? super T>> yg<T, B> a(yd<P> $$0, Function<Iterable<yb<? super T>>, P> $$1, D $$2) {
      xs<ByteBuf, D> $$3 = xs.a($$2);
      yd<D> $$4 = (yd<D>)$$2.a();
      this.c.add(new yg.a<>($$4, $$3));
      this.d = ya.a($$0, $$1, $$2);
      return this;
   }

   private xs<ByteBuf, yb<? super T>> a(Function<ByteBuf, B> $$0, List<yg.a<T, ?, B>> $$1) {
      yf<ByteBuf, T> $$2 = new yf<>(this.b);

      for (yg.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public vc<T> a(Function<ByteBuf, B> $$0) {
      return new yg.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public vc.a<T, B> a() {
      List<yg.a<T, ?, B>> $$0 = List.copyOf(this.c);
      ya $$1 = this.d;
      return $$2 -> new yg.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends va> vc<L> a(ut $$0, yc $$1, Consumer<yg<L, uu>> $$2) {
      yg<L, uu> $$3 = new yg<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(uu::new);
   }

   public static <T extends vg> vc<T> a(ut $$0, Consumer<yg<T, uu>> $$1) {
      return a($$0, yc.a, $$1);
   }

   public static <T extends up> vc<T> b(ut $$0, Consumer<yg<T, uu>> $$1) {
      return a($$0, yc.b, $$1);
   }

   private static <L extends va, B extends ByteBuf> vc.a<L, B> b(ut $$0, yc $$1, Consumer<yg<L, B>> $$2) {
      yg<L, B> $$3 = new yg<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends vg, B extends ByteBuf> vc.a<T, B> c(ut $$0, Consumer<yg<T, B>> $$1) {
      return b($$0, yc.a, $$1);
   }

   public static <T extends up, B extends ByteBuf> vc.a<T, B> d(ut $$0, Consumer<yg<T, B>> $$1) {
      return b($$0, yc.b, $$1);
   }

   static record a<T extends va, P extends yb<? super T>, B extends ByteBuf>(yd<P> a, xs<? super B, P> b) {
      public void a(yf<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         xs<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends va>(ut a, yc b, xs<ByteBuf, yb<? super L>> c, @Nullable ya d) implements vc<L> {
   }
}
