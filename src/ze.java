import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ze<T extends vy, B extends ByteBuf> {
   private final vr a;
   private final za b;
   private final List<ze.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private yy d;

   public ze(vr $$0, za $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends yz<? super T>> ze<T, B> a(zb<P> $$0, yq<? super B, P> $$1) {
      this.c.add(new ze.a<>($$0, $$1));
      return this;
   }

   public <P extends yx<? super T>, D extends yw<? super T>> ze<T, B> a(zb<P> $$0, Function<Iterable<yz<? super T>>, P> $$1, D $$2) {
      yq<ByteBuf, D> $$3 = yq.a($$2);
      zb<D> $$4 = (zb<D>)$$2.a();
      this.c.add(new ze.a<>($$4, $$3));
      this.d = yy.a($$0, $$1, $$2);
      return this;
   }

   private yq<ByteBuf, yz<? super T>> a(Function<ByteBuf, B> $$0, List<ze.a<T, ?, B>> $$1) {
      zd<ByteBuf, T> $$2 = new zd<>(this.b);

      for (ze.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wa<T> a(Function<ByteBuf, B> $$0) {
      return new ze.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wa.a<T, B> a() {
      List<ze.a<T, ?, B>> $$0 = List.copyOf(this.c);
      yy $$1 = this.d;
      return $$2 -> new ze.b<>(this.a, this.b, this.a($$2, $$0), $$1);
   }

   private static <L extends vy> wa<L> a(vr $$0, za $$1, Consumer<ze<L, vs>> $$2) {
      ze<L, vs> $$3 = new ze<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a(vs::new);
   }

   public static <T extends we> wa<T> a(vr $$0, Consumer<ze<T, vs>> $$1) {
      return a($$0, za.a, $$1);
   }

   public static <T extends vn> wa<T> b(vr $$0, Consumer<ze<T, vs>> $$1) {
      return a($$0, za.b, $$1);
   }

   private static <L extends vy, B extends ByteBuf> wa.a<L, B> b(vr $$0, za $$1, Consumer<ze<L, B>> $$2) {
      ze<L, B> $$3 = new ze<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends we, B extends ByteBuf> wa.a<T, B> c(vr $$0, Consumer<ze<T, B>> $$1) {
      return b($$0, za.a, $$1);
   }

   public static <T extends vn, B extends ByteBuf> wa.a<T, B> d(vr $$0, Consumer<ze<T, B>> $$1) {
      return b($$0, za.b, $$1);
   }

   static record a<T extends vy, P extends yz<? super T>, B extends ByteBuf>(zb<P> a, yq<? super B, P> b) {
      public void a(zd<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         yq<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends vy>(vr a, za b, yq<ByteBuf, yz<? super L>> c, @Nullable yy d) implements wa<L> {
   }
}
