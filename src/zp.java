import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class zp<T extends wj, B extends ByteBuf> {
   final vy a;
   final zl b;
   private final List<zp.a<T, ?, B>> c = new ArrayList<>();
   @Nullable
   private zj d;

   public zp(vy $$0, zl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public <P extends zk<? super T>> zp<T, B> a(zm<P> $$0, zb<? super B, P> $$1) {
      this.c.add(new zp.a<>($$0, $$1));
      return this;
   }

   public <P extends zi<? super T>, D extends zh<? super T>> zp<T, B> a(zm<P> $$0, Function<Iterable<zk<? super T>>, P> $$1, D $$2) {
      zb<ByteBuf, D> $$3 = zb.a($$2);
      zm<D> $$4 = (zm<D>)$$2.a();
      this.c.add(new zp.a<>($$4, $$3));
      this.d = zj.a($$0, $$1, $$2);
      return this;
   }

   zb<ByteBuf, zk<? super T>> a(Function<ByteBuf, B> $$0, List<zp.a<T, ?, B>> $$1) {
      zo<ByteBuf, T> $$2 = new zo<>(this.b);

      for (zp.a<T, ?, B> $$3 : $$1) {
         $$3.a($$2, $$0);
      }

      return $$2.a();
   }

   public wl<T> a(Function<ByteBuf, B> $$0) {
      return new zp.b<>(this.a, this.b, this.a($$0, this.c), this.d);
   }

   public wl.a<T, B> a() {
      final List<zp.a<T, ?, B>> $$0 = List.copyOf(this.c);
      final zj $$1 = this.d;
      return new wl.a<T, B>() {
         @Override
         public wl<T> a(Function<ByteBuf, B> $$0x) {
            return new zp.b<>(zp.this.a, zp.this.b, zp.this.a($$0, $$0), $$1);
         }

         @Override
         public vy a() {
            return zp.this.a;
         }

         @Override
         public zl b() {
            return zp.this.b;
         }

         @Override
         public void a(wl.a.a $$0x) {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               zp.a<T, ?, B> $$2 = $$0.get($$1);
               $$0.accept($$2.a, $$1);
            }
         }
      };
   }

   private static <L extends wj, B extends ByteBuf> wl.a<L, B> a(vy $$0, zl $$1, Consumer<zp<L, B>> $$2) {
      zp<L, B> $$3 = new zp<>($$0, $$1);
      $$2.accept($$3);
      return $$3.a();
   }

   public static <T extends wp, B extends ByteBuf> wl.a<T, B> a(vy $$0, Consumer<zp<T, B>> $$1) {
      return a($$0, zl.a, $$1);
   }

   public static <T extends vu, B extends ByteBuf> wl.a<T, B> b(vy $$0, Consumer<zp<T, B>> $$1) {
      return a($$0, zl.b, $$1);
   }

   static record a<T extends wj, P extends zk<? super T>, B extends ByteBuf>(zm<P> a, zb<? super B, P> b) {

      public void a(zo<ByteBuf, T> $$0, Function<ByteBuf, B> $$1) {
         zb<ByteBuf, P> $$2 = this.b.b($$1);
         $$0.a(this.a, $$2);
      }
   }

   static record b<L extends wj>(vy a, zl b, zb<ByteBuf, zk<? super L>> c, @Nullable zj d) implements wl<L> {
   }
}
