import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record wf(String b, List<wf.a> c, xf d) {
   public static final Codec<wf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wf::a),
               wf.a.d.listOf().fieldOf("parameters").forGetter(wf::b),
               xf.b.b.optionalFieldOf("style", xf.a).forGetter(wf::c)
            )
            .apply($$0, wf::new)
   );

   public static wf a(String $$0) {
      return new wf($$0, List.of(wf.a.a, wf.a.c), xf.a);
   }

   public static wf b(String $$0) {
      xf $$1 = xf.a.a(n.h).b(true);
      return new wf($$0, List.of(wf.a.a, wf.a.c), $$1);
   }

   public static wf c(String $$0) {
      xf $$1 = xf.a.a(n.h).b(true);
      return new wf($$0, List.of(wf.a.b, wf.a.c), $$1);
   }

   public static wf d(String $$0) {
      return new wf($$0, List.of(wf.a.b, wf.a.a, wf.a.c), xf.a);
   }

   public wi a(wi $$0, we.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wi.a(this.b, $$2).c(this.d);
   }

   private wi[] b(wi $$0, we.a $$1) {
      wi[] $$2 = new wi[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wf.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<wf.a> b() {
      return this.c;
   }

   public xf c() {
      return this.d;
   }

   public static enum a implements ayg {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(wh.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<wf.a> d = ayg.a(wf.a::values);
      private final String e;
      private final wf.a.a f;

      private a(String $$0, wf.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wi a(wi $$0, we.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         wi select(wi var1, we.a var2);
      }
   }
}
