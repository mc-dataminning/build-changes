import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xh(String c, List<xh.a> d, yh e) {
   public static final Codec<xh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xh::a),
               xh.a.d.listOf().fieldOf("parameters").forGetter(xh::b),
               yh.b.b.optionalFieldOf("style", yh.a).forGetter(xh::c)
            )
            .apply($$0, xh::new)
   );
   public static final zi<wv, xh> b = zi.a(zg.o, xh::a, xh.a.e.a(zg.a()), xh::b, yh.b.c, xh::c, xh::new);

   public static xh a(String $$0) {
      return new xh($$0, List.of(xh.a.a, xh.a.c), yh.a);
   }

   public static xh b(String $$0) {
      yh $$1 = yh.a.a(n.h).b(true);
      return new xh($$0, List.of(xh.a.a, xh.a.c), $$1);
   }

   public static xh c(String $$0) {
      yh $$1 = yh.a.a(n.h).b(true);
      return new xh($$0, List.of(xh.a.b, xh.a.c), $$1);
   }

   public static xh d(String $$0) {
      return new xh($$0, List.of(xh.a.b, xh.a.a, xh.a.c), yh.a);
   }

   public xk a(xk $$0, xg.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xk.a(this.c, $$2).c(this.e);
   }

   private xk[] b(xk $$0, xg.a $$1) {
      xk[] $$2 = new xk[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xh.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xh.a> b() {
      return this.d;
   }

   public yh c() {
      return this.e;
   }

   public static enum a implements baq {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xj.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xh.a> f = ayl.a($$0 -> $$0.g, values(), ayl.a.a);
      public static final Codec<xh.a> d = baq.a(xh.a::values);
      public static final zi<ByteBuf, xh.a> e = zg.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xh.a.a i;

      private a(final int $$0, final String $$1, final xh.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xk a(xk $$0, xg.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xk select(xk var1, xg.a var2);
      }
   }
}
