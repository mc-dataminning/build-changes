import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zl<T extends wf, B extends ByteBuf> {
   final vu a;
   final zh b;
   private final List<zl.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zf d;

   public zl(vu $$0, zh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zg<? super T>> zl<T, B> a(zi<P> $$0, yx<? super B, P> $$1) {
      this.c.add(new zl.a<>($$0, $$1));
      return this;
   }

   public <P extends ze<? super T>, D extends zd<? super T>> zl<T, B> a(zi<P> $$0, Function<Iterable<zg<? super T>>, P> $$1, D $$2) {
      yx<ByteBuf, D> $$3 = yx.a($$2);
      zi<D> $$4 = (zi<D>)$$2.a();
      this.c.add(new zl.a<>($$4, $$3));
      this.d = zf.a($$0, $$1, $$2);
      return this;
   }

   yx<ByteBuf, zg<? super T>> a(Function<ByteBuf, B> $$0, List<zl.a<T, ?, B>> $$1) {
      zk<ByteBuf, T> $$2 = new zk<>(this.b);

      for (zl.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wh<T> a(Function<ByteBuf, B> $$0) {
      return new zl.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wh.a<T, B> a() {
      final List<zl.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zf $$1 = this.d;
      return new wh.a<T, B>() {
         @Override
         public wh<T> a(Function<ByteBuf, B> $$0x) {
            return new zl.b<>(zl.this.a, zl.this.b, zl.this.a($$0, $$0), $$1);
         }

         @Override
         public vu a() {
            return zl.this.a;
         }

         @Override
         public zh b() {
            return zl.this.b;
         }

         @Override
         public void a(wh.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zl.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wf, B extends ByteBuf> wh.a<L, B> a(vu $$0, zh $$1, Consumer<zl<L, B>> $$2) {
      zl<L, B> $$3 = new zl<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wl, B extends ByteBuf> wh.a<T, B> a(vu $$0, Consumer<zl<T, B>> $$1) {
      return a($$0, zh.a, $$1);
   }

   public static <T extends vq, B extends ByteBuf> wh.a<T, B> b(vu $$0, Consumer<zl<T, B>> $$1) {
      return a($$0, zh.b, $$1);
   }

   static record a<T extends wf, P extends zg<? super T>, B extends ByteBuf>(zi<P> a, yx<? super B, P> b) {

      public void a(zk<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yx<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wf>(vu a, zh b, yx<ByteBuf, zg<? super L>> c, @Nullable zf d) implements wh<L> {
   }
}
