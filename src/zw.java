import io.netty.buffer.ByteBuf;

public class zw<B extends ByteBuf, L extends wr> {
   private final zi.a<B, zs<? super L>, zu<? extends zs<? super L>>> a = zi.a(zs::a);
   private final zt b;

   public zw(zt $$0) {
      this.b = $$0;
   }

   public <T extends zs<? super L>> zw<B, L> a(zu<T> $$0, zj<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zj<B, zs<? super L>> a() {
      return this.a.a();
   }
}
