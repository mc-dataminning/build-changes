import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record wv(String c, List<wv.a> d, xv e) {
   public static final Codec<wv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wv::a),
               wv.a.d.listOf().fieldOf("parameters").forGetter(wv::b),
               xv.b.b.optionalFieldOf("style", xv.a).forGetter(wv::c)
            )
            .apply($$0, wv::new)
   );
   public static final yw<wj, wv> b = yw.a(yu.o, wv::a, wv.a.e.a(yu.a()), wv::b, xv.b.c, wv::c, wv::new);

   public static wv a(String $$0) {
      return new wv($$0, List.of(wv.a.a, wv.a.c), xv.a);
   }

   public static wv b(String $$0) {
      xv $$1 = xv.a.a(n.h).b(true);
      return new wv($$0, List.of(wv.a.a, wv.a.c), $$1);
   }

   public static wv c(String $$0) {
      xv $$1 = xv.a.a(n.h).b(true);
      return new wv($$0, List.of(wv.a.b, wv.a.c), $$1);
   }

   public static wv d(String $$0) {
      return new wv($$0, List.of(wv.a.b, wv.a.a, wv.a.c), xv.a);
   }

   public wy a(wy $$0, wu.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wy.a(this.c, $$2).c(this.e);
   }

   private wy[] b(wy $$0, wu.a $$1) {
      wy[] $$2 = new wy[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wv.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<wv.a> b() {
      return this.d;
   }

   public xv c() {
      return this.e;
   }

   public static enum a implements bak {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wx.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<wv.a> f = ayc.a($$0 -> $$0.g, values(), ayc.a.a);
      public static final Codec<wv.a> d = bak.a(wv.a::values);
      public static final yw<ByteBuf, wv.a> e = yu.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final wv.a.a i;

      private a(final int $$0, final String $$1, final wv.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public wy a(wy $$0, wu.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         wy select(wy var1, wu.a var2);
      }
   }
}
