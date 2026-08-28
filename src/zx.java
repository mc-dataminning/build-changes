import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zx<T extends wr, B extends ByteBuf> {
   final wg a;
   final zt b;
   private final List<zx.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zr d;

   public zx(wg $$0, zt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zs<? super T>> zx<T, B> a(zu<P> $$0, zj<? super B, P> $$1) {
      this.c.add(new zx.a<>($$0, $$1));
      return this;
   }

   public <P extends zq<? super T>, D extends zp<? super T>> zx<T, B> a(zu<P> $$0, Function<Iterable<zs<? super T>>, P> $$1, D $$2) {
      zj<ByteBuf, D> $$3 = zj.a($$2);
      zu<D> $$4 = (zu<D>)$$2.a();
      this.c.add(new zx.a<>($$4, $$3));
      this.d = zr.a($$0, $$1, $$2);
      return this;
   }

   zj<ByteBuf, zs<? super T>> a(Function<ByteBuf, B> $$0, List<zx.a<T, ?, B>> $$1) {
      zw<ByteBuf, T> $$2 = new zw<>(this.b);

      for (zx.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wt<T> a(Function<ByteBuf, B> $$0) {
      return new zx.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wt.a<T, B> a() {
      final List<zx.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zr $$1 = this.d;
      return new wt.a<T, B>() {
         @Override
         public wt<T> a(Function<ByteBuf, B> $$0x) {
            return new zx.b<>(zx.this.a, zx.this.b, zx.this.a($$0, $$0), $$1);
         }

         @Override
         public wg a() {
            return zx.this.a;
         }

         @Override
         public zt b() {
            return zx.this.b;
         }

         @Override
         public void a(wt.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zx.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wr, B extends ByteBuf> wt.a<L, B> a(wg $$0, zt $$1, Consumer<zx<L, B>> $$2) {
      zx<L, B> $$3 = new zx<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wx, B extends ByteBuf> wt.a<T, B> a(wg $$0, Consumer<zx<T, B>> $$1) {
      return a($$0, zt.a, $$1);
   }

   public static <T extends wc, B extends ByteBuf> wt.a<T, B> b(wg $$0, Consumer<zx<T, B>> $$1) {
      return a($$0, zt.b, $$1);
   }

   static record a<T extends wr, P extends zs<? super T>, B extends ByteBuf>(zu<P> a, zj<? super B, P> b) {

      public void a(zw<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zj<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wr>(wg a, zt b, zj<ByteBuf, zs<? super L>> c, @Nullable zr d) implements wt<L> {
   }
}
