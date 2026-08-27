import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record vn(String b, List<vn.a> c, wn d) {
   public static final Codec<vn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(vn::a),
               vn.a.d.listOf().fieldOf("parameters").forGetter(vn::b),
               wn.b.b.optionalFieldOf("style", wn.a).forGetter(vn::c)
            )
            .apply($$0, vn::new)
   );

   public static vn a(String $$0) {
      return new vn($$0, List.of(vn.a.a, vn.a.c), wn.a);
   }

   public static vn b(String $$0) {
      wn $$1 = wn.a.a(n.h).b(true);
      return new vn($$0, List.of(vn.a.a, vn.a.c), $$1);
   }

   public static vn c(String $$0) {
      wn $$1 = wn.a.a(n.h).b(true);
      return new vn($$0, List.of(vn.a.b, vn.a.c), $$1);
   }

   public static vn d(String $$0) {
      return new vn($$0, List.of(vn.a.b, vn.a.a, vn.a.c), wn.a);
   }

   public vq a(vq $$0, vm.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return vq.a(this.b, $$2).c(this.d);
   }

   private vq[] b(vq $$0, vm.a $$1) {
      vq[] $$2 = new vq[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         vn.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<vn.a> b() {
      return this.c;
   }

   public wn c() {
      return this.d;
   }

   public static enum a implements axc {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(vp.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<vn.a> d = axc.a(vn.a::values);
      private final String e;
      private final vn.a.a f;

      private a(String $$0, vn.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public vq a(vq $$0, vm.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         vq select(vq var1, vm.a var2);
      }
   }
}
