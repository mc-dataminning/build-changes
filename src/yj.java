import io.netty.buffer.ByteBuf;

public record yj(vu b) implements yb<yh> {
   public static final xs<ByteBuf, yj> a = vw.d.a(yj::new, yj::b);

   @Override
   public yd<yj> a() {
      return yr.b;
   }

   public void a(yh $$0) {
      $$0.a(this);
   }
}
