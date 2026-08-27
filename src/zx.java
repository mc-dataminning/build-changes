import io.netty.buffer.ByteBuf;
import java.util.List;

public record zx(ajg<? extends iy<?>> b, List<jc.a> c) implements yb<zv> {
   private static final xs<ByteBuf, ajg<? extends iy<?>>> d = ajh.b.a(ajg::a, ajg::a);
   public static final xs<uu, zx> a = xs.a(d, zx::b, jc.a.a.a(xq.a()), zx::e, zx::new);

   @Override
   public yd<zx> a() {
      return aaa.b;
   }

   public void a(zv $$0) {
      $$0.a(this);
   }

   public List<jc.a> e() {
      return this.c;
   }
}
