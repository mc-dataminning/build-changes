import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record ws(String c, List<ws.a> d, xs e) {
   public static final Codec<ws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(ws::a),
               ws.a.d.listOf().fieldOf("parameters").forGetter(ws::b),
               xs.b.b.optionalFieldOf("style", xs.a).forGetter(ws::c)
            )
            .apply($$0, ws::new)
   );
   public static final yt<wg, ws> b = yt.a(yr.o, ws::a, ws.a.e.a(yr.a()), ws::b, xs.b.c, ws::c, ws::new);

   public static ws a(String $$0) {
      return new ws($$0, List.of(ws.a.a, ws.a.c), xs.a);
   }

   public static ws b(String $$0) {
      xs $$1 = xs.a.a(n.h).b(true);
      return new ws($$0, List.of(ws.a.a, ws.a.c), $$1);
   }

   public static ws c(String $$0) {
      xs $$1 = xs.a.a(n.h).b(true);
      return new ws($$0, List.of(ws.a.b, ws.a.c), $$1);
   }

   public static ws d(String $$0) {
      return new ws($$0, List.of(ws.a.b, ws.a.a, ws.a.c), xs.a);
   }

   public wv a(wv $$0, wr.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wv.a(this.c, $$2).c(this.e);
   }

   private wv[] b(wv $$0, wr.a $$1) {
      wv[] $$2 = new wv[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         ws.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<ws.a> b() {
      return this.d;
   }

   public xs c() {
      return this.e;
   }

   public static enum a implements bag {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wu.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<ws.a> f = aya.a($$0 -> $$0.g, values(), aya.a.a);
      public static final Codec<ws.a> d = bag.a(ws.a::values);
      public static final yt<ByteBuf, ws.a> e = yr.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final ws.a.a i;

      private a(final int $$0, final String $$1, final ws.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public wv a(wv $$0, wr.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         wv select(wv var1, wr.a var2);
      }
   }
}
