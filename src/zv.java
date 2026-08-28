import io.netty.buffer.ByteBuf;

public class zv<B extends ByteBuf, L extends wq> {
   private final zh.a<B, zr<? super L>, zt<? extends zr<? super L>>> a = zh.a(zr::a);
   private final zs b;

   public zv(zs $$0) {
      this.b = $$0;
   }

   public <T extends zr<? super L>> zv<B, L> a(zt<T> $$0, zi<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zi<B, zr<? super L>> a() {
      return this.a.a();
   }
}
