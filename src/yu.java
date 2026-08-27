import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class yu<T extends vo, B extends ByteBuf> {
   private final vh a;
   private final yq b;
   private final List<yu.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private yo d;

   public yu(vh $$0, yq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends yp<? super T>> yu<T, B> a(yr<P> $$0, yg<? super B, P> $$1) {
      this.c.add(new yu.a<>($$0, $$1));
      return this;
   }

   public <P extends yn<? super T>, D extends ym<? super T>> yu<T, B> a(yr<P> $$0, Function<Iterable<yp<? super T>>, P> $$1, D $$2) {
      yg<ByteBuf, D> $$3 = yg.a($$2);
      yr<D> $$4 = (yr<D>)$$2.a();
      this.c.add(new yu.a<>($$4, $$3));
      this.d = yo.a($$0, $$1, $$2);
      return this;
   }

   private yg<ByteBuf, yp<? super T>> a(Function<ByteBuf, B> $$0, List<yu.a<T, ?, B>> $$1) {
      yt<ByteBuf, T> $$2 = new yt<>(this.b);

      for (yu.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public vq<T> a(Function<ByteBuf, B> $$0) {
      return new yu.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public vq.a<T, B> a() {
      List<yu.a<T, ?, B>> $$0 = List.copyOf(this.c);
      yo $$1 = this.d;
      return $$2 -> new yu.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends vo> vq<L> a(vh $$0, yq $$1, Consumer<yu<L, vi>> $$2) {
      yu<L, vi> $$3 = new yu<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(vi::new);
   }

   public static <T extends vu> vq<T> a(vh $$0, Consumer<yu<T, vi>> $$1) {
      return a($$0, yq.a, $$1);
   }

   public static <T extends vd> vq<T> b(vh $$0, Consumer<yu<T, vi>> $$1) {
      return a($$0, yq.b, $$1);
   }

   private static <L extends vo, B extends ByteBuf> vq.a<L, B> b(vh $$0, yq $$1, Consumer<yu<L, B>> $$2) {
      yu<L, B> $$3 = new yu<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends vu, B extends ByteBuf> vq.a<T, B> c(vh $$0, Consumer<yu<T, B>> $$1) {
      return b($$0, yq.a, $$1);
   }

   public static <T extends vd, B extends ByteBuf> vq.a<T, B> d(vh $$0, Consumer<yu<T, B>> $$1) {
      return b($$0, yq.b, $$1);
   }

   static record a<T extends vo, P extends yp<? super T>, B extends ByteBuf>(yr<P> a, yg<? super B, P> b) {
      public void a(yt<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yg<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends vo>(vh a, yq b, yg<ByteBuf, yp<? super L>> c, @Nullable yo d) implements vq<L> {
   }
}
