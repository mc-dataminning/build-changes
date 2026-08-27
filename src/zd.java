import io.netty.buffer.ByteBuf;

public class zd<B extends ByteBuf, L extends vy> {
   private final yp.a<B, yz<? super L>, zb<? extends yz<? super L>>> a = yp.a(yz::a);
   private final za b;

   public zd(za $$0) {
      this.b = $$0;
   }

   public <T extends yz<? super L>> zd<B, L> a(zb<T> $$0, yq<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yq<B, yz<? super L>> a() {
      return this.a.a();
   }
}
