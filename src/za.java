import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class za<T extends vu, B extends ByteBuf> {
   final vj a;
   final yw b;
   private final List<za.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private yu d;

   public za(vj $$0, yw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends yv<? super T>> za<T, B> a(yx<P> $$0, ym<? super B, P> $$1) {
      this.c.add(new za.a<>($$0, $$1));
      return this;
   }

   public <P extends yt<? super T>, D extends ys<? super T>> za<T, B> a(yx<P> $$0, Function<Iterable<yv<? super T>>, P> $$1, D $$2) {
      ym<ByteBuf, D> $$3 = ym.a($$2);
      yx<D> $$4 = (yx<D>)$$2.a();
      this.c.add(new za.a<>($$4, $$3));
      this.d = yu.a($$0, $$1, $$2);
      return this;
   }

   ym<ByteBuf, yv<? super T>> a(Function<ByteBuf, B> $$0, List<za.a<T, ?, B>> $$1) {
      yz<ByteBuf, T> $$2 = new yz<>(this.b);

      for (za.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public vw<T> a(Function<ByteBuf, B> $$0) {
      return new za.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public vw.a<T, B> a() {
      final List<za.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final yu $$1 = this.d;
      return new vw.a<T, B>() {
         @Override
         public vw<T> a(Function<ByteBuf, B> $$0x) {
            return new za.b<>(za.this.a, za.this.b, za.this.a($$0, $$0), $$1);
         }

         @Override
         public vj a() {
            return za.this.a;
         }

         @Override
         public yw b() {
            return za.this.b;
         }

         @Override
         public void a(vw.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               za.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends vu, B extends ByteBuf> vw.a<L, B> a(vj $$0, yw $$1, Consumer<za<L, B>> $$2) {
      za<L, B> $$3 = new za<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wa, B extends ByteBuf> vw.a<T, B> a(vj $$0, Consumer<za<T, B>> $$1) {
      return a($$0, yw.a, $$1);
   }

   public static <T extends vf, B extends ByteBuf> vw.a<T, B> b(vj $$0, Consumer<za<T, B>> $$1) {
      return a($$0, yw.b, $$1);
   }

   static record a<T extends vu, P extends yv<? super T>, B extends ByteBuf>(yx<P> a, ym<? super B, P> b) {

      public void a(yz<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         ym<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends vu>(vj a, yw b, ym<ByteBuf, yv<? super L>> c, @Nullable yu d) implements vw<L> {
   }
}
