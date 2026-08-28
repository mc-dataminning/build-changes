import io.netty.buffer.ByteBuf;

public class zp<B extends ByteBuf, L extends wk> {
   private final zb.a<B, zl<? super L>, zn<? extends zl<? super L>>> a = zb.a(zl::a);
   private final zm b;

   public zp(zm $$0) {
      this.b = $$0;
   }

   public <T extends zl<? super L>> zp<B, L> a(zn<T> $$0, zc<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public zc<B, zl<? super L>> a() {
      return this.a.a();
   }
}
