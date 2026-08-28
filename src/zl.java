import io.netty.buffer.ByteBuf;

public class zl<B extends ByteBuf, L extends wg> {
   private final yx.a<B, zh<? super L>, zj<? extends zh<? super L>>> a = yx.a(zh::a);
   private final zi b;

   public zl(zi $$0) {
      this.b = $$0;
   }

   public <T extends zh<? super L>> zl<B, L> a(zj<T> $$0, yy<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yy<B, zh<? super L>> a() {
      return this.a.a();
   }
}
