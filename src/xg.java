import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xg(String c, List<xg.a> d, yg e) {
   public static final Codec<xg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xg::a),
               xg.a.d.listOf().fieldOf("parameters").forGetter(xg::b),
               yg.b.b.optionalFieldOf("style", yg.a).forGetter(xg::c)
            )
            .apply($$0, xg::new)
   );
   public static final zh<wu, xg> b = zh.a(zf.n, xg::a, xg.a.e.a(zf.a()), xg::b, yg.b.c, xg::c, xg::new);

   public static xg a(String $$0) {
      return new xg($$0, List.of(xg.a.a, xg.a.c), yg.a);
   }

   public static xg b(String $$0) {
      yg $$1 = yg.a.a(n.h).b(true);
      return new xg($$0, List.of(xg.a.a, xg.a.c), $$1);
   }

   public static xg c(String $$0) {
      yg $$1 = yg.a.a(n.h).b(true);
      return new xg($$0, List.of(xg.a.b, xg.a.c), $$1);
   }

   public static xg d(String $$0) {
      return new xg($$0, List.of(xg.a.b, xg.a.a, xg.a.c), yg.a);
   }

   public xj a(xj $$0, xf.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xj.a(this.c, $$2).c(this.e);
   }

   private xj[] b(xj $$0, xf.a $$1) {
      xj[] $$2 = new xj[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xg.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xg.a> b() {
      return this.d;
   }

   public yg c() {
      return this.e;
   }

   public static enum a implements bai {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xi.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xg.a> f = ayd.a($$0 -> $$0.g, values(), ayd.a.a);
      public static final Codec<xg.a> d = bai.a(xg.a::values);
      public static final zh<ByteBuf, xg.a> e = zf.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xg.a.a i;

      private a(final int $$0, final String $$1, final xg.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xj a(xj $$0, xf.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xj select(xj var1, xf.a var2);
      }
   }
}
