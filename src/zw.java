import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zw<T extends wq, B extends ByteBuf> {
   final wf a;
   final zs b;
   private final List<zw.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zq d;

   public zw(wf $$0, zs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zr<? super T>> zw<T, B> a(zt<P> $$0, zi<? super B, P> $$1) {
      this.c.add(new zw.a<>($$0, $$1));
      return this;
   }

   public <P extends zp<? super T>, D extends zo<? super T>> zw<T, B> a(zt<P> $$0, Function<Iterable<zr<? super T>>, P> $$1, D $$2) {
      zi<ByteBuf, D> $$3 = zi.a($$2);
      zt<D> $$4 = (zt<D>)$$2.a();
      this.c.add(new zw.a<>($$4, $$3));
      this.d = zq.a($$0, $$1, $$2);
      return this;
   }

   zi<ByteBuf, zr<? super T>> a(Function<ByteBuf, B> $$0, List<zw.a<T, ?, B>> $$1) {
      zv<ByteBuf, T> $$2 = new zv<>(this.b);

      for (zw.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public ws<T> a(Function<ByteBuf, B> $$0) {
      return new zw.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public ws.a<T, B> a() {
      final List<zw.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zq $$1 = this.d;
      return new ws.a<T, B>() {
         @Override
         public ws<T> a(Function<ByteBuf, B> $$0x) {
            return new zw.b<>(zw.this.a, zw.this.b, zw.this.a($$0, $$0), $$1);
         }

         @Override
         public wf a() {
            return zw.this.a;
         }

         @Override
         public zs b() {
            return zw.this.b;
         }

         @Override
         public void a(ws.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zw.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wq, B extends ByteBuf> ws.a<L, B> a(wf $$0, zs $$1, Consumer<zw<L, B>> $$2) {
      zw<L, B> $$3 = new zw<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends ww, B extends ByteBuf> ws.a<T, B> a(wf $$0, Consumer<zw<T, B>> $$1) {
      return a($$0, zs.a, $$1);
   }

   public static <T extends wb, B extends ByteBuf> ws.a<T, B> b(wf $$0, Consumer<zw<T, B>> $$1) {
      return a($$0, zs.b, $$1);
   }

   static record a<T extends wq, P extends zr<? super T>, B extends ByteBuf>(zt<P> a, zi<? super B, P> b) {

      public void a(zv<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zi<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wq>(wf a, zs b, zi<ByteBuf, zr<? super L>> c, @Nullable zq d) implements ws<L> {
   }
}
