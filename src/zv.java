import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zv<T extends wp, B extends ByteBuf> {
   final we a;
   final zr b;
   private final List<zv.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zp d;

   public zv(we $$0, zr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zq<? super T>> zv<T, B> a(zs<P> $$0, zh<? super B, P> $$1) {
      this.c.add(new zv.a<>($$0, $$1));
      return this;
   }

   public <P extends zo<? super T>, D extends zn<? super T>> zv<T, B> a(zs<P> $$0, Function<Iterable<zq<? super T>>, P> $$1, D $$2) {
      zh<ByteBuf, D> $$3 = zh.a($$2);
      zs<D> $$4 = (zs<D>)$$2.a();
      this.c.add(new zv.a<>($$4, $$3));
      this.d = zp.a($$0, $$1, $$2);
      return this;
   }

   zh<ByteBuf, zq<? super T>> a(Function<ByteBuf, B> $$0, List<zv.a<T, ?, B>> $$1) {
      zu<ByteBuf, T> $$2 = new zu<>(this.b);

      for (zv.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wr<T> a(Function<ByteBuf, B> $$0) {
      return new zv.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wr.a<T, B> a() {
      final List<zv.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zp $$1 = this.d;
      return new wr.a<T, B>() {
         @Override
         public wr<T> a(Function<ByteBuf, B> $$0x) {
            return new zv.b<>(zv.this.a, zv.this.b, zv.this.a($$0, $$0), $$1);
         }

         @Override
         public we a() {
            return zv.this.a;
         }

         @Override
         public zr b() {
            return zv.this.b;
         }

         @Override
         public void a(wr.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zv.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wp, B extends ByteBuf> wr.a<L, B> a(we $$0, zr $$1, Consumer<zv<L, B>> $$2) {
      zv<L, B> $$3 = new zv<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wv, B extends ByteBuf> wr.a<T, B> a(we $$0, Consumer<zv<T, B>> $$1) {
      return a($$0, zr.a, $$1);
   }

   public static <T extends wa, B extends ByteBuf> wr.a<T, B> b(we $$0, Consumer<zv<T, B>> $$1) {
      return a($$0, zr.b, $$1);
   }

   static record a<T extends wp, P extends zq<? super T>, B extends ByteBuf>(zs<P> a, zh<? super B, P> b) {

      public void a(zu<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zh<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wp>(we a, zr b, zh<ByteBuf, zq<? super L>> c, @Nullable zp d) implements wr<L> {
   }
}
