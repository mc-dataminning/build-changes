import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record wd(String b, List<wd.a> c, xd d) {
   public static final Codec<wd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wd::a),
               wd.a.d.listOf().fieldOf("parameters").forGetter(wd::b),
               xd.b.b.optionalFieldOf("style", xd.a).forGetter(wd::c)
            )
            .apply($$0, wd::new)
   );

   public static wd a(String $$0) {
      return new wd($$0, List.of(wd.a.a, wd.a.c), xd.a);
   }

   public static wd b(String $$0) {
      xd $$1 = xd.a.a(n.h).b(true);
      return new wd($$0, List.of(wd.a.a, wd.a.c), $$1);
   }

   public static wd c(String $$0) {
      xd $$1 = xd.a.a(n.h).b(true);
      return new wd($$0, List.of(wd.a.b, wd.a.c), $$1);
   }

   public static wd d(String $$0) {
      return new wd($$0, List.of(wd.a.b, wd.a.a, wd.a.c), xd.a);
   }

   public wg a(wg $$0, wc.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wg.a(this.b, $$2).c(this.d);
   }

   private wg[] b(wg $$0, wc.a $$1) {
      wg[] $$2 = new wg[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wd.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<wd.a> b() {
      return this.c;
   }

   public xd c() {
      return this.d;
   }

   public static enum a implements aye {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(wf.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<wd.a> d = aye.a(wd.a::values);
      private final String e;
      private final wd.a.a f;

      private a(String $$0, wd.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wg a(wg $$0, wc.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         wg select(wg var1, wc.a var2);
      }
   }
}
