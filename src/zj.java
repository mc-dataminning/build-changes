import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zj<T extends wd, B extends ByteBuf> {
   private final vw a;
   private final zf b;
   private final List<zj.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zd d;

   public zj(vw $$0, zf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends ze<? super T>> zj<T, B> a(zg<P> $$0, yv<? super B, P> $$1) {
      this.c.add(new zj.a<>($$0, $$1));
      return this;
   }

   public <P extends zc<? super T>, D extends zb<? super T>> zj<T, B> a(zg<P> $$0, Function<Iterable<ze<? super T>>, P> $$1, D $$2) {
      yv<ByteBuf, D> $$3 = yv.a($$2);
      zg<D> $$4 = (zg<D>)$$2.a();
      this.c.add(new zj.a<>($$4, $$3));
      this.d = zd.a($$0, $$1, $$2);
      return this;
   }

   private yv<ByteBuf, ze<? super T>> a(Function<ByteBuf, B> $$0, List<zj.a<T, ?, B>> $$1) {
      zi<ByteBuf, T> $$2 = new zi<>(this.b);

      for (zj.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wf<T> a(Function<ByteBuf, B> $$0) {
      return new zj.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wf.a<T, B> a() {
      List<zj.a<T, ?, B>> $$0 = List.copyOf(this.c);
      zd $$1 = this.d;
      return $$2 -> new zj.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends wd> wf<L> a(vw $$0, zf $$1, Consumer<zj<L, vx>> $$2) {
      zj<L, vx> $$3 = new zj<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(vx::new);
   }

   public static <T extends wj> wf<T> a(vw $$0, Consumer<zj<T, vx>> $$1) {
      return a($$0, zf.a, $$1);
   }

   public static <T extends vs> wf<T> b(vw $$0, Consumer<zj<T, vx>> $$1) {
      return a($$0, zf.b, $$1);
   }

   private static <L extends wd, B extends ByteBuf> wf.a<L, B> b(vw $$0, zf $$1, Consumer<zj<L, B>> $$2) {
      zj<L, B> $$3 = new zj<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wj, B extends ByteBuf> wf.a<T, B> c(vw $$0, Consumer<zj<T, B>> $$1) {
      return b($$0, zf.a, $$1);
   }

   public static <T extends vs, B extends ByteBuf> wf.a<T, B> d(vw $$0, Consumer<zj<T, B>> $$1) {
      return b($$0, zf.b, $$1);
   }

   static record a<T extends wd, P extends ze<? super T>, B extends ByteBuf>(zg<P> a, yv<? super B, P> b) {
      public void a(zi<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yv<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wd>(vw a, zf b, yv<ByteBuf, ze<? super L>> c, @Nullable zd d) implements wf<L> {
   }
}
