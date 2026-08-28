import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zt<T extends wn, B extends ByteBuf> {
   final wc a;
   final zp b;
   private final List<zt.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zn d;

   public zt(wc $$0, zp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zo<? super T>> zt<T, B> a(zq<P> $$0, zf<? super B, P> $$1) {
      this.c.add(new zt.a<>($$0, $$1));
      return this;
   }

   public <P extends zm<? super T>, D extends zl<? super T>> zt<T, B> a(zq<P> $$0, Function<Iterable<zo<? super T>>, P> $$1, D $$2) {
      zf<ByteBuf, D> $$3 = zf.a($$2);
      zq<D> $$4 = (zq<D>)$$2.a();
      this.c.add(new zt.a<>($$4, $$3));
      this.d = zn.a($$0, $$1, $$2);
      return this;
   }

   zf<ByteBuf, zo<? super T>> a(Function<ByteBuf, B> $$0, List<zt.a<T, ?, B>> $$1) {
      zs<ByteBuf, T> $$2 = new zs<>(this.b);

      for (zt.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wp<T> a(Function<ByteBuf, B> $$0) {
      return new zt.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wp.a<T, B> a() {
      final List<zt.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zn $$1 = this.d;
      return new wp.a<T, B>() {
         @Override
         public wp<T> a(Function<ByteBuf, B> $$0x) {
            return new zt.b<>(zt.this.a, zt.this.b, zt.this.a($$0, $$0), $$1);
         }

         @Override
         public wc a() {
            return zt.this.a;
         }

         @Override
         public zp b() {
            return zt.this.b;
         }

         @Override
         public void a(wp.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zt.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wn, B extends ByteBuf> wp.a<L, B> a(wc $$0, zp $$1, Consumer<zt<L, B>> $$2) {
      zt<L, B> $$3 = new zt<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wt, B extends ByteBuf> wp.a<T, B> a(wc $$0, Consumer<zt<T, B>> $$1) {
      return a($$0, zp.a, $$1);
   }

   public static <T extends vy, B extends ByteBuf> wp.a<T, B> b(wc $$0, Consumer<zt<T, B>> $$1) {
      return a($$0, zp.b, $$1);
   }

   static record a<T extends wn, P extends zo<? super T>, B extends ByteBuf>(zq<P> a, zf<? super B, P> b) {

      public void a(zs<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zf<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wn>(wc a, zp b, zf<ByteBuf, zo<? super L>> c, @Nullable zn d) implements wp<L> {
   }
}
