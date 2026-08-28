import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xf(String c, List<xf.a> d, yf e) {
   public static final Codec<xf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xf::a),
               xf.a.d.listOf().fieldOf("parameters").forGetter(xf::b),
               yf.b.b.optionalFieldOf("style", yf.a).forGetter(xf::c)
            )
            .apply($$0, xf::new)
   );
   public static final zg<wt, xf> b = zg.a(ze.m, xf::a, xf.a.e.a(ze.a()), xf::b, yf.b.c, xf::c, xf::new);

   public static xf a(String $$0) {
      return new xf($$0, List.of(xf.a.a, xf.a.c), yf.a);
   }

   public static xf b(String $$0) {
      yf $$1 = yf.a.a(n.h).b(true);
      return new xf($$0, List.of(xf.a.a, xf.a.c), $$1);
   }

   public static xf c(String $$0) {
      yf $$1 = yf.a.a(n.h).b(true);
      return new xf($$0, List.of(xf.a.b, xf.a.c), $$1);
   }

   public static xf d(String $$0) {
      return new xf($$0, List.of(xf.a.b, xf.a.a, xf.a.c), yf.a);
   }

   public xi a(xi $$0, xe.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xi.a(this.c, $$2).c(this.e);
   }

   private xi[] b(xi $$0, xe.a $$1) {
      xi[] $$2 = new xi[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xf.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xf.a> b() {
      return this.d;
   }

   public yf c() {
      return this.e;
   }

   public static enum a implements bag {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xh.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xf.a> f = ayb.a($$0 -> $$0.g, values(), ayb.a.a);
      public static final Codec<xf.a> d = bag.a(xf.a::values);
      public static final zg<ByteBuf, xf.a> e = ze.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xf.a.a i;

      private a(final int $$0, final String $$1, final xf.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xi a(xi $$0, xe.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xi select(xi var1, xe.a var2);
      }
   }
}
