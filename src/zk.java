import io.netty.buffer.ByteBuf;

public class zk<B extends ByteBuf, L extends wf> {
   private final yw.a<B, zg<? super L>, zi<? extends zg<? super L>>> a = yw.a(zg::a);
   private final zh b;

   public zk(zh $$0) {
      this.b = $$0;
   }

   public <T extends zg<? super L>> zk<B, L> a(zi<T> $$0, yx<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yx<B, zg<? super L>> a() {
      return this.a.a();
   }
}
