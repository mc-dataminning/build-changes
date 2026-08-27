import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record vd(String b, List<vd.a> c, wd d) {
   public static final Codec<vd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(vd::a),
               vd.a.d.listOf().fieldOf("parameters").forGetter(vd::b),
               wd.b.b.optionalFieldOf("style", wd.a).forGetter(vd::c)
            )
            .apply($$0, vd::new)
   );

   public static vd a(String $$0) {
      return new vd($$0, List.of(vd.a.a, vd.a.c), wd.a);
   }

   public static vd b(String $$0) {
      wd $$1 = wd.a.a(n.h).b(true);
      return new vd($$0, List.of(vd.a.a, vd.a.c), $$1);
   }

   public static vd c(String $$0) {
      wd $$1 = wd.a.a(n.h).b(true);
      return new vd($$0, List.of(vd.a.b, vd.a.c), $$1);
   }

   public static vd d(String $$0) {
      return new vd($$0, List.of(vd.a.b, vd.a.a, vd.a.c), wd.a);
   }

   public vg a(vg $$0, vc.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return vg.a(this.b, $$2).c(this.d);
   }

   private vg[] b(vg $$0, vc.a $$1) {
      vg[] $$2 = new vg[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         vd.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<vd.a> b() {
      return this.c;
   }

   public wd c() {
      return this.d;
   }

   public static enum a implements avl {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<vd.a> d = avl.a(vd.a::values);
      private final String e;
      private final vd.a.a f;

      private a(String $$0, vd.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public vg a(vg $$0, vc.a $$1) {
         vg $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, vf.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         vg select(vg var1, vc.a var2);
      }
   }
}
