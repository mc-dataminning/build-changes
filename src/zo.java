import io.netty.buffer.ByteBuf;

public class zo<B extends ByteBuf, L extends wj> {
   private final za.a<B, zk<? super L>, zm<? extends zk<? super L>>> a = za.a(zk::a);
   private final zl b;

   public zo(zl $$0) {
      this.b = $$0;
   }

   public <T extends zk<? super L>> zo<B, L> a(zm<T> $$0, zb<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zb<B, zk<? super L>> a() {
      return this.a.a();
   }
}
