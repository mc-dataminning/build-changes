import io.netty.buffer.ByteBuf;
import java.util.List;

public record zt(aix<? extends iv<?>> b, List<iz.a> c) implements xx<zr> {
   private static final xo<ByteBuf, aix<? extends iv<?>>> d = aiy.b.a(aix::a, aix::a);
   public static final xo<uq, zt> a = xo.a(d, zt::b, iz.a.a.a(xm.a()), zt::e, zt::new);

   @Override
   public xz<zt> a() {
      return zv.b;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }

   public List<iz.a> e() {
      return this.c;
   }
}
