import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zk<T extends we, B extends ByteBuf> {
   private final vt a;
   private final zg b;
   private final List<zk.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private ze d;

   public zk(vt $$0, zg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zf<? super T>> zk<T, B> a(zh<P> $$0, yw<? super B, P> $$1) {
      this.c.add(new zk.a<>($$0, $$1));
      return this;
   }

   public <P extends zd<? super T>, D extends zc<? super T>> zk<T, B> a(zh<P> $$0, Function<Iterable<zf<? super T>>, P> $$1, D $$2) {
      yw<ByteBuf, D> $$3 = yw.a($$2);
      zh<D> $$4 = (zh<D>)$$2.a();
      this.c.add(new zk.a<>($$4, $$3));
      this.d = ze.a($$0, $$1, $$2);
      return this;
   }

   private yw<ByteBuf, zf<? super T>> a(Function<ByteBuf, B> $$0, List<zk.a<T, ?, B>> $$1) {
      zj<ByteBuf, T> $$2 = new zj<>(this.b);

      for (zk.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wg<T> a(Function<ByteBuf, B> $$0) {
      return new zk.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wg.a<T, B> a() {
      List<zk.a<T, ?, B>> $$0 = List.copyOf(this.c);
      ze $$1 = this.d;
      return $$2 -> new zk.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends we> wg<L> a(vt $$0, zg $$1, Consumer<zk<L, vv>> $$2) {
      zk<L, vv> $$3 = new zk<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(vv::new);
   }

   public static <T extends wk> wg<T> a(vt $$0, Consumer<zk<T, vv>> $$1) {
      return a($$0, zg.a, $$1);
   }

   public static <T extends vp> wg<T> b(vt $$0, Consumer<zk<T, vv>> $$1) {
      return a($$0, zg.b, $$1);
   }

   private static <L extends we, B extends ByteBuf> wg.a<L, B> b(vt $$0, zg $$1, Consumer<zk<L, B>> $$2) {
      zk<L, B> $$3 = new zk<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wk, B extends ByteBuf> wg.a<T, B> c(vt $$0, Consumer<zk<T, B>> $$1) {
      return b($$0, zg.a, $$1);
   }

   public static <T extends vp, B extends ByteBuf> wg.a<T, B> d(vt $$0, Consumer<zk<T, B>> $$1) {
      return b($$0, zg.b, $$1);
   }

   static record a<T extends we, P extends zf<? super T>, B extends ByteBuf>(zh<P> a, yw<? super B, P> b) {
      public void a(zj<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yw<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends we>(vt a, zg b, yw<ByteBuf, zf<? super L>> c, @Nullable ze d) implements wg<L> {
   }
}
