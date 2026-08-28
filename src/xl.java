import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record xl(String b, List<xl.a> c, yl d) {
   public static final Codec<xl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xl::a),
               xl.a.d.listOf().fieldOf("parameters").forGetter(xl::b),
               yl.b.b.optionalFieldOf("style", yl.a).forGetter(xl::c)
            )
            .apply($$0, xl::new)
   );

   public static xl a(String $$0) {
      return new xl($$0, List.of(xl.a.a, xl.a.c), yl.a);
   }

   public static xl b(String $$0) {
      yl $$1 = yl.a.a(n.h).b(true);
      return new xl($$0, List.of(xl.a.a, xl.a.c), $$1);
   }

   public static xl c(String $$0) {
      yl $$1 = yl.a.a(n.h).b(true);
      return new xl($$0, List.of(xl.a.b, xl.a.c), $$1);
   }

   public static xl d(String $$0) {
      return new xl($$0, List.of(xl.a.b, xl.a.a, xl.a.c), yl.a);
   }

   public xo a(xo $$0, xk.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xo.a(this.b, $$2).c(this.d);
   }

   private xo[] b(xo $$0, xk.a $$1) {
      xo[] $$2 = new xo[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xl.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<xl.a> b() {
      return this.c;
   }

   public yl c() {
      return this.d;
   }

   public static enum a implements azs {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(xn.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<xl.a> d = azs.a(xl.a::values);
      private final String e;
      private final xl.a.a f;

      private a(final String $$0, final xl.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xo a(xo $$0, xk.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         xo select(xo var1, xk.a var2);
      }
   }
}
