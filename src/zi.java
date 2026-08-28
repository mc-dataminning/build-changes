import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zi<T extends wc, B extends ByteBuf> {
   final vq a;
   final ze b;
   private final List<zi.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zc d;

   public zi(vq $$0, ze $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zd<? super T>> zi<T, B> a(zf<P> $$0, yu<? super B, P> $$1) {
      this.c.add(new zi.a<>($$0, $$1));
      return this;
   }

   public <P extends zb<? super T>, D extends za<? super T>> zi<T, B> a(zf<P> $$0, Function<Iterable<zd<? super T>>, P> $$1, D $$2) {
      yu<ByteBuf, D> $$3 = yu.a($$2);
      zf<D> $$4 = (zf<D>)$$2.a();
      this.c.add(new zi.a<>($$4, $$3));
      this.d = zc.a($$0, $$1, $$2);
      return this;
   }

   yu<ByteBuf, zd<? super T>> a(Function<ByteBuf, B> $$0, List<zi.a<T, ?, B>> $$1) {
      zh<ByteBuf, T> $$2 = new zh<>(this.b);

      for (zi.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public we<T> a(Function<ByteBuf, B> $$0) {
      return new zi.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public we.a<T, B> a() {
      final List<zi.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zc $$1 = this.d;
      return new we.a<T, B>() {
         @Override
         public we<T> a(Function<ByteBuf, B> $$0x) {
            return new zi.b<>(zi.this.a, zi.this.b, zi.this.a($$0, $$0), $$1);
         }

         @Override
         public vq a() {
            return zi.this.a;
         }

         @Override
         public ze b() {
            return zi.this.b;
         }

         @Override
         public void a(we.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zi.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wc, B extends ByteBuf> we.a<L, B> a(vq $$0, ze $$1, Consumer<zi<L, B>> $$2) {
      zi<L, B> $$3 = new zi<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wi, B extends ByteBuf> we.a<T, B> a(vq $$0, Consumer<zi<T, B>> $$1) {
      return a($$0, ze.a, $$1);
   }

   public static <T extends vm, B extends ByteBuf> we.a<T, B> b(vq $$0, Consumer<zi<T, B>> $$1) {
      return a($$0, ze.b, $$1);
   }

   static record a<T extends wc, P extends zd<? super T>, B extends ByteBuf>(zf<P> a, yu<? super B, P> b) {

      public void a(zh<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yu<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wc>(vq a, ze b, yu<ByteBuf, zd<? super L>> c, @Nullable zc d) implements we<L> {
   }
}
