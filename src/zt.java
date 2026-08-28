import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zt<T extends wk, B extends ByteBuf, C> {
   final vw a;
   final zp b;
   private final List<zt.a<T, ?, B, C>> c = new ArrayList<>();
   @Nullable
   private zm d;

   public zt(vw $$0, zp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zo<? super T>> zt<T, B, C> a(zq<P> $$0, ze<? super B, P> $$1) {
      this.c.add(new zt.a<>($$0, $$1, null));
      return this;
   }

   public <P extends zo<? super T>> zt<T, B, C> a(zq<P> $$0, ze<? super B, P> $$1, zn<B, P, C> $$2) {
      this.c.add(new zt.a<>($$0, $$1, $$2));
      return this;
   }

   public <P extends zl<? super T>, D extends zk<? super T>> zt<T, B, C> a(zq<P> $$0, Function<Iterable<zo<? super T>>, P> $$1, D $$2) {
      ze<ByteBuf, D> $$3 = ze.a($$2);
      zq<D> $$4 = (zq<D>)$$2.a();
      this.c.add(new zt.a<>($$4, $$3, null));
      this.d = zm.a($$0, $$1, $$2);
      return this;
   }

   ze<ByteBuf, zo<? super T>> a(Function<ByteBuf, B> $$0, List<zt.a<T, ?, B, C>> $$1, C $$2) {
      zs<ByteBuf, T> $$3 = new zs<>(this.b);

      for (zt.a<T, ?, B, C> $$4 : $$1) {
         $$4.a($$3, $$0, $$2);
      }

      return $$3.a();
   }

   private static wm.a a(final vw $$0, final zp $$1, final List<? extends zt.a<?, ?, ?, ?>> $$2) {
      return new wm.a() {
         @Override
         public vw a() {
            return $$0;
         }

         @Override
         public zp b() {
            return $$1;
         }

         @Override
         public void a(wm.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$2.size(); $$1++) {
               zt.a<?, ?, ?, ?> $$2 = (zt.a<?, ?, ?, ?>)$$2.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   public zu<T, B> a(final C $$0) {
      final List<zt.a<T, ?, B, C>> $$1 = List.copyOf(this.c);
      final zm $$2 = this.d;
      final wm.a $$3 = a(this.a, this.b, $$1);
      return new zu<T, B>() {
         @Override
         public wm<T> a(Function<ByteBuf, B> $$0x) {
            return new zt.b<>(zt.this.a, zt.this.b, zt.this.a($$0, $$1, $$0), $$2);
         }

         @Override
         public wm.a a() {
            return $$3;
         }
      };
   }

   public zv<T, B, C> a() {
      final List<zt.a<T, ?, B, C>> $$0 = List.copyOf(this.c);
      final zm $$1 = this.d;
      final wm.a $$2 = a(this.a, this.b, $$0);
      return new zv<T, B, C>() {
         @Override
         public wm<T> a(Function<ByteBuf, B> $$0x, C $$1x) {
            return new zt.b<>(zt.this.a, zt.this.b, zt.this.a($$0, $$0, $$1), $$1);
         }

         @Override
         public wm.a a() {
            return $$2;
         }
      };
   }

   private static <L extends wk, B extends ByteBuf> zu<L, B> a(vw $$0, zp $$1, Consumer<zt<L, B, bbh>> $$2) {
      zt<L, B, bbh> $$3 = new zt<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(bbh.a);
   }

   public static <T extends wq, B extends ByteBuf> zu<T, B> a(vw $$0, Consumer<zt<T, B, bbh>> $$1) {
      return a($$0, zp.a, $$1);
   }

   public static <T extends vs, B extends ByteBuf> zu<T, B> b(vw $$0, Consumer<zt<T, B, bbh>> $$1) {
      return a($$0, zp.b, $$1);
   }

   private static <L extends wk, B extends ByteBuf, C> zv<L, B, C> b(vw $$0, zp $$1, Consumer<zt<L, B, C>> $$2) {
      zt<L, B, C> $$3 = new zt<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wq, B extends ByteBuf, C> zv<T, B, C> c(vw $$0, Consumer<zt<T, B, C>> $$1) {
      return b($$0, zp.a, $$1);
   }

   public static <T extends vs, B extends ByteBuf, C> zv<T, B, C> d(vw $$0, Consumer<zt<T, B, C>> $$1) {
      return b($$0, zp.b, $$1);
   }

   static record a<T extends wk, P extends zo<? super T>, B extends ByteBuf, C>(zq<P> a, ze<? super B, P> b, @Nullable zn<B, P, C> c) {

      public void a(zs<ByteBuf, T> $$0, Function<ByteBuf, B> $$1, C $$2) {
         ze<? super B, P> $$3;
         if (this.c != null) {
            $$3 = this.c.apply(this.b, $$2);
         } else {
            $$3 = this.b;
         }

         ze<ByteBuf, P> $$5 = $$3.b($$1);
         $$0.a(this.a, $$5);
      }
   }

   static record b<L extends wk>(vw a, zp b, ze<ByteBuf, zo<? super L>> c, @Nullable zm d) implements wm<L> {
   }
}
