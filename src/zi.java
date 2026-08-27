import io.netty.buffer.ByteBuf;

public class zi<B extends ByteBuf, L extends wd> {
   private final yu.a<B, ze<? super L>, zg<? extends ze<? super L>>> a = yu.a(ze::a);
   private final zf b;

   public zi(zf $$0) {
      this.b = $$0;
   }

   public <T extends ze<? super L>> zi<B, L> a(zg<T> $$0, yv<? super B, T> $$1) {
      if ($$0.a() != this.b) {
         throw new IllegalArgumentException("Invalid packet flow for packet " + $$0 + ", expected " + this.b.name());
      } else {
         this.a.a($$0, $$1);
         return this;
      }
   }

   public yv<B, ze<? super L>> a() {
      return this.a.a();
   }
}
