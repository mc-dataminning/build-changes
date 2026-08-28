import io.netty.buffer.ByteBuf;

public class zn<B extends ByteBuf, L extends wi> {
   private final yz.a<B, zj<? super L>, zl<? extends zj<? super L>>> a = yz.a(zj::a);
   private final zk b;

   public zn(zk $$0) {
      this.b = $$0;
   }

   public <T extends zj<? super L>> zn<B, L> a(zl<T> $$0, za<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public za<B, zj<? super L>> a() {
      return this.a.a();
   }
}
