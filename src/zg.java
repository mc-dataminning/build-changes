import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zg<T extends wa, B extends ByteBuf> {
   private final vq a;
   private final zc b;
   private final List<zg.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private za d;

   public zg(vq $$0, zc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zb<? super T>> zg<T, B> a(zd<P> $$0, ys<? super B, P> $$1) {
      this.c.add(new zg.a<>($$0, $$1));
      return this;
   }

   public <P extends yz<? super T>, D extends yy<? super T>> zg<T, B> a(zd<P> $$0, Function<Iterable<zb<? super T>>, P> $$1, D $$2) {
      ys<ByteBuf, D> $$3 = ys.a($$2);
      zd<D> $$4 = (zd<D>)$$2.a();
      this.c.add(new zg.a<>($$4, $$3));
      this.d = za.a($$0, $$1, $$2);
      return this;
   }

   private ys<ByteBuf, zb<? super T>> a(Function<ByteBuf, B> $$0, List<zg.a<T, ?, B>> $$1) {
      zf<ByteBuf, T> $$2 = new zf<>(this.b);

      for (zg.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wc<T> a(Function<ByteBuf, B> $$0) {
      return new zg.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wc.a<T, B> a() {
      List<zg.a<T, ?, B>> $$0 = List.copyOf(this.c);
      za $$1 = this.d;
      return $$2 -> new zg.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends wa> wc<L> a(vq $$0, zc $$1, Consumer<zg<L, vr>> $$2) {
      zg<L, vr> $$3 = new zg<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(vr::new);
   }

   public static <T extends wg> wc<T> a(vq $$0, Consumer<zg<T, vr>> $$1) {
      return a($$0, zc.a, $$1);
   }

   public static <T extends vm> wc<T> b(vq $$0, Consumer<zg<T, vr>> $$1) {
      return a($$0, zc.b, $$1);
   }

   private static <L extends wa, B extends ByteBuf> wc.a<L, B> b(vq $$0, zc $$1, Consumer<zg<L, B>> $$2) {
      zg<L, B> $$3 = new zg<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wg, B extends ByteBuf> wc.a<T, B> c(vq $$0, Consumer<zg<T, B>> $$1) {
      return b($$0, zc.a, $$1);
   }

   public static <T extends vm, B extends ByteBuf> wc.a<T, B> d(vq $$0, Consumer<zg<T, B>> $$1) {
      return b($$0, zc.b, $$1);
   }

   static record a<T extends wa, P extends zb<? super T>, B extends ByteBuf>(zd<P> a, ys<? super B, P> b) {
      public void a(zf<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         ys<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wa>(vq a, zc b, ys<ByteBuf, zb<? super L>> c, @Nullable za d) implements wc<L> {
   }
}
