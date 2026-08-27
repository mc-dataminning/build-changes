import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record tk(String b, List<tk.a> c, uj d) {
   public static final Codec<tk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(tk::a),
               tk.a.d.listOf().fieldOf("parameters").forGetter(tk::b),
               uj.b.optionalFieldOf("style", uj.a).forGetter(tk::c)
            )
            .apply($$0, tk::new)
   );

   public static tk a(String $$0) {
      return new tk($$0, List.of(tk.a.a, tk.a.c), uj.a);
   }

   public static tk b(String $$0) {
      uj $$1 = uj.a.a(n.h).b(true);
      return new tk($$0, List.of(tk.a.a, tk.a.c), $$1);
   }

   public static tk c(String $$0) {
      uj $$1 = uj.a.a(n.h).b(true);
      return new tk($$0, List.of(tk.a.b, tk.a.c), $$1);
   }

   public static tk d(String $$0) {
      return new tk($$0, List.of(tk.a.b, tk.a.a, tk.a.c), uj.a);
   }

   public tn a(tn $$0, tj.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return tn.a(this.b, $$2).c(this.d);
   }

   private tn[] b(tn $$0, tj.a $$1) {
      tn[] $$2 = new tn[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         tk.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<tk.a> b() {
      return this.c;
   }

   public uj c() {
      return this.d;
   }

   public static enum a implements asr {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<tk.a> d = asr.a(tk.a::values);
      private final String e;
      private final tk.a.a f;

      private a(String $$0, tk.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tn a(tn $$0, tj.a $$1) {
         tn $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, tm.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         tn select(tn var1, tj.a var2);
      }
   }
}
