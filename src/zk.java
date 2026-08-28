import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zk<T extends we, B extends ByteBuf> {
   final vs a;
   final zg b;
   private final List<zk.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private ze d;

   public zk(vs $$0, zg $$1) {
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

   yw<ByteBuf, zf<? super T>> a(Function<ByteBuf, B> $$0, List<zk.a<T, ?, B>> $$1) {
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
      final List<zk.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final ze $$1 = this.d;
      return new wg.a<T, B>() {
         @Override
         public wg<T> a(Function<ByteBuf, B> $$0x) {
            return new zk.b<>(zk.this.a, zk.this.b, zk.this.a($$0, $$0), $$1);
         }

         @Override
         public vs a() {
            return zk.this.a;
         }

         @Override
         public zg b() {
            return zk.this.b;
         }

         @Override
         public void a(wg.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zk.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends we, B extends ByteBuf> wg.a<L, B> a(vs $$0, zg $$1, Consumer<zk<L, B>> $$2) {
      zk<L, B> $$3 = new zk<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wk, B extends ByteBuf> wg.a<T, B> a(vs $$0, Consumer<zk<T, B>> $$1) {
      return a($$0, zg.a, $$1);
   }

   public static <T extends vo, B extends ByteBuf> wg.a<T, B> b(vs $$0, Consumer<zk<T, B>> $$1) {
      return a($$0, zg.b, $$1);
   }

   static record a<T extends we, P extends zf<? super T>, B extends ByteBuf>(zh<P> a, yw<? super B, P> b) {

      public void a(zj<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yw<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends we>(vs a, zg b, yw<ByteBuf, zf<? super L>> c, @Nullable ze d) implements wg<L> {
   }
}
