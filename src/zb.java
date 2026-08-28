import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zb<T extends vv, B extends ByteBuf> {
   final vj a;
   final yx b;
   private final List<zb.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private yv d;

   public zb(vj $$0, yx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends yw<? super T>> zb<T, B> a(yy<P> $$0, yn<? super B, P> $$1) {
      this.c.add(new zb.a<>($$0, $$1));
      return this;
   }

   public <P extends yu<? super T>, D extends yt<? super T>> zb<T, B> a(yy<P> $$0, Function<Iterable<yw<? super T>>, P> $$1, D $$2) {
      yn<ByteBuf, D> $$3 = yn.a($$2);
      yy<D> $$4 = (yy<D>)$$2.a();
      this.c.add(new zb.a<>($$4, $$3));
      this.d = yv.a($$0, $$1, $$2);
      return this;
   }

   yn<ByteBuf, yw<? super T>> a(Function<ByteBuf, B> $$0, List<zb.a<T, ?, B>> $$1) {
      za<ByteBuf, T> $$2 = new za<>(this.b);

      for (zb.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public vx<T> a(Function<ByteBuf, B> $$0) {
      return new zb.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public vx.a<T, B> a() {
      final List<zb.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final yv $$1 = this.d;
      return new vx.a<T, B>() {
         @Override
         public vx<T> a(Function<ByteBuf, B> $$0x) {
            return new zb.b<>(zb.this.a, zb.this.b, zb.this.a($$0, $$0), $$1);
         }

         @Override
         public vj a() {
            return zb.this.a;
         }

         @Override
         public yx b() {
            return zb.this.b;
         }

         @Override
         public void a(vx.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zb.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends vv, B extends ByteBuf> vx.a<L, B> a(vj $$0, yx $$1, Consumer<zb<L, B>> $$2) {
      zb<L, B> $$3 = new zb<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wb, B extends ByteBuf> vx.a<T, B> a(vj $$0, Consumer<zb<T, B>> $$1) {
      return a($$0, yx.a, $$1);
   }

   public static <T extends vf, B extends ByteBuf> vx.a<T, B> b(vj $$0, Consumer<zb<T, B>> $$1) {
      return a($$0, yx.b, $$1);
   }

   static record a<T extends vv, P extends yw<? super T>, B extends ByteBuf>(yy<P> a, yn<? super B, P> b) {

      public void a(za<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yn<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends vv>(vj a, yx b, yn<ByteBuf, yw<? super L>> c, @Nullable yv d) implements vx<L> {
   }
}
