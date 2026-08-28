import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xs(String c, List<xs.a> d, ys e) {
   public static final Codec<xs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xs::a),
               xs.a.d.listOf().fieldOf("parameters").forGetter(xs::b),
               ys.b.b.optionalFieldOf("style", ys.a).forGetter(xs::c)
            )
            .apply($$0, xs::new)
   );
   public static final zt<xg, xs> b = zt.a(zr.o, xs::a, xs.a.e.a(zr.a()), xs::b, ys.b.c, xs::c, xs::new);

   public static xs a(String $$0) {
      return new xs($$0, List.of(xs.a.a, xs.a.c), ys.a);
   }

   public static xs b(String $$0) {
      ys $$1 = ys.a.a(n.h).b(true);
      return new xs($$0, List.of(xs.a.a, xs.a.c), $$1);
   }

   public static xs c(String $$0) {
      ys $$1 = ys.a.a(n.h).b(true);
      return new xs($$0, List.of(xs.a.b, xs.a.c), $$1);
   }

   public static xs d(String $$0) {
      return new xs($$0, List.of(xs.a.b, xs.a.a, xs.a.c), ys.a);
   }

   public xv a(xv $$0, xr.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xv.a(this.c, $$2).c(this.e);
   }

   private xv[] b(xv $$0, xr.a $$1) {
      xv[] $$2 = new xv[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xs.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xs.a> b() {
      return this.d;
   }

   public ys c() {
      return this.e;
   }

   public static enum a implements bba {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xu.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xs.a> f = ayv.a($$0 -> $$0.g, values(), ayv.a.a);
      public static final Codec<xs.a> d = bba.a(xs.a::values);
      public static final zt<ByteBuf, xs.a> e = zr.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xs.a.a i;

      private a(final int $$0, final String $$1, final xs.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xv a(xv $$0, xr.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xv select(xv var1, xr.a var2);
      }
   }
}
