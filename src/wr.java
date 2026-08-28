import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record wr(String c, List<wr.a> d, xr e) {
   public static final Codec<wr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wr::a),
               wr.a.d.listOf().fieldOf("parameters").forGetter(wr::b),
               xr.b.b.optionalFieldOf("style", xr.a).forGetter(wr::c)
            )
            .apply($$0, wr::new)
   );
   public static final ys<wf, wr> b = ys.a(yq.l, wr::a, wr.a.e.a(yq.a()), wr::b, xr.b.c, wr::c, wr::new);

   public static wr a(String $$0) {
      return new wr($$0, List.of(wr.a.a, wr.a.c), xr.a);
   }

   public static wr b(String $$0) {
      xr $$1 = xr.a.a(n.h).b(true);
      return new wr($$0, List.of(wr.a.a, wr.a.c), $$1);
   }

   public static wr c(String $$0) {
      xr $$1 = xr.a.a(n.h).b(true);
      return new wr($$0, List.of(wr.a.b, wr.a.c), $$1);
   }

   public static wr d(String $$0) {
      return new wr($$0, List.of(wr.a.b, wr.a.a, wr.a.c), xr.a);
   }

   public wu a(wu $$0, wq.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wu.a(this.c, $$2).c(this.e);
   }

   private wu[] b(wu $$0, wq.a $$1) {
      wu[] $$2 = new wu[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wr.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<wr.a> b() {
      return this.d;
   }

   public xr c() {
      return this.e;
   }

   public static enum a implements azc {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wt.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<wr.a> f = aww.a($$0 -> $$0.g, values(), aww.a.a);
      public static final Codec<wr.a> d = azc.a(wr.a::values);
      public static final ys<ByteBuf, wr.a> e = yq.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final wr.a.a i;

      private a(final int $$0, final String $$1, final wr.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public wu a(wu $$0, wq.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         wu select(wu var1, wq.a var2);
      }
   }
}
