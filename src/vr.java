import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record vr(String b, List<vr.a> c, wr d) {
   public static final Codec<vr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(vr::a),
               vr.a.d.listOf().fieldOf("parameters").forGetter(vr::b),
               wr.b.b.optionalFieldOf("style", wr.a).forGetter(vr::c)
            )
            .apply($$0, vr::new)
   );

   public static vr a(String $$0) {
      return new vr($$0, List.of(vr.a.a, vr.a.c), wr.a);
   }

   public static vr b(String $$0) {
      wr $$1 = wr.a.a(n.h).b(true);
      return new vr($$0, List.of(vr.a.a, vr.a.c), $$1);
   }

   public static vr c(String $$0) {
      wr $$1 = wr.a.a(n.h).b(true);
      return new vr($$0, List.of(vr.a.b, vr.a.c), $$1);
   }

   public static vr d(String $$0) {
      return new vr($$0, List.of(vr.a.b, vr.a.a, vr.a.c), wr.a);
   }

   public vu a(vu $$0, vq.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return vu.a(this.b, $$2).c(this.d);
   }

   private vu[] b(vu $$0, vq.a $$1) {
      vu[] $$2 = new vu[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         vr.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<vr.a> b() {
      return this.c;
   }

   public wr c() {
      return this.d;
   }

   public static enum a implements axq {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(vt.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<vr.a> d = axq.a(vr.a::values);
      private final String e;
      private final vr.a.a f;

      private a(String $$0, vr.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public vu a(vu $$0, vq.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         vu select(vu var1, vq.a var2);
      }
   }
}
