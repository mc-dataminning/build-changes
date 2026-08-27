import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ye<T extends uy, B extends ByteBuf> {
   private final ur a;
   private final ya b;
   private final List<ye.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private xy d;

   public ye(ur $$0, ya $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends xz<? super T>> ye<T, B> a(yb<P> $$0, xq<? super B, P> $$1) {
      this.c.add(new ye.a<>($$0, $$1));
      return this;
   }

   public <P extends xx<? super T>, D extends xw<? super T>> ye<T, B> a(yb<P> $$0, Function<Iterable<xz<? super T>>, P> $$1, D $$2) {
      xq<ByteBuf, D> $$3 = xq.a($$2);
      yb<D> $$4 = (yb<D>)$$2.a();
      this.c.add(new ye.a<>($$4, $$3));
      this.d = xy.a($$0, $$1, $$2);
      return this;
   }

   private xq<ByteBuf, xz<? super T>> a(Function<ByteBuf, B> $$0, List<ye.a<T, ?, B>> $$1) {
      yd<ByteBuf, T> $$2 = new yd<>(this.b);

      for (ye.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public va<T> a(Function<ByteBuf, B> $$0) {
      return new ye.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public va.a<T, B> a() {
      List<ye.a<T, ?, B>> $$0 = List.copyOf(this.c);
      xy $$1 = this.d;
      return $$2 -> new ye.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends uy> va<L> a(ur $$0, ya $$1, Consumer<ye<L, us>> $$2) {
      ye<L, us> $$3 = new ye<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(us::new);
   }

   public static <T extends ve> va<T> a(ur $$0, Consumer<ye<T, us>> $$1) {
      return a($$0, ya.a, $$1);
   }

   public static <T extends un> va<T> b(ur $$0, Consumer<ye<T, us>> $$1) {
      return a($$0, ya.b, $$1);
   }

   private static <L extends uy, B extends ByteBuf> va.a<L, B> b(ur $$0, ya $$1, Consumer<ye<L, B>> $$2) {
      ye<L, B> $$3 = new ye<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends ve, B extends ByteBuf> va.a<T, B> c(ur $$0, Consumer<ye<T, B>> $$1) {
      return b($$0, ya.a, $$1);
   }

   public static <T extends un, B extends ByteBuf> va.a<T, B> d(ur $$0, Consumer<ye<T, B>> $$1) {
      return b($$0, ya.b, $$1);
   }

   static record a<T extends uy, P extends xz<? super T>, B extends ByteBuf>(yb<P> a, xq<? super B, P> b) {
      public void a(yd<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         xq<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends uy>(ur a, ya b, xq<ByteBuf, xz<? super L>> c, @Nullable xy d) implements va<L> {
   }
}
