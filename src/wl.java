import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record wl(String c, List<wl.a> d, xl e) {
   public static final Codec<wl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wl::a),
               wl.a.d.listOf().fieldOf("parameters").forGetter(wl::b),
               xl.b.b.optionalFieldOf("style", xl.a).forGetter(wl::c)
            )
            .apply($$0, wl::new)
   );
   public static final ym<vz, wl> b = ym.a(yk.o, wl::a, wl.a.e.a(yk.a()), wl::b, xl.b.c, wl::c, wl::new);

   public static wl a(String $$0) {
      return new wl($$0, List.of(wl.a.a, wl.a.c), xl.a);
   }

   public static wl b(String $$0) {
      xl $$1 = xl.a.a(n.h).b(true);
      return new wl($$0, List.of(wl.a.a, wl.a.c), $$1);
   }

   public static wl c(String $$0) {
      xl $$1 = xl.a.a(n.h).b(true);
      return new wl($$0, List.of(wl.a.b, wl.a.c), $$1);
   }

   public static wl d(String $$0) {
      return new wl($$0, List.of(wl.a.b, wl.a.a, wl.a.c), xl.a);
   }

   public wo a(wo $$0, wk.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wo.a(this.c, $$2).c(this.e);
   }

   private wo[] b(wo $$0, wk.a $$1) {
      wo[] $$2 = new wo[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wl.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<wl.a> b() {
      return this.d;
   }

   public xl c() {
      return this.e;
   }

   public static enum a implements azv {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wn.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<wl.a> f = axq.a($$0 -> $$0.g, values(), axq.a.a);
      public static final Codec<wl.a> d = azv.a(wl.a::values);
      public static final ym<ByteBuf, wl.a> e = yk.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final wl.a.a i;

      private a(final int $$0, final String $$1, final wl.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public wo a(wo $$0, wk.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         wo select(wo var1, wk.a var2);
      }
   }
}
