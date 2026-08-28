import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record wz(String c, List<wz.a> d, xz e) {
   public static final Codec<wz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wz::a),
               wz.a.d.listOf().fieldOf("parameters").forGetter(wz::b),
               xz.b.b.optionalFieldOf("style", xz.a).forGetter(wz::c)
            )
            .apply($$0, wz::new)
   );
   public static final za<wn, wz> b = za.a(yy.p, wz::a, wz.a.e.a(yy.a()), wz::b, xz.b.c, wz::c, wz::new);

   public static wz a(String $$0) {
      return new wz($$0, List.of(wz.a.a, wz.a.c), xz.a);
   }

   public static wz b(String $$0) {
      xz $$1 = xz.a.a(o.h).b(true);
      return new wz($$0, List.of(wz.a.a, wz.a.c), $$1);
   }

   public static wz c(String $$0) {
      xz $$1 = xz.a.a(o.h).b(true);
      return new wz($$0, List.of(wz.a.b, wz.a.c), $$1);
   }

   public static wz d(String $$0) {
      return new wz($$0, List.of(wz.a.b, wz.a.a, wz.a.c), xz.a);
   }

   public xc a(xc $$0, wy.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xc.a(this.c, $$2).c(this.e);
   }

   private xc[] b(xc $$0, wy.a $$1) {
      xc[] $$2 = new xc[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wz.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<wz.a> b() {
      return this.d;
   }

   public xz c() {
      return this.e;
   }

   public static enum a implements bao {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xb.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<wz.a> f = ayg.a($$0 -> $$0.g, values(), ayg.a.a);
      public static final Codec<wz.a> d = bao.a(wz.a::values);
      public static final za<ByteBuf, wz.a> e = yy.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final wz.a.a i;

      private a(final int $$0, final String $$1, final wz.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xc a(xc $$0, wy.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xc select(xc var1, wy.a var2);
      }
   }
}
