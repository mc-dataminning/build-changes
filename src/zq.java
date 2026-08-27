import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zq<T extends wk, B extends ByteBuf> {
   private final wd a;
   private final zm b;
   private final List<zq.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zk d;

   public zq(wd $$0, zm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zl<? super T>> zq<T, B> a(zn<P> $$0, zc<? super B, P> $$1) {
      this.c.add(new zq.a<>($$0, $$1));
      return this;
   }

   public <P extends zj<? super T>, D extends zi<? super T>> zq<T, B> a(zn<P> $$0, Function<Iterable<zl<? super T>>, P> $$1, D $$2) {
      zc<ByteBuf, D> $$3 = zc.a($$2);
      zn<D> $$4 = (zn<D>)$$2.a();
      this.c.add(new zq.a<>($$4, $$3));
      this.d = zk.a($$0, $$1, $$2);
      return this;
   }

   private zc<ByteBuf, zl<? super T>> a(Function<ByteBuf, B> $$0, List<zq.a<T, ?, B>> $$1) {
      zp<ByteBuf, T> $$2 = new zp<>(this.b);

      for (zq.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wm<T> a(Function<ByteBuf, B> $$0) {
      return new zq.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wm.a<T, B> a() {
      List<zq.a<T, ?, B>> $$0 = List.copyOf(this.c);
      zk $$1 = this.d;
      return $$2 -> new zq.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends wk> wm<L> a(wd $$0, zm $$1, Consumer<zq<L, we>> $$2) {
      zq<L, we> $$3 = new zq<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(we::new);
   }

   public static <T extends wq> wm<T> a(wd $$0, Consumer<zq<T, we>> $$1) {
      return a($$0, zm.a, $$1);
   }

   public static <T extends vz> wm<T> b(wd $$0, Consumer<zq<T, we>> $$1) {
      return a($$0, zm.b, $$1);
   }

   private static <L extends wk, B extends ByteBuf> wm.a<L, B> b(wd $$0, zm $$1, Consumer<zq<L, B>> $$2) {
      zq<L, B> $$3 = new zq<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wq, B extends ByteBuf> wm.a<T, B> c(wd $$0, Consumer<zq<T, B>> $$1) {
      return b($$0, zm.a, $$1);
   }

   public static <T extends vz, B extends ByteBuf> wm.a<T, B> d(wd $$0, Consumer<zq<T, B>> $$1) {
      return b($$0, zm.b, $$1);
   }

   static record a<T extends wk, P extends zl<? super T>, B extends ByteBuf>(zn<P> a, zc<? super B, P> b) {
      public void a(zp<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zc<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wk>(wd a, zm b, zc<ByteBuf, zl<? super L>> c, @Nullable zk d) implements wm<L> {
   }
}
