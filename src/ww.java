import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record ww(String c, List<ww.a> d, xw e) {
   public static final Codec<ww> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(ww::a),
               ww.a.d.listOf().fieldOf("parameters").forGetter(ww::b),
               xw.b.b.optionalFieldOf("style", xw.a).forGetter(ww::c)
            )
            .apply($$0, ww::new)
   );
   public static final yx<wk, ww> b = yx.a(yv.l, ww::a, ww.a.e.a(yv.a()), ww::b, xw.b.c, ww::c, ww::new);

   public static ww a(String $$0) {
      return new ww($$0, List.of(ww.a.a, ww.a.c), xw.a);
   }

   public static ww b(String $$0) {
      xw $$1 = xw.a.a(n.h).b(true);
      return new ww($$0, List.of(ww.a.a, ww.a.c), $$1);
   }

   public static ww c(String $$0) {
      xw $$1 = xw.a.a(n.h).b(true);
      return new ww($$0, List.of(ww.a.b, ww.a.c), $$1);
   }

   public static ww d(String $$0) {
      return new ww($$0, List.of(ww.a.b, ww.a.a, ww.a.c), xw.a);
   }

   public wz a(wz $$0, wv.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wz.a(this.c, $$2).c(this.e);
   }

   private wz[] b(wz $$0, wv.a $$1) {
      wz[] $$2 = new wz[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         ww.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<ww.a> b() {
      return this.d;
   }

   public xw c() {
      return this.e;
   }

   public static enum a implements azk {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wy.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<ww.a> f = axe.a($$0 -> $$0.g, values(), axe.a.a);
      public static final Codec<ww.a> d = azk.a(ww.a::values);
      public static final yx<ByteBuf, ww.a> e = yv.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final ww.a.a i;

      private a(final int $$0, final String $$1, final ww.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public wz a(wz $$0, wv.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         wz select(wz var1, wv.a var2);
      }
   }
}
