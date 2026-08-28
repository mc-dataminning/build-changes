import io.netty.buffer.ByteBuf;

public class zt<B extends ByteBuf, L extends wo> {
   private final zf.a<B, zp<? super L>, zr<? extends zp<? super L>>> a = zf.a(zp::a);
   private final zq b;

   public zt(zq $$0) {
      this.b = $$0;
   }

   public <T extends zp<? super L>> zt<B, L> a(zr<T> $$0, zg<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zg<B, zp<? super L>> a() {
      return this.a.a();
   }
}
