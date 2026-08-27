import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record uf(String b, List<uf.a> c, vf d) {
   public static final Codec<uf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(uf::a),
               uf.a.d.listOf().fieldOf("parameters").forGetter(uf::b),
               vf.b.b.optionalFieldOf("style", vf.a).forGetter(uf::c)
            )
            .apply($$0, uf::new)
   );

   public static uf a(String $$0) {
      return new uf($$0, List.of(uf.a.a, uf.a.c), vf.a);
   }

   public static uf b(String $$0) {
      vf $$1 = vf.a.a(n.h).b(true);
      return new uf($$0, List.of(uf.a.a, uf.a.c), $$1);
   }

   public static uf c(String $$0) {
      vf $$1 = vf.a.a(n.h).b(true);
      return new uf($$0, List.of(uf.a.b, uf.a.c), $$1);
   }

   public static uf d(String $$0) {
      return new uf($$0, List.of(uf.a.b, uf.a.a, uf.a.c), vf.a);
   }

   public ui a(ui $$0, ue.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return ui.a(this.b, $$2).c(this.d);
   }

   private ui[] b(ui $$0, ue.a $$1) {
      ui[] $$2 = new ui[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         uf.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<uf.a> b() {
      return this.c;
   }

   public vf c() {
      return this.d;
   }

   public static enum a implements atr {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<uf.a> d = atr.a(uf.a::values);
      private final String e;
      private final uf.a.a f;

      private a(String $$0, uf.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public ui a(ui $$0, ue.a $$1) {
         ui $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, uh.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         ui select(ui var1, ue.a var2);
      }
   }
}
