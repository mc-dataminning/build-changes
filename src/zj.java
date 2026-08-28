import io.netty.buffer.ByteBuf;

public class zj<B extends ByteBuf, L extends we> {
   private final yv.a<B, zf<? super L>, zh<? extends zf<? super L>>> a = yv.a(zf::a);
   private final zg b;

   public zj(zg $$0) {
      this.b = $$0;
   }

   public <T extends zf<? super L>> zj<B, L> a(zh<T> $$0, yw<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yw<B, zf<? super L>> a() {
      return this.a.a();
   }
}
