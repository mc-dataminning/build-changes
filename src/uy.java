import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record uy(String b, List<uy.a> c, vy d) {
   public static final Codec<uy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(uy::a),
               uy.a.d.listOf().fieldOf("parameters").forGetter(uy::b),
               vy.b.b.optionalFieldOf("style", vy.a).forGetter(uy::c)
            )
            .apply($$0, uy::new)
   );

   public static uy a(String $$0) {
      return new uy($$0, List.of(uy.a.a, uy.a.c), vy.a);
   }

   public static uy b(String $$0) {
      vy $$1 = vy.a.a(n.h).b(true);
      return new uy($$0, List.of(uy.a.a, uy.a.c), $$1);
   }

   public static uy c(String $$0) {
      vy $$1 = vy.a.a(n.h).b(true);
      return new uy($$0, List.of(uy.a.b, uy.a.c), $$1);
   }

   public static uy d(String $$0) {
      return new uy($$0, List.of(uy.a.b, uy.a.a, uy.a.c), vy.a);
   }

   public vb a(vb $$0, ux.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return vb.a(this.b, $$2).c(this.d);
   }

   private vb[] b(vb $$0, ux.a $$1) {
      vb[] $$2 = new vb[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         uy.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<uy.a> b() {
      return this.c;
   }

   public vy c() {
      return this.d;
   }

   public static enum a implements aut {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<uy.a> d = aut.a(uy.a::values);
      private final String e;
      private final uy.a.a f;

      private a(String $$0, uy.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public vb a(vb $$0, ux.a $$1) {
         vb $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, va.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         vb select(vb var1, ux.a var2);
      }
   }
}
