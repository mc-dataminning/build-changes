import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record wr(String b, List<wr.a> c, xr d) {
   public static final Codec<wr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wr::a),
               wr.a.d.listOf().fieldOf("parameters").forGetter(wr::b),
               xr.b.b.optionalFieldOf("style", xr.a).forGetter(wr::c)
            )
            .apply($$0, wr::new)
   );

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
      return wu.a(this.b, $$2).c(this.d);
   }

   private wu[] b(wu $$0, wq.a $$1) {
      wu[] $$2 = new wu[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wr.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<wr.a> b() {
      return this.c;
   }

   public xr c() {
      return this.d;
   }

   public static enum a implements azc {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(wt.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<wr.a> d = azc.a(wr.a::values);
      private final String e;
      private final wr.a.a f;

      private a(final String $$0, final wr.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wu a(wu $$0, wq.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         wu select(wu var1, wq.a var2);
      }
   }
}
