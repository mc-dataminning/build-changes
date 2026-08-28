import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zm<T extends wg, B extends ByteBuf> {
   final vu a;
   final zi b;
   private final List<zm.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zg d;

   public zm(vu $$0, zi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zh<? super T>> zm<T, B> a(zj<P> $$0, yy<? super B, P> $$1) {
      this.c.add(new zm.a<>($$0, $$1));
      return this;
   }

   public <P extends zf<? super T>, D extends ze<? super T>> zm<T, B> a(zj<P> $$0, Function<Iterable<zh<? super T>>, P> $$1, D $$2) {
      yy<ByteBuf, D> $$3 = yy.a($$2);
      zj<D> $$4 = (zj<D>)$$2.a();
      this.c.add(new zm.a<>($$4, $$3));
      this.d = zg.a($$0, $$1, $$2);
      return this;
   }

   yy<ByteBuf, zh<? super T>> a(Function<ByteBuf, B> $$0, List<zm.a<T, ?, B>> $$1) {
      zl<ByteBuf, T> $$2 = new zl<>(this.b);

      for (zm.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wi<T> a(Function<ByteBuf, B> $$0) {
      return new zm.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wi.a<T, B> a() {
      final List<zm.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zg $$1 = this.d;
      return new wi.a<T, B>() {
         @Override
         public wi<T> a(Function<ByteBuf, B> $$0x) {
            return new zm.b<>(zm.this.a, zm.this.b, zm.this.a($$0, $$0), $$1);
         }

         @Override
         public vu a() {
            return zm.this.a;
         }

         @Override
         public zi b() {
            return zm.this.b;
         }

         @Override
         public void a(wi.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zm.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wg, B extends ByteBuf> wi.a<L, B> a(vu $$0, zi $$1, Consumer<zm<L, B>> $$2) {
      zm<L, B> $$3 = new zm<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wm, B extends ByteBuf> wi.a<T, B> a(vu $$0, Consumer<zm<T, B>> $$1) {
      return a($$0, zi.a, $$1);
   }

   public static <T extends vq, B extends ByteBuf> wi.a<T, B> b(vu $$0, Consumer<zm<T, B>> $$1) {
      return a($$0, zi.b, $$1);
   }

   static record a<T extends wg, P extends zh<? super T>, B extends ByteBuf>(zj<P> a, yy<? super B, P> b) {

      public void a(zl<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yy<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wg>(vu a, zi b, yy<ByteBuf, zh<? super L>> c, @Nullable zg d) implements wi<L> {
   }
}
