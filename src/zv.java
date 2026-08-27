import io.netty.buffer.ByteBuf;
import java.util.List;

public record zv(ajb<? extends ix<?>> b, List<jb.a> c) implements xz<zt> {
   private static final xq<ByteBuf, ajb<? extends ix<?>>> d = ajc.b.a(ajb::a, ajb::a);
   public static final xq<us, zv> a = xq.a(d, zv::b, jb.a.a.a(xo.a()), zv::e, zv::new);

   @Override
   public yb<zv> a() {
      return zx.b;
   }

   public void a(zt $$0) {
      $$0.a(this);
   }

   public List<jb.a> e() {
      return this.c;
   }
}
