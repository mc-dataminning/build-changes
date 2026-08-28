import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record xi(String b, List<xi.a> c, yi d) {
   public static final Codec<xi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xi::a),
               xi.a.d.listOf().fieldOf("parameters").forGetter(xi::b),
               yi.b.b.optionalFieldOf("style", yi.a).forGetter(xi::c)
            )
            .apply($$0, xi::new)
   );

   public static xi a(String $$0) {
      return new xi($$0, List.of(xi.a.a, xi.a.c), yi.a);
   }

   public static xi b(String $$0) {
      yi $$1 = yi.a.a(n.h).b(true);
      return new xi($$0, List.of(xi.a.a, xi.a.c), $$1);
   }

   public static xi c(String $$0) {
      yi $$1 = yi.a.a(n.h).b(true);
      return new xi($$0, List.of(xi.a.b, xi.a.c), $$1);
   }

   public static xi d(String $$0) {
      return new xi($$0, List.of(xi.a.b, xi.a.a, xi.a.c), yi.a);
   }

   public xl a(xl $$0, xh.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xl.a(this.b, $$2).c(this.d);
   }

   private xl[] b(xl $$0, xh.a $$1) {
      xl[] $$2 = new xl[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xi.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<xi.a> b() {
      return this.c;
   }

   public yi c() {
      return this.d;
   }

   public static enum a implements azp {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(xk.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<xi.a> d = azp.a(xi.a::values);
      private final String e;
      private final xi.a.a f;

      private a(final String $$0, final xi.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xl a(xl $$0, xh.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         xl select(xl var1, xh.a var2);
      }
   }
}
