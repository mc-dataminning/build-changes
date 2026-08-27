import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record wu(String b, List<wu.a> c, xu d) {
   public static final Codec<wu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wu::a),
               wu.a.d.listOf().fieldOf("parameters").forGetter(wu::b),
               xu.b.b.optionalFieldOf("style", xu.a).forGetter(wu::c)
            )
            .apply($$0, wu::new)
   );

   public static wu a(String $$0) {
      return new wu($$0, List.of(wu.a.a, wu.a.c), xu.a);
   }

   public static wu b(String $$0) {
      xu $$1 = xu.a.a(n.h).b(true);
      return new wu($$0, List.of(wu.a.a, wu.a.c), $$1);
   }

   public static wu c(String $$0) {
      xu $$1 = xu.a.a(n.h).b(true);
      return new wu($$0, List.of(wu.a.b, wu.a.c), $$1);
   }

   public static wu d(String $$0) {
      return new wu($$0, List.of(wu.a.b, wu.a.a, wu.a.c), xu.a);
   }

   public wx a(wx $$0, wt.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wx.a(this.b, $$2).c(this.d);
   }

   private wx[] b(wx $$0, wt.a $$1) {
      wx[] $$2 = new wx[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wu.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<wu.a> b() {
      return this.c;
   }

   public xu c() {
      return this.d;
   }

   public static enum a implements ayx {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(ww.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<wu.a> d = ayx.a(wu.a::values);
      private final String e;
      private final wu.a.a f;

      private a(String $$0, wu.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public wx a(wx $$0, wt.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         wx select(wx var1, wt.a var2);
      }
   }
}
