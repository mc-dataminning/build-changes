import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record wt(String c, List<wt.a> d, xt e) {
   public static final Codec<wt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wt::a),
               wt.a.d.listOf().fieldOf("parameters").forGetter(wt::b),
               xt.b.b.optionalFieldOf("style", xt.a).forGetter(wt::c)
            )
            .apply($$0, wt::new)
   );
   public static final yu<wh, wt> b = yu.a(ys.o, wt::a, wt.a.e.a(ys.a()), wt::b, xt.b.c, wt::c, wt::new);

   public static wt a(String $$0) {
      return new wt($$0, List.of(wt.a.a, wt.a.c), xt.a);
   }

   public static wt b(String $$0) {
      xt $$1 = xt.a.a(n.h).b(true);
      return new wt($$0, List.of(wt.a.a, wt.a.c), $$1);
   }

   public static wt c(String $$0) {
      xt $$1 = xt.a.a(n.h).b(true);
      return new wt($$0, List.of(wt.a.b, wt.a.c), $$1);
   }

   public static wt d(String $$0) {
      return new wt($$0, List.of(wt.a.b, wt.a.a, wt.a.c), xt.a);
   }

   public ww a(ww $$0, ws.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return ww.a(this.c, $$2).c(this.e);
   }

   private ww[] b(ww $$0, ws.a $$1) {
      ww[] $$2 = new ww[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wt.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<wt.a> b() {
      return this.d;
   }

   public xt c() {
      return this.e;
   }

   public static enum a implements bai {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wv.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<wt.a> f = aya.a($$0 -> $$0.g, values(), aya.a.a);
      public static final Codec<wt.a> d = bai.a(wt.a::values);
      public static final yu<ByteBuf, wt.a> e = ys.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final wt.a.a i;

      private a(final int $$0, final String $$1, final wt.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public ww a(ww $$0, ws.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         ww select(ww var1, ws.a var2);
      }
   }
}
