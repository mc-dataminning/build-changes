import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zh<T extends wb, B extends ByteBuf> {
   final vp a;
   final zd b;
   private final List<zh.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zb d;

   public zh(vp $$0, zd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zc<? super T>> zh<T, B> a(ze<P> $$0, yt<? super B, P> $$1) {
      this.c.add(new zh.a<>($$0, $$1));
      return this;
   }

   public <P extends za<? super T>, D extends yz<? super T>> zh<T, B> a(ze<P> $$0, Function<Iterable<zc<? super T>>, P> $$1, D $$2) {
      yt<ByteBuf, D> $$3 = yt.a($$2);
      ze<D> $$4 = (ze<D>)$$2.a();
      this.c.add(new zh.a<>($$4, $$3));
      this.d = zb.a($$0, $$1, $$2);
      return this;
   }

   yt<ByteBuf, zc<? super T>> a(Function<ByteBuf, B> $$0, List<zh.a<T, ?, B>> $$1) {
      zg<ByteBuf, T> $$2 = new zg<>(this.b);

      for (zh.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wd<T> a(Function<ByteBuf, B> $$0) {
      return new zh.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wd.a<T, B> a() {
      final List<zh.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zb $$1 = this.d;
      return new wd.a<T, B>() {
         @Override
         public wd<T> a(Function<ByteBuf, B> $$0x) {
            return new zh.b<>(zh.this.a, zh.this.b, zh.this.a($$0, $$0), $$1);
         }

         @Override
         public vp a() {
            return zh.this.a;
         }

         @Override
         public zd b() {
            return zh.this.b;
         }

         @Override
         public void a(wd.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zh.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wb, B extends ByteBuf> wd.a<L, B> a(vp $$0, zd $$1, Consumer<zh<L, B>> $$2) {
      zh<L, B> $$3 = new zh<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wh, B extends ByteBuf> wd.a<T, B> a(vp $$0, Consumer<zh<T, B>> $$1) {
      return a($$0, zd.a, $$1);
   }

   public static <T extends vl, B extends ByteBuf> wd.a<T, B> b(vp $$0, Consumer<zh<T, B>> $$1) {
      return a($$0, zd.b, $$1);
   }

   static record a<T extends wb, P extends zc<? super T>, B extends ByteBuf>(ze<P> a, yt<? super B, P> b) {

      public void a(zg<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yt<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wb>(vp a, zd b, yt<ByteBuf, zc<? super L>> c, @Nullable zb d) implements wd<L> {
   }
}
