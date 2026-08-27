import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record vc(String b, List<vc.a> c, wc d) {
   public static final Codec<vc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(vc::a),
               vc.a.d.listOf().fieldOf("parameters").forGetter(vc::b),
               wc.b.b.optionalFieldOf("style", wc.a).forGetter(vc::c)
            )
            .apply($$0, vc::new)
   );

   public static vc a(String $$0) {
      return new vc($$0, List.of(vc.a.a, vc.a.c), wc.a);
   }

   public static vc b(String $$0) {
      wc $$1 = wc.a.a(n.h).b(true);
      return new vc($$0, List.of(vc.a.a, vc.a.c), $$1);
   }

   public static vc c(String $$0) {
      wc $$1 = wc.a.a(n.h).b(true);
      return new vc($$0, List.of(vc.a.b, vc.a.c), $$1);
   }

   public static vc d(String $$0) {
      return new vc($$0, List.of(vc.a.b, vc.a.a, vc.a.c), wc.a);
   }

   public vf a(vf $$0, vb.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return vf.a(this.b, $$2).c(this.d);
   }

   private vf[] b(vf $$0, vb.a $$1) {
      vf[] $$2 = new vf[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         vc.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<vc.a> b() {
      return this.c;
   }

   public wc c() {
      return this.d;
   }

   public static enum a implements avk {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<vc.a> d = avk.a(vc.a::values);
      private final String e;
      private final vc.a.a f;

      private a(String $$0, vc.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public vf a(vf $$0, vb.a $$1) {
         vf $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, ve.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         vf select(vf var1, vb.a var2);
      }
   }
}
