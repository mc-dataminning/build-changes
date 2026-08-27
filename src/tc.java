import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record tc(String b, List<tc.a> c, ub d) {
   public static final Codec<tc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(tc::a),
               tc.a.d.listOf().fieldOf("parameters").forGetter(tc::b),
               ub.b.optionalFieldOf("style", ub.a).forGetter(tc::c)
            )
            .apply($$0, tc::new)
   );

   public static tc a(String $$0) {
      return new tc($$0, List.of(tc.a.a, tc.a.c), ub.a);
   }

   public static tc b(String $$0) {
      ub $$1 = ub.a.a(n.h).b(true);
      return new tc($$0, List.of(tc.a.a, tc.a.c), $$1);
   }

   public static tc c(String $$0) {
      ub $$1 = ub.a.a(n.h).b(true);
      return new tc($$0, List.of(tc.a.b, tc.a.c), $$1);
   }

   public static tc d(String $$0) {
      return new tc($$0, List.of(tc.a.b, tc.a.a, tc.a.c), ub.a);
   }

   public tf a(tf $$0, tb.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return tf.a(this.b, $$2).c(this.d);
   }

   private tf[] b(tf $$0, tb.a $$1) {
      tf[] $$2 = new tf[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         tc.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<tc.a> b() {
      return this.c;
   }

   public ub c() {
      return this.d;
   }

   public static enum a implements ash {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<tc.a> d = ash.a(tc.a::values);
      private final String e;
      private final tc.a.a f;

      private a(String $$0, tc.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tf a(tf $$0, tb.a $$1) {
         tf $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, te.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         tf select(tf var1, tb.a var2);
      }
   }
}
