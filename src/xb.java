import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xb(String c, List<xb.a> d, yb e) {
   public static final Codec<xb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xb::a),
               xb.a.d.listOf().fieldOf("parameters").forGetter(xb::b),
               yb.b.b.optionalFieldOf("style", yb.a).forGetter(xb::c)
            )
            .apply($$0, xb::new)
   );
   public static final zc<wp, xb> b = zc.a(za.m, xb::a, xb.a.e.a(za.a()), xb::b, yb.b.c, xb::c, xb::new);

   public static xb a(String $$0) {
      return new xb($$0, List.of(xb.a.a, xb.a.c), yb.a);
   }

   public static xb b(String $$0) {
      yb $$1 = yb.a.a(n.h).b(true);
      return new xb($$0, List.of(xb.a.a, xb.a.c), $$1);
   }

   public static xb c(String $$0) {
      yb $$1 = yb.a.a(n.h).b(true);
      return new xb($$0, List.of(xb.a.b, xb.a.c), $$1);
   }

   public static xb d(String $$0) {
      return new xb($$0, List.of(xb.a.b, xb.a.a, xb.a.c), yb.a);
   }

   public xe a(xe $$0, xa.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xe.a(this.c, $$2).c(this.e);
   }

   private xe[] b(xe $$0, xa.a $$1) {
      xe[] $$2 = new xe[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xb.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xb.a> b() {
      return this.d;
   }

   public yb c() {
      return this.e;
   }

   public static enum a implements bab {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xd.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xb.a> f = axw.a($$0 -> $$0.g, values(), axw.a.a);
      public static final Codec<xb.a> d = bab.a(xb.a::values);
      public static final zc<ByteBuf, xb.a> e = za.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xb.a.a i;

      private a(final int $$0, final String $$1, final xb.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xe a(xe $$0, xa.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xe select(xe var1, xa.a var2);
      }
   }
}
