import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record va(String b, List<va.a> c, wa d) {
   public static final Codec<va> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(va::a),
               va.a.d.listOf().fieldOf("parameters").forGetter(va::b),
               wa.b.b.optionalFieldOf("style", wa.a).forGetter(va::c)
            )
            .apply($$0, va::new)
   );

   public static va a(String $$0) {
      return new va($$0, List.of(va.a.a, va.a.c), wa.a);
   }

   public static va b(String $$0) {
      wa $$1 = wa.a.a(n.h).b(true);
      return new va($$0, List.of(va.a.a, va.a.c), $$1);
   }

   public static va c(String $$0) {
      wa $$1 = wa.a.a(n.h).b(true);
      return new va($$0, List.of(va.a.b, va.a.c), $$1);
   }

   public static va d(String $$0) {
      return new va($$0, List.of(va.a.b, va.a.a, va.a.c), wa.a);
   }

   public vd a(vd $$0, uz.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return vd.a(this.b, $$2).c(this.d);
   }

   private vd[] b(vd $$0, uz.a $$1) {
      vd[] $$2 = new vd[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         va.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<va.a> b() {
      return this.c;
   }

   public wa c() {
      return this.d;
   }

   public static enum a implements ave {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<va.a> d = ave.a(va.a::values);
      private final String e;
      private final va.a.a f;

      private a(String $$0, va.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public vd a(vd $$0, uz.a $$1) {
         vd $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, vc.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         vd select(vd var1, uz.a var2);
      }
   }
}
